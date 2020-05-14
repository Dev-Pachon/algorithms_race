package threads;

import java.util.Random;

import javafx.application.Platform;
import model.AlgorithmsRace;
import ui.AlgorithmsRaceGUI;

public class ArrayListAlgorithmsThread extends Thread {
	
	public static final Long MAX = Long.MAX_VALUE;
	public static final Long MIN = Long.MIN_VALUE;
	
	private long n;
	private long i;
	private int option;
	private AlgorithmsRaceGUI arGUI;
	private AlgorithmsRace algorithmsRace;
	
	private Random random;
	
	public ArrayListAlgorithmsThread(AlgorithmsRaceGUI a, AlgorithmsRace ar, int o) {
		n = 0;
		i = 0;
		arGUI = a;
		option = o;
	}
	
	public void run() {
		
		for(; i < n ; i++) {
			if(option == 0) {
				algorithmsRace.addArrayList(random.nextLong());
			}else if (option == 1) {
				algorithmsRace.consultALIterative(random.nextLong());
			}else if (option == 2) {
				algorithmsRace.consultALRecursive(random.nextLong());
			}else if (option == 3) {
				algorithmsRace.deleteALIterative(random.nextLong());
			}else if (option == 4) {
				algorithmsRace.deleteALRecursive(random.nextLong());
			}
			
			Platform.runLater(new Thread() {
				public void run() {		
					arGUI.updateProgressAL(i/n);
				}
			});
		}
		System.out.println("Finished");
	}
}
