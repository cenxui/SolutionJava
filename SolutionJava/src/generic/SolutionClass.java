package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SolutionClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Class<ArrayList> c = ArrayList.class;
		Class<? super ArrayList> s = c.getSuperclass();
		System.out.println("super" + s.getName());
		Class<?>[] classes = SolutionClass.class.getClasses();
		for (Class<?> class1 : classes) {
			System.out.println(class1.getName());
		}
		
	}
	public static class Student implements Readable{
		public String getName() {
			return "Tom";
		}
		
		@Override
		public void read() {
			// TODO Auto-generated method stub
			
		}
	}
	
	static class Teacher {
		public String getName() {
			return "Marry";
		}
	}
	
	public interface Readable {
		void read();
	}
}
