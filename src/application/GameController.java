package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameController extends Application {
	
	Stage myStage = null;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			FXMLLoader loader = new FXMLLoader(
					GameController.class.getResource("../view/MainView.fxml")
					);
			Parent parent = loader.load();
			Scene scene = new Scene(parent);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Buzzer Game");
			primaryStage.show();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
		
	}


}
