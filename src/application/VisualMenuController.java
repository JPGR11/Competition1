package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;

public class VisualMenuController {
	@FXML
	private PasswordField passwordInput;
	@FXML
	private TextField userNameInput;

	// Event Listener on Button.onAction
	@FXML
	public void clickOnSignIn(ActionEvent event) {
		passwordInput.getText();
		userNameInput.getText();
		
	}
}
