package stream;

import java.util.stream.Stream;

public class SolutionStream {

	public static void main(String[] args) {
		SolutionStream solutionStream = new SolutionStream();
		Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");
		fruitStream.filter(s -> s.contains("a"))			
			.map(SolutionStream::add)
			.map(solutionStream::edit)
			.forEach(System.out::println);
	}
	
	public static String add(String s) {
		return "a " + s;
	}
	
	public String edit(String s) {
		return "This is " + s;
	}
}
