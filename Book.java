
public class Book {

	protected String title;
	protected String author;
	protected String genre;
	protected boolean inStock = true;
	Book(String _title,String _author,String _genre, boolean _inStock){
		title = _title;
		author =_author;
		genre = _genre;
		inStock = _inStock;
	}
	public String toString() {
	    return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nStatus: " + inStock + "\n\n";
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre() {
		return genre;
	}
}
