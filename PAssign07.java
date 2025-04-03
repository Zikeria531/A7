package ch14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color; // this allows color to show
import javafx.scene.text.Font; // this allows font to show
import javafx.stage.Stage;
import ch14.KeyPadPane;

public class PAssign07 extends Application{

	@Override // always override
	public void start(Stage primaryStage) {
		//
	BorderPane mainPane = new BorderPane();
		
		// create a KeyPadPane
		// KeyPadPane keyPane = new KeyPadPane(); // use for default layout
		 KeyPadPane keyPane = new KeyPadPane(true); // use this for phone layout
		// KeyPadPanePlus keyPane = new KeyPadPanePlus(); // using custom version
		 
		 keyPane.setAlignment(Pos.CENTER); // this will center the keypad
		 
		 // to get the vbox method you need to create an instance of the class its in
		 KeyPadPanePlus keyPlus = new KeyPadPanePlus();
		 // get the vbox method
		 VBox vBox = keyPlus.getVBox();
		 vBox.setAlignment(javafx.geometry.Pos.CENTER); // Center the TextField
		 // Once the textfield is centered, you can add the keypad to the vbox
		 vBox.getChildren().add(keyPane);
		
		// add vBox to BorderPane
		mainPane.setCenter(vBox);
		
		// create your scene (400 x 400 to clearly show KeyPadPane)
		Scene scene = new Scene(mainPane, 400, 400);
		
		primaryStage.setTitle("Test KeyPadPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	class KeyPadPanePlus extends KeyPadPane {
		private TextField pinField; // declare text field
		
		public KeyPadPanePlus() {
			super(); // Call the constructor of KeyPadPane
			
			
			// Create a TextField for PIN input
	        pinField = new TextField("Enter Pin");
	        pinField.setEditable(false); // this will Prevent manual input
	        pinField.setFont(new Font("Arial", 13));
	        pinField.setMaxWidth(70); // this sets the width of the text field
	        pinField.setAlignment(Pos.CENTER); // Center text inside TextField
	        pinField.setStyle("-fx-background-color: white;"); // the background will be white
	        pinField.setStyle("-fx-text-fill: black;"); // the text color will be blue
	        
	        

	    }
		// to add text field to a vbox a get method is required
        public VBox getVBox() {
        	// Create a vbox to add the text field
			VBox vbox = new VBox();
			// Add text field to the vbox
			vbox.getChildren().add(pinField);
			
			return vbox;
        }
	    
	}
	public static void main(String[] args) {
		launch(args); // this is needed for your code to launch (for anything to pop up)

	}

}
