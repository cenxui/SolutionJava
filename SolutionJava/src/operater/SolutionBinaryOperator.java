package operater;

public class SolutionBinaryOperator {

	public static void main(String[] args) {
		add();
		sub();
	}
	
	private static void add() {
		int x = 0;
		// x++ means use before add
		// this will get 0
		System.out.println("x++ : " + x++);
		//this will get 1
		System.out.println("x : " + x);
		
		int y = 0;
		// ++y mean add before use
		// this will get 1
		System.out.println("++y : " + ++y);
		// this will get 1 
		System.out.println("y : " + y);
	}
	
	private static void sub() {
		int x = 0;
		// x++ means use before sub
		// this will get 0
		System.out.println("x-- : " + x--);
		//this will get 1
		System.out.println("x : " + x);
		
		int y = 0;
		// ++y mean add before use
		// this will get -1
		System.out.println("--y : " + --y);
		// this will get 1 
		System.out.println("y : " + y);
		
	}
}
