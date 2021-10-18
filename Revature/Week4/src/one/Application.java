package one;

public class Application {

	public Person myPerson;
	
	public Application() {
		myPerson = new Person();
	}
	
	public static void main(String[] args) {
		Application myApp = new Application();
		
		System.out.println(myApp.myPerson.name + " is " + myApp.myPerson.age + " years old.");
	}
	
}
