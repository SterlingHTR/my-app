package two;

public class PrivatePerson {

	private int age;
	private String name;
	
	
	public PrivatePerson() {}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name2set) {
		name = name2set;
	}
	
	public void setAge(int age2set) {
		age = age2set;
	}
	
	public static void main(String[] args) {
		PrivatePerson myPerson = new PrivatePerson();
		
		myPerson.setAge(23);
		myPerson.setName("Sterling");
		
		System.out.println(myPerson.getName() + " is " + myPerson.getAge() + " years old.");
	}
}
