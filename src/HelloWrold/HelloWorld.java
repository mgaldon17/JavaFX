package HelloWrold;
import java.awt.GridLayout;
import java.util.Hashtable;

import javafx.geometry.Insets; // Has to be this one !!!

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 
@SuppressWarnings("restriction")

public class HelloWorld extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage primaryStage) {
    	
    	
        primaryStage.setTitle("JavaFX Welcome! ");
        
        
        
        //Add gridPane 
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        
        Insets value = new Insets(25, 25, 25, 25);
        grid.setPadding(value);
        
        //Controls

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        
        grid.add(userTextField, 1, 1); // Este !!!
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField(); // Este !!!
        grid.add(pwBox, 1, 2);
        
        //Create Button Sign in 
        
        Button btn = new Button("Sign in");
        HBox hBtn = new HBox(3);
        hBtn.setAlignment(Pos.BOTTOM_CENTER);
        hBtn.getChildren().add(btn);
        grid.add(hBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        
        
        //Button On Action 
        
        @SuppressWarnings("rawtypes")
		EventHandler event = new EventHandler <ActionEvent>() {
        	
        	

			@Override
			public void handle(ActionEvent event ) {
				
				dict dt = new dict();
				
				Hashtable<String, String> hs = new Hashtable<String, String>();
				
				
				if(pwBox.equals(dt.h) && userTextField.equals(dt.h)) {
					
					System.out.println("Pass OK");
					
				}else{
					
					System.out.println("Pass NOT OK");
				}
				
				//Button pressed
				 actiontarget.setFill(Color.FIREBRICK);
	             actiontarget.setText("Sign in button pressed");
	             
			}
         };
        
        btn.setOnAction(event);
        
        //Create  and show Scene 
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}