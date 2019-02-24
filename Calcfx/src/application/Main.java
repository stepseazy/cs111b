package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	TextField tfNum1;
	TextField tfNum2;
	Button btnAddition;
	Button btnSubtraction;
	Button btnMultiply;
	Button btnDivide;
	Button btnClear;
	Label lblAnswer;
	GridPane root;
	@Override
	public void start(Stage primaryStage) {
		try {
			tfNum1=new TextField();
			 tfNum2=new TextField();
			 btnAddition=new Button("+");
			 btnSubtraction=new Button("-");
			 btnMultiply=new Button("*");
			 btnDivide=new Button("/");
			 btnClear=new Button("clear");
			 lblAnswer=new Label("?");
			 root = new GridPane();
			 root.setAlignment(Pos.CENTER);
			 root.setHgap(10);
			 root.setVgap(10);
			 root.add(btnDivide, 0, 0);
			 root.add(btnMultiply, 1, 0);
			 root.add(btnAddition, 0, 1);
			 root.add(btnSubtraction, 1, 1);
			 root.add(btnClear, 0, 4, 2,  1);
			 root.add(lblAnswer, 0,3, 2, 1);
			 root.add(tfNum1, 0,2);
			 root.add(tfNum2, 1,2);
			 setWidths();
			attachCode(); 
			 Scene scene=new Scene(root, 300,250);
			 primaryStage.setTitle("Calculator 1.0");
			 primaryStage.setScene(scene);
			 primaryStage.show();
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	private void setWidths() {
		
		tfNum1.setPrefWidth(70);
		tfNum2.setPrefWidth(70);
		btnAddition.setPrefWidth(70);
		btnSubtraction.setPrefWidth(70);
		btnMultiply.setPrefWidth(70);
		btnDivide.setPrefWidth(70);
		btnClear.setPrefWidth(150);
		lblAnswer.setPrefWidth(150);
//		lblAnswer.setStyle("-fx-border-color:#---;-fx-border:5px;");
	}
	public void attachCode() {
		
root.getChildren().forEach(c->{
	try {
		((Button)c).setOnAction(e->btnCode(e));
	}catch(Exception e){
		
	}
			
		});
		
//		btnAddition.setOnAction(e->btnCode(e));
//		btnSubtraction.setOnAction(e->btnCode(e));
//		btnMultiply.setOnAction(e->btnCode(e));
//		btnDivide.setOnAction(e->btnCode(e));
//		btnClear.setOnAction(e->btnCode(e));
		
	}
	
	public void btnCode(ActionEvent e) {
		int num1,num2,answer = 0;
		char symbol = ' ';
		num1=Integer.parseInt(tfNum1.getText());
		num2=Integer.parseInt(tfNum2.getText());
		
		System.out.println(e.getSource().getClass());
		System.out.println(e.getSource().getClass());
		Button b;
		b=(Button) e.getSource();
		System.out.println(e.getSource().toString()=="btnAddition");
		if(b==btnAddition) {
			symbol='+';
			answer=num1+num2;
		}else if(b==btnSubtraction) {
			symbol='-';
			answer=num1-num2;
		}else if(b==btnMultiply) {
			symbol='*';
			answer=num1*num2;
		}else if(b==btnDivide) {
			symbol='/';
			answer=num1-num2;
		}else if(b==btnClear) {
			tfNum1.setText("");
			tfNum2.setText("");
		}
		lblAnswer.setText(""+num1+symbol+num2+"="+answer);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
