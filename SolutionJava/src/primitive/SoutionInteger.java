package primitive;

public class SoutionInteger {

	public static void main(String[] args) {
		
		add();
	}
	
	private static void setValue(Integer integer, int i) {
		integer = 40;
		i = 40;
	}
	
	private static void add() {
		int i = 10;
		Integer integer = new Integer(10);
		setValue(integer++ , i++);
		System.out.println("integer" + integer + "i" + i);
	}
	
}
