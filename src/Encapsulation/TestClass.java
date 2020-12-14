package Encapsulation;

public class TestClass {
	
	public static void main(String[] args) {
		
		EncapsulatedClass object = new EncapsulatedClass();
		
		object.setlength(5);
		System.out.println("Length is " + object.getlength());
		
		object.setlength(10);
		System.out.println("Now Length is " + object.getlength());
		
	}

}
