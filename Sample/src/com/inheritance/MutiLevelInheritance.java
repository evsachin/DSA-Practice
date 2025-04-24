package com.inheritance;

public class MutiLevelInheritance {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.displaySon();  
		obj.displayFather();
		obj.displayGrandFather();

		GrandFather gobj = new Father();
		gobj.displayGrandFather();
	}
}

class GrandFather {

	protected void displayGrandFather() {
		System.out.println("GrandFather ...");
	}

}

class Father extends GrandFather {
	protected void displayFather() {
		System.out.println("Father ...");
	}
}

class Son extends Father {
	protected void displaySon() {
		System.out.println("Son ...");
	}
}
