package io.github.oscarmaestre.jlogo;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent> {
	BorderPane root ;
	Button 		btnPrueba;
	@Override
	public void start(Stage primaryStage) {
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource("Interfaz.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		this.initUI();
	}
	public void initUI(){
		btnPrueba=(Button) root.lookup("#btnPrueba");
		btnPrueba.setOnAction(this);
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void handle(ActionEvent event) {
		Object control=event.getTarget();
		if (control.equals(btnPrueba)){
			System.out.println("Probando");
		}
	}
}
