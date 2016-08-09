package operater;

public class SolutionConditionalExpressions {

	public static void main(String[] args) {
		testCondition();

	}
	
	private static void testCondition() {
		int x = 10;
		int y;
		// equal y = (x>10?x+1:(x<5? x+4:x-3));
		y = x>10? x+1: x<5? x+4:x-3;
		assert y == 7;
		System.out.println(y);
	}
}
