package Inheritance;

public class TestClass {
	
	public static void main(String[] args) {
		
		SubClass animalobject = new SubClass();
		
		animalobject.eats();
		animalobject.size();
		System.out.println("Legs = " + animalobject.legs);
		
	}
}
