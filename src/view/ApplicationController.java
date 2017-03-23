package view;

import application.MainApp;
import javafx.fxml.FXML;
import model.AppController;

public class ApplicationController implements AppController {

	private MainApp mainApp;
	
	@Override
	public void setMainApp(MainApp mainApp) {
		// TODO Auto-generated method stub
		this.mainApp = mainApp;
	}
	

	@FXML
	private void competition() {
		mainApp.changeView("../view/Konkurranse_Oversikt.fxml");
	}
	
	@FXML
	private void comp1() {
		mainApp.changeView("../view/Konkurranseinfo.fxml");
	}
	
	@FXML
	private void comp2() {
		mainApp.changeView("../view/Konkurranseinfo2.fxml");
	}
	
	@FXML
	private void comp3() {
		mainApp.changeView("../view/Konkurranseinfo3.fxml");
	}
	
	@FXML
	private void comp4() {
		mainApp.changeView("../view/Konkurranseinfo4.fxml");
	}
	
	@FXML
	private void activity() {
		mainApp.changeView("../view/Aktivitet.fxml");
	}
	
	@FXML
	private void bluetooth() {
		mainApp.changeView("../view/Bluetooth.fxml");
	}
	
	@FXML
	private void steps() {
		mainApp.changeView("../view/Registrer.fxml");
	}
	
	
	@FXML
	private void login() {
		mainApp.changeView("../view/MyPage.fxml");
	}
	
	@FXML
	private void profile() {
		mainApp.changeView("../view/MyPage.fxml");
	}
	
}