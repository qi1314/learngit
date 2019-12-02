
public class Person {
	private String name;
	private String hobby;
	private String sex;
	public int age;
	
	public Person(){
		System.out.println("person()...");
	}
	public Person(String name){
		this.name=name;
		System.out.println("person("+name+")");
	}
	public void eat(){
		System.out.println("eat...");
	}
	public void eat(String food){
		System.out.println("eat..."+food);
	}
}
