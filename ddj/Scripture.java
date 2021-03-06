package favorite.scriptures;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author daviddonley
 */
public class FavoriteScriptures extends Application {
    
    @Override
	public void start(Stage primaryStage) {
	primaryStage.setTitle("JavaFX Welcome");
	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setPadding(new Insets(25, 25, 25, 25));
	Text scenetitle = new Text("Welcome");
	scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	grid.add(scenetitle, 0, 0, 2, 1);
       
	Label userName = new Label("Scriptrue");
	grid.add(userName, 0, 1);
       
	TextField userTextField = new TextField();
	grid.add(userTextField, 1, 1);
       
	ListView<String> list = new ListView<String>();
	list.setPrefSize(200, 400);
	grid.add(list, 10, 0);
       
       
	Button rbtn = new Button("Remove");
	HBox rbBtn = new HBox(10);
	rbBtn.setAlignment(Pos.BOTTOM_LEFT);
	rbBtn.getChildren().add(rbtn);
	grid.add(rbBtn, 1, 4);
       
	Button btn = new Button("ADD");
	HBox hbBtn = new HBox(10);
	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	hbBtn.getChildren().add(btn);
	grid.add(hbBtn, 1, 4);
       
	final Text actiontarget = new Text();
	grid.add(actiontarget, 1, 6);
       
	btn.setOnAction(new EventHandler<ActionEvent>(){
           @Override
	       public void handle(ActionEvent e){
               String scripture = userTextField.getText();
               if(scripture.equals(""))
		   {
		   }
               else
		   {
		       list.getItems().add(scripture);
		       userTextField.clear();
		       userTextField.requestFocus();
		   }
           }
	    });
       
	rbtn.setOnAction(new EventHandler<ActionEvent>(){
           @Override
	       public void handle(ActionEvent e){
               
               int index = list.getSelectionModel().getSelectedIndex();
	       if(index >= 1)
		   {                 
		       list.getItems().remove(index);
		   }
           }
	    });
       
       
       
	Scene scene = new Scene(grid, 1000, 1000);
	primaryStage.setScene(scene);
	primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
