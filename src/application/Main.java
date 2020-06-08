package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;


public class Main extends Application{
	
	public static void main(String[] args) {
		GameController gameController = new GameController();
		gameController.start(primaryStage);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	}
}