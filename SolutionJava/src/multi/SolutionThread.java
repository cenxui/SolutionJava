package multi;

public class SolutionThread {

	public static void main(String[] args) {
		Thread thread = new SolutionThread().new MyThread(
				()->System.out.println("RunableThread"));
		thread.start();
		thread.run();
		
	}
	
	class MyThread extends Thread {
		public MyThread(Runnable runnable) {
			super(runnable);
		}
		@Override
		public void run() {
			super.run();
			System.out.println("MyThread");
		}
	}
}
