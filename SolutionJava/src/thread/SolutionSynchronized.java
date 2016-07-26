package thread;

public class SolutionSynchronized {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		MyThread myThread1 = new MyThread(account);
		MyThread myThread2 = new MyThread(account);
		MyThread myThread3 = new MyThread(account);
		MyThread myThread4 = new MyThread(account);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		
		//wait for all thread to finish 
		myThread1.join();
		myThread2.join();
		myThread3.join();
		myThread4.join(); 
		
		account.print();

	}
	
	static class Account {
		volatile int number = 0; // volatile to prevent compiler reform 
		
		public void add() {
			synchronized (this) { //if you don't synchronized the result can not be 0
				number++;
			}
		}
		
		public void sub() {
			synchronized (this) {//if you don't synchronized the result can not be 0
				number--;
			}
			
		}
		
		public void print() {
			System.out.println(number);
		}
	}
	
	static class MyThread extends Thread {
		Account account;
		MyThread(Account account) {
			this.account = account;
		}
		@Override
		public void run() {
			for (int i = 0; i < 20; i++) {
				account.add();
			}
			try {
				System.out.println(Thread.currentThread().getName() + "sleep");
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 20; i++) {
				account.sub();
			}
		}
	}
}
