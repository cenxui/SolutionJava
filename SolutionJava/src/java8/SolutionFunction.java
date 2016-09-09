package java8;

public class SolutionFunction {

	public static void main(String[] args) {

	}
	class S implements Function {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

@FunctionalInterface
interface Function {
	void run(); // if declare FunctionalInterface 
	default void name() {
		
	}
	static void print () {
		
	}
}