
public class Crazy_Java_Code4 {
	
	public static void greet() {
		System.out.println("Greetings!");
	}

	public static void main(String[] args) {
		((Crazy_Java_Code4) null).greet();
		
		//in Java we can cast null to other objects its valid
		//Because we have a static method in our class it executes
		//Static methods are not bound by Objects they live inside the class they are created in
		
		//Crazy_Java_Code4.greet(); 
		//This is excatly the same
		
	}

}
