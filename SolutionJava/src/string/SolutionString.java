package string;

public class SolutionString {

	public static void main(String[] args) {

	}
	
	private static void hashCodeString() {
		String string1 = "John";
		System.out.println(string1.hashCode());
		String string2 = new String("John");
		System.out.println(string2.hashCode());
		System.out.println(string1.equals(string2));
	}
	
	private static void trimString() {
		String s = " ";
		s.trim();
		System.out.println(s.equals("") + ":" + s.isEmpty());
	}
	
	@SuppressWarnings("unused")
	private static void testTrim() {
		String s = " Jim Jim ";
		System.out.println(s.trim() + s.trim().length());
	}
	
	@SuppressWarnings("unused")
	private static void add() {
		// This will get 36. Since operator is form left to right, 
		// you will make "" + 3 to be a string first.
		System.out.println("" + 3 + 6);
		System.out.println((""+ 3) + 6);
		// this will get 9
		System.out.println("" + (3+6));
	}
	
	@SuppressWarnings("unused")
	private static void addChar() {
		String str = "Duke";
		char[] str2 = {'D', 'u', 'k', 'e'};
		String s3 = null;// This will print nullDuke.
		for (char c: str2) {
			s3 = s3 + c;		
		}
		if (s3.equals(str)) {
			System.out.println("YES");
		}else {
			System.out.println("NO" + s3);
		}
	}
}
