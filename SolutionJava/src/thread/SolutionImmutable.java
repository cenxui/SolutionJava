package thread;

import thread.SolutionImmutable.ImmutableAccout.Person;

/**
 * immutable class 
 * @author xenxui
 * 2016/7/27
 */
class SolutionImmutable {

	public static void main(String[] args) {
		ImmutableAccout immutableAccout = ImmutableAccout.createAcount();
		Person person = immutableAccout.getClonePerson();
	
	}	
	
	/**
	 * 
	 * @author xenxui
	 * class modify final to make it can not override to be immutable 
	 */
	public static final class ImmutableAccout {
		/**
		 * modify fields final
		 */
		private final int Id;
		private final Person person;
		
		/**
		 * modify constructor private let it can not be instantiated
		 * @param Id
		 * @param person
		 */
		private ImmutableAccout(int Id, int age) {
			this.Id = Id;
			Person person = new Person(age);
			this.person = person;
		}
		
		/**
		 * make factory method to get instance
		 * @return
		 */
		public final static ImmutableAccout createAcount() {
			int Id = 10000;
			int age = 20;			
			ImmutableAccout immutableAccout = new ImmutableAccout(Id, age);
			return immutableAccout;
		}
		/**
		 * modify method to final, you can modify class to final instead
		 * @return
		 */
		public final int getId() {
			return Id;
		}
		
		/**
		 * no setter is allowed
		 */
		@Deprecated
		public void setId() {
//			this.Id = Id;
		}
		
		/**
		 * if you return an object make sure all field inherit modify final
		 * or return a clone object to it
		 * @return
		 */
		public final Person getClonePerson() {
		
			return  this.person.clone();
		}
		
		public final Person getPersion() {
			return this.person;
		}
		
		/**
		 * if you want to clone it implement Cloneable method
		 * Cloneable will automatically clone fields in shallow
		 * if field is not primitive or immutable object, you need to 
		 *  deep clone the object structure
		 * @author xenxui
		 *
		 */
		final class Person implements Cloneable {
			final int age;
			final String name = "John";
			private Person(int age) {
				this.age = age;
			}
			@Override
			protected Person clone() {
				try {
					return (Person) super.clone();
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
				return null;
			}
		}
	}
}
