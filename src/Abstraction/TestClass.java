package Abstraction;

public class TestClass {
	public static void main(String[] args) {
		
		AbstractClass animal = new InheritedClasses();
		
		System.out.println("Animal has legs : "+animal.legs);
		animal.size();
		
		animal.age();
		
	}
}
