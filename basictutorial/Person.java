package tutorials.basic;

public class Person {
	String name; //instance variable 
	int age;
	
	public Person(String name) {
		this.name=name; // this.name will refer to the instance variable name where name refers to the parameter string name 
		System.out.println("Person created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayHelloTo(Person person) {
		System.out.println(getName() + " said hello to "+person.getName());
		
	}
}
