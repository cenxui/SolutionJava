package integer;

public class SoutionInteger {

	public static void main(String[] args) {
		int i = 10;
		Integer integer = new Integer(10);
		setValue(integer++ , i++);
		System.out.println("integer" + integer + "i" + i);
		
	}
	
	private static void setValue(Integer integer, int i) {
		integer = 40;
		i = 40;
	}
	
}
