package threads;

import java.util.Random;

import javafx.application.Platform;
import ui.AlgorithmsRaceGUI;

public class ArrayListAlgorithmsThread extends Thread {
	
	public static final Long MAX = Long.MAX_VALUE;
	public static final Long MIN = Long.MIN_VALUE;
	
	private long n;
	private long i;
	private AlgorithmsRaceGUI arGUI;
	
	private Random random;
	
	public ArrayListAlgorithmsThread(AlgorithmsRaceGUI a) {
		n = 0;
		i = 0;
		arGUI = a;
	}
	
	public void run() {
		
		for(; i < n ; i++) {
			
			Platform.runLater(new Thread() {
				public void run() {		
					arGUI.updateProgressAL(i);
				}
			});
		}
	}
}
