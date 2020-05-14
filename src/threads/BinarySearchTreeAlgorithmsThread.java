package threads;

import java.util.Random;

import javafx.application.Platform;
import model.AlgorithmsRace;
import ui.AlgorithmsRaceGUI;

public class BinarySearchTreeAlgorithmsThread extends Thread {
	
	private long n;
	private long i;
	private int option;
	private AlgorithmsRaceGUI arGUI;
	private AlgorithmsRace algorithmsRace;
	
	private Random random;
	
	public BinarySearchTreeAlgorithmsThread(AlgorithmsRaceGUI a, AlgorithmsRace ar, int o) {
		n = 0;
		i = 0;
		arGUI = a;
		option = o;
	}
	
	public void run() {
		
		for(; i < n ; i++) {
			if(option == 0) {
				algorithmsRace.addBSTIterative(random.nextLong());
			}else if (option == 1) {
				algorithmsRace.addBSTRecursive(random.nextLong());
			}else if (option == 2) {
				algorithmsRace.consultBSTIterative(random.nextLong());
			}else if (option == 3) {
				algorithmsRace.consultBSTRecursive(random.nextLong());
			}else if (option == 4) {
				algorithmsRace.deleteBSTIterative(random.nextLong());;
			}else if (option == 5) {
				algorithmsRace.deleteBSTRecursive(random.nextLong());
			}
			
			Platform.runLater(new Thread() {
				public void run() {		
					arGUI.updateProgressBST(i/n);
				}
			});
		}
		System.out.println("Finished");
	}
}
