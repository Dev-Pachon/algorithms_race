package ui;

import java.time.LocalTime;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AlgorithmsRaceGUI {
	
	private Stage stage;
	
	@FXML
    private Label arrayListCronometer;

    @FXML
    private Label CronometerLabel;

    @FXML
    private Label linkedListCronometer;

    @FXML
    private Label binarySearchTreeCronometer;

    @FXML
    private TextField NumberTextField;

    @FXML
    private Button runButton;

    @FXML
    private RadioButton addRadioBtn;

    @FXML
    private ToggleGroup algorithmGroup;

    @FXML
    private RadioButton consultRadioBtn;

    @FXML
    private RadioButton deleteRadioBtn;

    @FXML
    private RadioButton iterativeRadioBtn;

    @FXML
    private ToggleGroup modeGroup;

    @FXML
    private RadioButton recursiveRadioBtn;

    @FXML
    private Circle circle1;

    @FXML
    private Circle circle2;

    @FXML
    private ProgressBar progressBarAL;

    @FXML
    private ProgressBar progressBarLL;

    @FXML
    private ProgressBar progressBarBST;
	
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
		LocalTime lt = new LocalTime(l,);
		CronometerLabel.setText();
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
