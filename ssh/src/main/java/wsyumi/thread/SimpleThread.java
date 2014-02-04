package wsyumi.thread;

public class SimpleThread implements Runnable {

	public void run() {
		try {
			Class.forName("cglib.A");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
