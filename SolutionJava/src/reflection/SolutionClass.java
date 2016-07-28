package reflection;


import java.lang.reflect.Field;

public class SolutionClass {

	public static void main(String[] args) {
		
		Data data = new Data();
		printData(data);
	}
	
	static class Data {
		String name = "John";
		int age = 16;
		boolean gay = false;
		float hight = 180;
		Car car = new Car();
	}
	
	static class Car {
		String name = "Toyota";
		int Id = 100;
	}
	
	static <T> void printData(T t) {
		Class<? extends Object> tClass = t.getClass();
		System.out.println(tClass.getName());
		Field[] fields = tClass.getDeclaredFields();
		for (Field field: fields) {
			System.out.println("field name :\t" + field.getName());
			System.out.println("field generic type :\t" + field.getGenericType().toString());
			
		}
	}
}
