package function;

import java.util.function.Predicate;

public class SolutionPredicate <T> {

	public static void main(String[] args) {
		
		SolutionPredicate<String> solutionPredicate = new SolutionPredicate<>();
		solutionPredicate.print((s) -> s.contains("a"));

	}
	
	public static <T> String getData(T t) {
		return null;
	}
	
	public void print(Predicate<? super T> predicate) {
		if (predicate.test(null)) {
			System.out.println("true");
		}
		System.out.println("false");
	}
}
