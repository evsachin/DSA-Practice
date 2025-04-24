package com.inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		obj.displayAnimal();
	}
}

//single inheritance
class Animal {

	protected void displayAnimal() {
		System.out.println("Animal");
	}

}

class Dog extends Animal {
	void displayDog() {
		System.out.println("Dog");
	}
}
