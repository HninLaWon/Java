public class OwnerDemo{
	static String message = "Static Message";
	static int count;
	

	String names = "Instant Name";
	int age;

	void hidingDemo(){
		String names = "Local Name";
		System.out.println(names);
		System.out.println(this.names);
		String message = "Local Message";
		System.out.println(message);
		System.out.println(OwnerDemo.message);

	}

	void doSommething (int count){
		String data = "Hello";
		System.out.println(data);
		System.out.println(count);
	}
}