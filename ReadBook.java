import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadBook {
	// Book b;

	public static void main(String[] args) {

	}

	public String Search(String keyword) {
		String invalid = "Nothinhg found. Please try again.";
		ArrayList<Book> bl = new ArrayList<>();
		try {
			File file = new File("bookInventory.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				String[] info = st.split(",");
				Book b = new Book(info[0], info[1], info[2], Boolean.parseBoolean(info[3]));
				if (keyword.equalsIgnoreCase(b.getTitle()) 
				  ||keyword.equalsIgnoreCase(b.getGenre())
				  ||keyword.equalsIgnoreCase(b.getAuthor())) {
					bl.add(b);
				}
				else {
					return invalid ;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bl.toString().replace('[',' ').replace(']',' ').replace(", ","").trim();  

	}
}
