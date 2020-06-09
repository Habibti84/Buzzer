package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.LobbyViewController;
import view.StartupViewController;

public class GameController extends Application {
	
	Stage myStage = null;
	private StartupViewController startupController;

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
				myStage = primaryStage;
				myStage.setTitle("Buzzer Game");
				showStartupView();
			
		} catch (Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
		
	}

	public void showStartupView() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/StartupView.fxml"));
		try {
			Scene startupScene = new Scene(loader.load());
			startupController = loader.getController();
			startupController.setMainController(this);
			
			myStage.setScene(startupScene);
			myStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
	}
	
	
	public void showLobbyView() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/LobbyView.fxml"));
		try {
			Scene lobbyScene = new Scene(loader.load());
			LobbyViewController lobbyController = loader.getController();
			lobbyController.setMainController(this);
			
			myStage.setScene(lobbyScene);
			myStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
			Platform.exit();
		}
	}

}
