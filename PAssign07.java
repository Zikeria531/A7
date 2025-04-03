package ch14;

/*
* File: PAssign07.java
* Class: CSCI 1302
* Author: Zikeria Mack
* Created on: April 3, 2025
* Last Modified: April 3, 2025
* Description: Create visual
*/

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
	BorderPane securityKeyPad = new BorderPane();
		
		// create a KeyPadPane
		 //KeyPadPane keyPane = new KeyPadPane(); // use for default layout
		 //KeyPadPane keyPane = new KeyPadPane(true); // use this for phone layout
		 KeyPadPanePlus keyPane = new KeyPadPanePlus(); // using custom version
		 
		 keyPane.setAlignment(Pos.CENTER); // this will center the keypad
		 
		 /* to get the vbox method you need to create an instance of the class its in
		 but its already defined as keyPane.**/
		 
		 // get the vbox method
		 VBox vBox = keyPane.getVBox();
		 vBox.setAlignment(javafx.geometry.Pos.CENTER); // Center the TextField
		 // Once the textfield is centered, you can add the keyPane to the vbox
		 vBox.getChildren().add(keyPane);
		
		// add vBox to BorderPane
		securityKeyPad.setCenter(vBox);
		
		// create your scene width, height
		Scene scene = new Scene(securityKeyPad, 300, 350);
		
		primaryStage.setTitle("Security KeyPad"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	class KeyPadPanePlus extends KeyPadPane {
		private TextField pinField; // declare text field
		
		public KeyPadPanePlus() {
			super(); // Call the constructor of KeyPadPane
			
			// change blank buttons
			btnBlank1.setText("Clear");
	        btnBlank2.setText("Enter");
	        
	        // change color of buttons text
	        btnBlank1.setStyle("-fx-text-fill: red");
	        btnBlank2.setStyle("-fx-text-fill: green");
	        
	        // make buttons bigger (width, height)
	        btn1.setPrefSize(60, 60);
	        btn2.setPrefSize(60, 60);
	        btn3.setPrefSize(60, 60);
	        btn4.setPrefSize(60, 60);
	        btn5.setPrefSize(60, 60);
	        btn6.setPrefSize(60, 60);
	        btn7.setPrefSize(60, 60);
	        btn8.setPrefSize(60, 60);
	        btn9.setPrefSize(60, 60);
	        btn0.setPrefSize(60, 60);
	        btnBlank1.setPrefSize(60, 60);
	        btnBlank2.setPrefSize(60, 60);
	        
	        // make more button text bigger
	        btn1.setFont(new Font(18));
	        btn2.setFont(new Font(18));
	        btn3.setFont(new Font(18));
	        btn4.setFont(new Font(18));
	        btn5.setFont(new Font(18));
	        btn6.setFont(new Font(18));
	        btn7.setFont(new Font(18));
	        btn8.setFont(new Font(18));
	        btn9.setFont(new Font(18));
	        btn0.setFont(new Font(18));
	        btnBlank1.setFont(new Font(15));
	        btnBlank2.setFont(new Font(15));
			
			// Create a TextField for PIN input
	        pinField = new TextField("Enter Pin");
	        pinField.setEditable(false); // this will Prevent manual input
	        pinField.setFont(new Font("Arial", 17));
	        pinField.setMaxWidth(180); // this sets the width of the text field
	        pinField.setPrefHeight(45); // this sets the height
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
