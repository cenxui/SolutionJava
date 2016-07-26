package collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class SolutionCollection {

	public static void main(String[] args) {
		Collection<String> collection = new HashSet<>();
		Enumeration<String> enumeration = new Enumeration<String>() {

			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String nextElement() {
				return null;
			}
		};
		
		Iterator<String> iterator = new Iterator<String>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				Iterator.super.remove();
			}
			
			@Override
			public void forEachRemaining(Consumer<? super String> action) {
				// TODO Auto-generated method stub
				Iterator.super.forEachRemaining(action);
			}
		};
		
		
		
		
		
 	}

}
