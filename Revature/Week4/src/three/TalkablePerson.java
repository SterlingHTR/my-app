package three;

public class TalkablePerson {
	
	int age;
	String name;
	
	public TalkablePerson() {
		age = 23;
		name = "Sterling";
		
	}
	
	public void talk() {
		System.out.println("Hello my name is " + this.name);
	}
	
	public static void main(String[] args) {
		TalkablePerson sirTalksAlot = new TalkablePerson();
		sirTalksAlot.talk();
	}
}
