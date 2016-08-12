package relation;

class F {
	F(){}
	protected void one() { // if the class is not enclosing class need to modify protect 
		
	}
}
class C extends F {
	C() {
		// TODO Auto-generated constructor stub
	}
	private void two() {
		super.one();
	}
	
	class B {
		B() {
			// TODO Auto-generated constructor stub
		}
		private void one() {
			
		}
	}
	class A extends B {
		A() {
			// TODO Auto-generated constructor stub
		}
		private void two() {
			super.one();
		}
	}
	
}
