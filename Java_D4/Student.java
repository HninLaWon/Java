public class Student {
	// State -- name(String), age (int)(variables)
	String name;
	int age;
	static int count;
	public Student(String name, int age){
		this.name = name;
		this.age = age;
		count++;
	}
	public Student (String name){
		this.name = name;
		count++;
	}
	public Student(){
		count++;
	}

	//Behavior -- greet, learn (method)
	void greet(Student other){
		System.out.println("Hello! %s .".formatted(other.name));
		System.out.println("I'm %s. I'm %d years old".formatted(name, age));
	}
	
}