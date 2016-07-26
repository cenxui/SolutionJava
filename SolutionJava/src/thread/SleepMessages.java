package thread;

public class SleepMessages {
	static Thread mThread;
	static long time;

	public static void main(String[] args) {
		mThread = Thread.currentThread();
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
		
		new MyThread().start();
		 for (int i = 0;
	             i < importantInfo.length;
	             i++) {
	            //Pause for 4 seconds
	            try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					System.out.println("Wake");
					e.printStackTrace();
				}
	            //Print a message
	            System.out.println("interupt" + Thread.interrupted());
	            System.out.println(System.currentTimeMillis() - time);
	            time = System.currentTimeMillis();
	            System.out.println(importantInfo[i]);
	        }
	}
	
	static class MyThread extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(3000);
					mThread.interrupt();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}	
		}
	}
}
