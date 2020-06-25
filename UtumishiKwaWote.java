import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.geometry.insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UtumishiKwaWote extends Application{
	
	public static void main(String[]args) {
		launch(args);
	}
	@Override
	public void start(Stage stage){
		
		//step 1: Creating Labels	
		//creating label FirstName
		Text text1 = new Text("FirstName");
		
		//creating label LastName
		Text text2 = new Text("LastName");
		
		//creating label ID Number
		Text text3 = new Text("ID Number");
		
		//creating label KRA Pin
		Text text4 = new Text("KRA Pin");
		
		//creating label age
		Text text5 = new Text("Age");
		
		//create label phone number
		Text text6 = new Text("PhoneNumber");
		
		//creating label email addressress
		Text text7 = new Text ("EmailAddress");
		
		//create label password
		Text text8 = new Text ("EnterPassword");
		
		//create label Registered
		Text text9 = new Text("Registered");
		
		
		
		//step 2: Creating Text Fields
		//creating Text Field for FirstName
		TextField textField1 = new TextField();
		
		//creating Text Field for LastName
		TextField textField2 = new TextField();
		
		//creating Text Field for ID Number
		TextField textField3 = new TextField();
		 
		//creating Text Field for KRA Pin
		TextField textField4 = new TextField();
		
		//creating Text Field for Age
		TextField textField5 = new TextField();
		
		//creating Text Field for PhoneNumber
		TextField textField6 = new TextField();
		
		//creating Text Field for EmailAddress
		TextField textField7 = new TextField();
		
		//creating Text Field for Password
		TextField textField8 = new TextField();
		
		
		
		//step3: Creating Combo Box
		//create combo Box for User Registeration
		ComboBox comboBox = new ComboBox();
			
			
			
		//Step4: Creating buttons
		Button button1 = new Button("Register");
		Button button2 = new Button("Reject");
		Button button3 = new Button ("Complete Registeration");
		Label label9 = new Label("Thank you for registering for Utumishi Kwa Wote Application");
		
		
		
		//Step5: Creating a GridPane
		GridPane gridPane = new GridPane();
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
			@Override
			public void handle (MouseEvent e){
				label9.setStyle("-fx-text-fill:white; -fx-font:normal bold 15px 'serif';");
				gridPane.add(label9,0,4);
				System.out.println("Thank you for registering for Utumishi Kwa Wote Application");
				button3.setStyle("-fx-background-color: #c4b49c;-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
				gridPane.setStyle("-fx-background-color:grey;");
			}
		};
		button3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		//Step 6: Setting the size of the pane
		gridPane.setMinSize(500,300);
		
		//Step 7: Setting the padding 
		gridPane.setPadding(new Insets (10, 10, 10,10));
		
		//Step 8: setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		
		//Step 9: setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);
		
		//Step 10: Arranging all the nodes in the grid 
		gridPane.add(text1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(text3, 0, 2);
		gridPane.add(textField3, 1, 2);
		gridPane.add(text4, 0, 3);
		gridPane.add(textField4, 1, 3);
		gridPane.add(text5, 0, 4);
		gridPane.add(textField5, 1, 4);
		gridPane.add(text6, 0, 5);
		gridPane.add(textField6, 1, 5);
		gridPane.add(text7, 0, 6);
		gridPane.add(textField7, 1, 6);
		gridPane.add(text8, 0, 7);
		gridPane.add(textField8, 1, 7);
		gridPane.add(button1, 0, 2);
		gridPane.add(button2, 1, 2);
		gridPane.add(comboBox, 1, 3);
		gridPane.add(button3, 0, 5);
		
		//Step 11: Styling nodes
		button1.setStyle("-fx-background-color: blue; -fx-text-fill:white; -fx-fx-font: normal bold 15px 'serif';");
		button2.setStyle("-fx-background-color: blue; -fx-text-fill:white; -fx-fx-font: normal bold 15px 'serif';");
		button3.setStyle("-fx-background-color: blue; -fx-text-fill:white; -fx-fx-font: normal bold 15px 'serif';");
			
		text1.setStyle(-fx-font: normal bold 20px 'serif');
		text2.setStyle(-fx-font: normal bold 20px 'serif');
		gridPane.setStyle("-fx-background-color: Skyblue;");
		
		
		
		//Step 12: creating a scene object
		Scene scene = new Scene(gridPane);
		
		
		
		//step13: Setting title to the stage
		stage.setTitle("UtumishiKwaWote");
		
		//Adding Scene to the stage 
		stage.setScene(scene);
		
		//Displaying the contents of the stage
		stage.show();
	}
}
}
