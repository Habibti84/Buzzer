package view;

import application.GameController;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LobbyViewController {
	
	GameController gameController;
	public Main setMainController;

	public void setMainController(GameController gameController) {
		this.gameController = gameController;
	}
	
	@FXML
	public void btnQuestionPressed(ActionEvent event) {
		//gameController.showQuestionView();
		//mainController.spielrundeStarten();
	}
}
