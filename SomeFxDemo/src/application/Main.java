package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Pane loadMainPane(String path) throws IOException{
		FXMLLoader loader=new FXMLLoader();
		Pane mainPane=(Pane)loader.load(getClass().getResourceAsStream(path));
		return mainPane;
	}
	@Override
	public void start(Stage primaryStage) {
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
