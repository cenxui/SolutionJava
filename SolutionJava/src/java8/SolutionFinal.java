package java8;

import static java.lang.System.out;

/**
 * 
 * @author xenxui
 * 2016 8/22
 * effectively final 
 * effectively final means that the variable does not change 
 * it value after it initial. Even thought it doesn't modify final
 * , it behavior just like final variable. 
 */

public class SolutionFinal {

	public static void main(String[] args) {
		String string = "John";
		new Thread(new Runnable() {
		
			@Override
			public void run() {
				out.println(string);			
			}
		}).start();
	}
}
