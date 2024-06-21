public class Person {
	String name;
	int age;

	void greet(){
		System.out.println("Hello! I'm %s, and %d years old"
		.formatted(name, age));
	}
}