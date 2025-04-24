package evision;

public class SwapTwoNumbersWithThirdVariable {
    public static void main(String[] args) {

        int a = 12;
        int b = 85;
        int c;

        System.out.println("Before Swapping A & B: " + a + " " + b);
        
        c = a;
        a = b;
        b = c;
        System.out.println("After Swapping A & B: " + a + " " + b);
    }
}
