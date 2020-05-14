package ui;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	private AlgorithmsRaceGUI arGUI;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			arGUI = new AlgorithmsRaceGUI(primaryStage);
			FXMLLoader fxmlload = new FXMLLoader(getClass().getResource(""));
			fxmlload.setController(arGUI);
			Parent root = fxmlload.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Algorithms Race - 2k20");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
