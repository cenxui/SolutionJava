package relation;

import relation2.*;// useless

public class Test {

	public static void main(String[] args) {
		
		//if exist same name class you need to use full name instead;
		 relation2.Test test = new relation2.Test();
//		 Parent parent = new Parent(0);
//		 parent.name();
	}
	
	class Parent {
		public Parent(int i) {
			// TODO Auto-generated constructor stub
		}
		
		private void name() {
			
		}
	}
	
	class Son extends Parent {

		public Son(int i) {
			super(i);
			super.name();// TODO Auto-generated constructor stub
		}
		
	}
//
//	static class Child extends Parent {
//
//		public Child(int i) {
//			super(i);
//
//		}
//	}
}
