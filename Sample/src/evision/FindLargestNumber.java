package evision;

public class FindLargestNumber {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 1;
		int c = 9;
		
		System.out.print(largestNuberIs(a,b,c));
	}

	private static int largestNuberIs(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		if ( a > b && a > c) {
			return a;
		}else if(b > a && b > c) {
			return b;
		}else {
			return c;
		}
		
	}
}
