package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SolutionLambda {

	public static void main(String[] args) {
		List<Person> roster = new ArrayList<>();
		Person person = new Person();
		roster.add(person);
		person = new Person();			
		person.age = 20;
		person.name = "Merry";
		person.gender = Person.Sex.MALE;
		roster.add(person);
		
		printPersons(
			    roster,
			    (Person p) -> p.getGender() == Person.Sex.MALE
			        && p.getAge() >= 18
			        && p.getAge() <= 25
			);
		
		processPersons(
			     roster,
			     p -> p.getGender() == Person.Sex.MALE
			         && p.getAge() >= 18
			         && p.getAge() <= 25,
			     p -> p.printPerson()
			);
		
		processPersonsWithFunction(
			    roster,
			    p -> p.getGender() == Person.Sex.MALE
			        && p.getAge() >= 18
			        && p.getAge() <= 25,
			    p -> p.getEmailAddress(),
			    email -> System.out.println(email)
			);

	}
	
	static class Person {

	    public enum Sex {
	        MALE, FEMALE
	    }

	    String name = "John";
	    Sex gender = Sex.MALE;
	    String emailAddress = "wwww";
	    int age = 20;

	    public int getAge() {
	    	return age;
	    }

	    public Sex getGender() {
			return gender;
		}

		public void printPerson() {
	        System.out.println(name);
	    }
		
		
		public String getEmailAddress() {
			return emailAddress;
		}
	}
	
	public static void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}
	
	public static void printPersonsWithinAgeRange(
	    List<Person> roster, int low, int high) {
	    for (Person p : roster) {
	        if (low <= p.getAge() && p.getAge() < high) {
	            p.printPerson();
	        }
	    }
	}
	
	public static void printPersons(
	    List<Person> roster, CheckPerson tester) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }
	    }
	}
	
	public static void printPersonsWithPredicate(
	    List<Person> roster, Predicate<Person> tester) {
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            p.printPerson();
	        }
	    }
	}
	
	public static void processPersons(
	    List<Person> roster,
	    Predicate<Person> tester,
	    Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
	}
	
	public static void processPersonsWithFunction(
		    List<Person> roster,
		    Predicate<Person> tester,
		    Function<Person, String> mapper,
		    Consumer<String> block) {
		    for (Person p : roster) {
		        if (tester.test(p)) {
		            String data = mapper.apply(p);
		            block.accept(data);
		        }
		    }
		}
	
	interface CheckPerson {
	    boolean test(Person p);
	}
	
	class CheckPersonEligibleForSelectiveService implements CheckPerson {
	    public boolean test(Person p) {
	        return p.gender == Person.Sex.MALE &&
	            p.getAge() >= 18 &&
	            p.getAge() <= 25;
	    }
	}
}
