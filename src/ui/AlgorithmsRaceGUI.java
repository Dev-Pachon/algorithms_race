package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AlgorithmsRaceGUI {
	
	private Stage stage;
	
	
	
	
	public AlgorithmsRaceGUI(Stage st) {
		stage = st;
	}
	
	public void initialize() {
		
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			
			@Override
			public void handle(WindowEvent event) {
//				ringleteThread.setAlive(false);
				System.out.println("Closing the window!");
			}
		});
		
	}
	
	@FXML
	public void start(ActionEvent event) {
		
	}
	
	public void updateMainCronometer(long l) {
		
	}
	
	public void updateALCronometer(long l) {
		
	}
	
	public void updateLLCronometer(long l) {
		
	}

	public void updateBSTCronometer(long l) {
		
	}
	
	public void updateProgressAL(long i) {
		
	}
	
	public void updateProgressLL(long i) {
		
	}

	public void updateProgressBST(long i) {
		
	}
}
