package thread;

public class SolutionWait {
	static Object object = new Object();

	public static void main(String[] args) {
		new Wait().start();
		new Notify().start();
	}
	
	private static class Wait extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("wait");
				try {
					
					synchronized (object) {
						object.wait();
					}				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("going");
			}
		}
	}
	
	private static class Notify extends Thread {
		@Override
		public void run() {
			for (int i = 0;i<9;i++) {
				System.out.println("notify");	
				synchronized (object) {
					object.notifyAll();
				}
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
	}
	
}
