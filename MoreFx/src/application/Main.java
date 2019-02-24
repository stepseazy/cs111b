package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	Stage window;
	Scene scene1, scene2;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window=primaryStage;
			Label label1=new Label("welcome to scene1");
			Button btn1=new Button("Got to scene2");
			btn1.setOnAction(e->window.setScene(scene2));
				
			VBox layout1=new VBox(20);
			layout1.getChildren().addAll(label1,btn1);
			scene1=new Scene(layout1, 200, 200);
			Button btn2=new Button("This sene is borign go back to scen2");
					btn2.setOnAction(e->window.setScene(scene1));
			StackPane layout2=new StackPane();
			layout2.getChildren().add(btn2);
			scene2=new Scene(layout2, 200,200);
			window.setScene(scene1);;
			window.setTitle("swapng scene");
			
			window.show();
		} catch(Exception e) {;
		
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
