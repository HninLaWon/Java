public class Initialization {
	public static void main(String[] args) {
		new Initialization();
		new Initialization();
		new Initialization();

		{
			String name = "Something";
		}
	}

	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("Static Block");

	}

	public Initialization(){
		System.out.println("Constructor");
	}
}