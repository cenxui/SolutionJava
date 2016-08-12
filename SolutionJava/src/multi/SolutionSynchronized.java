package multi;

public class SolutionSynchronized {
	static volatile String mia = "Hello Mia";
	public static void main(String[] args) {
		
		
		new Thread(()-> {synchronized (mia) {
			try {
				Thread.sleep(10000);
				System.out.println("wake");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}}).start();
		

		new Thread(()->{
			for(;;) {
				synchronized (mia) {
					mia = "" + System.currentTimeMillis();
				}
				mia = "" + System.currentTimeMillis();
				System.out.println(mia);
//				mia = "" +System.currentTimeMillis();
			}
		}).start();	
	}
	
}
