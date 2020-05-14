package threads;

import javafx.application.Platform;
import ui.AlgorithmsRaceGUI;

public class CronometerThread extends Thread {
	
	private long start;
	
	private boolean isRunningArrayListThread;
	private boolean isRunningLinkedListThread;
	private boolean isRunningBinarySearchTreeThread;
	
	private AlgorithmsRaceGUI arGUI;
	
	public CronometerThread(AlgorithmsRaceGUI a) {
		isRunningArrayListThread = true;
		isRunningBinarySearchTreeThread = true;
		isRunningLinkedListThread = true;
		arGUI = a;
	}
	
	public void run() {
		start = System.currentTimeMillis();
		while (isRunningArrayListThread||isRunningBinarySearchTreeThread||isRunningLinkedListThread) {
			
			Platform.runLater(new Thread() {
				public void run() {		
					arGUI.updateMainCronometer(getActualTime());
					if(isRunningArrayListThread) {
						arGUI.updateALCronometer(getActualTime());
					}
					if(isRunningBinarySearchTreeThread) {
						arGUI.updateBSTCronometer(getActualTime());
					}
					if(isRunningLinkedListThread) {
						arGUI.updateLLCronometer(getActualTime());
					}
				}
			});
		}
		
	}
	
	public long getActualTime() {
		return start-System.currentTimeMillis();
	}

	public void setRunningArrayListThread(boolean isRunningArrayListThread) {
		this.isRunningArrayListThread = isRunningArrayListThread;
	}

	public void setRunningLinkedListThread(boolean isRunningLinkedListThread) {
		this.isRunningLinkedListThread = isRunningLinkedListThread;
	}

	public void setRunningBinarySearchTreeThread(boolean isRunningBinarySearchTreeThread) {
		this.isRunningBinarySearchTreeThread = isRunningBinarySearchTreeThread;
	}
	
	
}
