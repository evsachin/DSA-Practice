package evision;

public class StarPattern {
	public static void main(String[] args) {

		int row, numberOfStars;

		for (row = 1; row <= 20; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print(" 000 ");
			}
			System.out.println();
		}
	}
}
