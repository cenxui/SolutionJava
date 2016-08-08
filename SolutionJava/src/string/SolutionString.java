package string;

public class SolutionString {

	public static void main(String[] args) {
		// This will get 36. Since operator is form left to right, 
		// you will make "" + 3 to be a string first.
		System.out.println("" + 3 + 6);
		System.out.println((""+ 3) + 6);
		// this will get 9
		System.out.println("" + (3+6));
	}

}
