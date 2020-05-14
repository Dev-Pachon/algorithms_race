package threads;

import java.util.Random;

import javafx.application.Platform;
import model.AlgorithmsRace;
import ui.AlgorithmsRaceGUI;

public class LinkedListAlgorithmsThread extends Thread {
	private long n;
	private long i;
	private int option;
	private AlgorithmsRaceGUI arGUI;
	private AlgorithmsRace algorithmsRace;
	
	private Random random;
	
	public LinkedListAlgorithmsThread(AlgorithmsRaceGUI a, AlgorithmsRace ar, int o) {
		n = 0;
		i = 0;
		arGUI = a;
		option = o;
	}
	
	public void run() {
		
		for(; i < n ; i++) {
			if(option == 0) {
				algorithmsRace.addLinkedListIterative(random.nextLong());
			}else if (option == 1) {
				algorithmsRace.addLinkedListRecursive(random.nextLong());
			}else if (option == 2) {
				algorithmsRace.consultLLIterative(random.nextLong());
			}else if (option == 3) {
				algorithmsRace.consultLLRecursive(random.nextLong());
			}else if (option == 4) {
				algorithmsRace.deleteLLIterative(random.nextLong());;
			}else if (option == 5) {
				algorithmsRace.deleteLLRecursive(random.nextLong());
			}
			
			Platform.runLater(new Thread() {
				public void run() {		
					arGUI.updateProgressLL(i/n);
				}
			});
		}
		System.out.println("Finished");
	}
}
