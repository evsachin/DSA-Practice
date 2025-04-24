package evision;

import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myInt;
		float myFlaot;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str = sc.nextLine();
		System.out.println("value is = "+str);
		
		System.out.println("Enter an Integer");
		myInt = sc.nextInt();
		System.out.println("value is = "+myInt);
		
		System.out.println("Enter Float Number");
		myFlaot = sc.nextFloat();
		System.out.println("value is = "+myFlaot);
	}

}
