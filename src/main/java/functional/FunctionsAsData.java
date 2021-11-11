package functional;

public class FunctionsAsData {
	
	protected static class Person {
		protected String name;

		protected Person(String name) {
			this.name = name;
		}
	}
	
	protected static class PersonLoader {
		NoArgsFunction<Person> loader ;
		
		public PersonLoader () {
			this.loader = this::loadPerson;
		}
		
		protected Person loadPerson() {
			System.out.println("Ali");
			return new Person("Ali");
		};
	}

	public static void main(String[] args) {
		PersonLoader person = new PersonLoader();
		person.loader.apply();

	}

}
