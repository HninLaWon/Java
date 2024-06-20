class Animal {
	String type = "Animal";


	void greet (){
		System.out.println("Hello! I'm an animal");
	}
}

//Inheritance ---Is a relationship. Dog is an Amimal.

class Dog extends Animal {
	void greet (){
		System.out.println("Wote Wote");
	}
	void shaketail(){
		System.out.println("Shaking Shaking");
	}

}