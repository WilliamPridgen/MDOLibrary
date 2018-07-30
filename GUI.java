import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;


import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class GUI extends Application {

	Button button;
	Button button2;
	Button button3;
	TextField tf;
	ComboBox cb;
	CheckBox chb;
	CheckBox chb2;

	HBox hb;
	HBox hb2;
	VBox vb;
	TextArea ta;	
	ReadBook bk = new ReadBook();
	
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("MDO Library Inventory");
		 
		ArrayList<CheckBox> chl = new ArrayList<>();
		chb = new CheckBox("Fiction");
		//chb.setSelected(true);
		chb2 = new CheckBox("NonFiction");
        //chb2.setSelected(true);
       

		chl.add(chb);
		chl.add(chb2);

		
		cb = new ComboBox();
		
    	for(int i = 0; i<chl.size();i++) {
		cb.getItems().addAll(chl.get(i));
    	}
		cb.setValue("Search by Genre");
		
		
		ta =  new TextArea();
		ta.setMaxSize(270, 150);
		
		hb = new HBox();
		hb2 = new HBox();		
		vb = new VBox();
		
		
		tf = new TextField("Search by title or author ");
	    tf.setPrefWidth(245);
		
		
		button = new Button();
		button.setText("Search");
		button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	ta.setText(bk.Search(tf.getText()));
            }
        });
		
		button2 = new Button();
		button2.setText("Search");
		button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	for(int i = 0; i<chl.size();i++) {
          //  if(	cb.getItems() ==
            	}
            }
        });

		button3 = new Button();
		button3.setText("Checkout");
		button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            //logic
            public void handle(ActionEvent event) {

            }
        });
		
		BorderPane bp = new BorderPane();
		hb.getChildren().addAll(tf,button);
		hb2.getChildren().addAll(cb,button2);
		vb.getChildren().addAll(hb,hb2);

		bp.setTop(vb);
		bp.setCenter(ta);
		bp.setBottom(button3);

		Scene scene = new Scene(bp, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String args[]) {
		launch(args);
	}
}
