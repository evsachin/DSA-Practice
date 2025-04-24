package dsa;

public class ConvertStringToArray {
	
	public static void main(String[] args) {
		String name = "Sachin";
		char [] charArray;
		System.out.println(charArray = name.toCharArray());
		
		System.out.println(charArray.length);
		
		System.out.println(charArray[0]);
		
		for(char ch: charArray) {
			System.out.println(ch);
		}
	}
}
