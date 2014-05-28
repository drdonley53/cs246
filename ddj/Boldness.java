import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;
/**
 *
 * @author daviddonley
 */
public class Boldness extends Application{
    
    @Override
	public void start(Stage primaryStage) {
	primaryStage.setTitle("GLORY");
	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setHgap(20);
	grid.setVgap(20);
	grid.setPadding(new Insets(10, 10, 10, 10));
       
	Label userName = new Label("Enter Runnable:");
	//userName.setAlignment(Pos.TOP_LEFT);
	grid.add(userName, 0, 0);
       
	TextField userTextField = new TextField();
	//userName.setAlignment(Pos.TOP_RIGHT);
	grid.add(userTextField, 1, 0);
       
	Label run = new Label("Runnables");
	//run.setAlignment(Pos.TOP_LEFT);
	grid.add(run, 0, 3);
       
	Label RunThr = new Label("Running Threads");
	grid.add(RunThr, 1, 3);
       
	ListView<String> list = new ListView<String>();
	list.setPrefSize(100, 300);
	grid.add(list, 0, 4);
       
       
	ListView<String> list2 = new ListView<String>();
	list.setPrefSize(100, 300);
	grid.add(list2, 1, 4);
       
	Button rbtn = new Button("Start");
	HBox rbBtn = new HBox(10);
	rbBtn.setAlignment(Pos.BOTTOM_LEFT);
	rbBtn.getChildren().add(rbtn);
	grid.add(rbBtn, 1, 5);
       
	Button btn = new Button("Stop");
	HBox hbBtn = new HBox(10);
	hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
	hbBtn.getChildren().add(btn);
	grid.add(hbBtn, 2, 5);
       
	final Text actiontarget = new Text();
	grid.add(actiontarget, 1, 6);
       
	rbtn.setOnAction(new EventHandler<ActionEvent>(){
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
       
	btn.setOnAction(new EventHandler<ActionEvent>(){
           @Override
	       public void handle(ActionEvent e){
               
               int index = list.getSelectionModel().getSelectedIndex();
	       if(index >= 1)
		   {                 
		       list.getItems().remove(index);
		   }
           }
	    });
       
       
       
	Scene scene = new Scene(grid, 700, 750);
	primaryStage.setScene(scene);
	primaryStage.show();
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
