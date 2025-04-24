package evision;

import java.util.Scanner;

public class FerhanheightToCelcious {
	
	public static void main(String[] args) {
		
		float ferhnightTemp;
		float celciousTemp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp in ferhnight = ");
		ferhnightTemp = sc.nextFloat();
		celciousTemp = (((ferhnightTemp - 32)*5)/9);
		System.out.println("Temperature in Celciois = "+celciousTemp);
		
	}

}
