package operater;

public class SolutionIf {

	public static void main(String[] args) {
		testIf();
	}

	private static void testIf() {
		int var = 3;
		if (!(var <0)) {
			System.out.println("Shape");
		}
		{
			System.out.println(" squre");
		}
	}
	
	private static void testBreak() {
		String[] colors = {"a", "b", "c", "d", "e"};
		int count = 0;
		for (String c: colors) {
			if (count>= 5) {
				break;
			}else {
				continue;
			}
//			System.out.println("s");  unreachable code
		}
	}
}
