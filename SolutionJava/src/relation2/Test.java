package relation2;

import java.util.Set;

import relation.Teacher;

public class Test {
	private int x;
//	private static int y = x;
	
	private Test test = new Test() {
		public void set(int x) {
			
		};
	};
	
	public void set(int i) {
		
	}
	
	public static void main(String[] agrs) {
		int z = 1;
	
	}
	
	private static class trys {
		inner i = new Test().new inner() {
			@Override
			public void set(int x) {
				// TODO Auto-generated method stub
				super.set(x);
			}
		};
		
		staticclass s = new staticclass() {
			final static int y = 0;
			@Override
			public void set(int x) {
				// TODO Auto-generated method stub
				super.set(x);
				System.out.println(y);
			}
			
			public void name() {
				
			}
		};
		
		
		private void name() {
			s.set(0);
			new staticclass() {
				public void set(int x) {};
				public void run() {
					
				}
			}.run();
			
			
		}
	
	}
	
	public class inner {
		static final int age = 0;
		
		public void set(int x) {
			
		}
	}
	
	public static class staticclass {
		private staticclass() {
		
		}
		
		public void set(int x) {
			
		}
	}
	
	
	
	private void name() {
		this.new inner();
		new staticclass();
		class test {
			int age = 0;
			private void name() {
				
			}
		}		
	}
	private int getValue() {
		return 0 ;
	}
}
