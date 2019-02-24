package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button btn=new Button();
			btn.setText("Hell jfx");
			btn.setOnAction(
					new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {
							System.out.println("You clicked the btn");
							
						}
						
					}
	
			);
			StackPane root=new StackPane();
			root.getChildren().add(btn);
			Scene scene=new Scene(root, 300,250);
			primaryStage.setTitle("hello world jfx");
			primaryStage.setScene(scene);
			primaryStage.show();
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.setFill(Color.BROWN);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
