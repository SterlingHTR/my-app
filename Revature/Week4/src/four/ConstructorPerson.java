package four;

public class ConstructorPerson {
	int age;
	String name;
	
	public ConstructorPerson() {
		age = 23;
		name = "Sterling";
	}
	
	public static void main(String[] args) {
		ConstructorPerson cP = new ConstructorPerson();
		
		System.out.println(cP.name + " is " + cP.age + " years old.");
	}
}
