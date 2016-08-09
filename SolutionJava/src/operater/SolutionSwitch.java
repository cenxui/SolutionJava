package operater;

public class SolutionSwitch {

	public static void main(String[] args) {
		

	}
	
	private static void switchTest() {
		int key = 0; // key support int String Integer
		switch (key) {
		case 0:
			System.out.println("0");
			//if you don end with break the next case will be executed.
		case 1:
			break; 
		default:
			break;
		}
	}
	
}
