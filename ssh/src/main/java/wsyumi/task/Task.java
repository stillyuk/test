package  wsyumi.task;

import java.util.Timer;
import java.util.TimerTask;

public class Task implements ITask {
	public void task() {
		Timer timer = new Timer();
		timer.schedule(new MyTask(), 2000, 2000);
		while (true) {
			
		}
	}
	
	private final class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("test");
		}
		
	}
}
