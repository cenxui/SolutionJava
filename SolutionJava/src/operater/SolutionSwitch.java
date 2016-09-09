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
	
	private static void switchEnum() {
		Season season = Season.Fall;
		switch (season) {
		case Spring:  //automatically convert Season.Spring to Spring
			
			break;
		case Fall: // must enum type cannot 0 or 1 ,etc
			
			break;

		default:
			break;
		}
	}
	
	enum Season {
		Spring,
		Summer,
		Fall,
		Winter
	}
}
