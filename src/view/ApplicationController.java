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
	private void handleInsertion(){
			mainApp.changeView("view/Insertion.fxml");
	}
	@FXML
	private void handleSelect(){
		mainApp.changeView("view/Select.fxml");
	}

	@FXML
	private void competition() {
		mainApp.changeView("Konkurranse_Oversikt.fxml");
	}
}