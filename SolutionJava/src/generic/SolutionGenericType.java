package generic;

import java.util.ArrayList;

public class SolutionGenericType {

	public static void main(String[] args) {
		// reference <?> is for all type that will make it cannot add any type.
		// if object with no <> will get warning ArrayList is a raw type
		ArrayList<?> arrayList1 = new ArrayList<>();
		arrayList1 = new ArrayList(); // remove <> warning will show
		arrayList1.add(null); // only null type can add
//		arrayList1.add(new Object()); // error
		// reference <Object> is for type object so all classes and arrays can be put in;
		// object <> can be change to <Object> both of them with no error and waning
		ArrayList<Object> arrayList2 = new ArrayList<>(); // with <> still work fine
		arrayList2 = new ArrayList<Object>(); // <Object> is best choice
		arrayList2 = new ArrayList(); // remove <> warning will show
//		arrayList2 = new ArrayList<String>(); // inherit type is not permitted
		arrayList2.add(new Object()); // add Object 
		arrayList2.add(new int[10]); // array is object so is permitted
		arrayList2.add(new String()); // inherit type is permitted
		// reference <? extend Number> if for all type extend Number, 
		// that will make it only can add Number or it super type
		// object generic type can be an inherit type
		ArrayList<? extends Number> arrayList3 = new ArrayList<>();
		arrayList3 = new ArrayList<Number>();
		arrayList3 = new ArrayList<Integer>();// inherit type is permitted
//		arrayList3 = new ArrayList<Object>(); //super type is not permitted
//		arrayList3.add(new Object());add super type is not permitted
//		arrayList3.add(new Integer(10));// add inherit type is permitted
	
		ArrayList<? super Number> arrayList4 = new ArrayList<>();
		arrayList4 = new ArrayList<Number>();
		arrayList4 = new ArrayList<Object>();
//		arrayList4 = new ArrayList<Integer>(); inherit type is not permitted
		arrayList4.add(new Integer(100)); // add inherit type is permitted
//		arrayList4.add(new Object());// add super type is not permitted
	}

}
