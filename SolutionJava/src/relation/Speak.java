package relation;

public class Speak {
	public static void main(String[] agrs) {
		Speak speak = new Tell();
		Tell tell = new Tell();
		((Truth)speak).tellReal();
//		(Truth)tell.tellReal();wrong
	}
}
class Tell extends Speak implements Truth {
	@Override
	public void tellReal() {
		System.out.println("Real");
		
	}
}

interface Truth {
	void tellReal();
}