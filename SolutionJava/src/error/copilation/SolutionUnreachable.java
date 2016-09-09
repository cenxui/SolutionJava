package error.copilation;

public class SolutionUnreachable {

	public static void main(String[] args) {
		
		

	}
	
	private void infiniteLoop() {
		for(;;) { //the same as while loop and do while
			//no break inside
		}
//		System.out.println("");
	}
	
	private void logicalErrorInFor() {
		for (int i = 0; i<5; i++) {
			if (true) { //break and continue in the if else which contain in loop
				break;
			}else {
				continue;
			}
//			System.out.println("");
		}
	}
}
