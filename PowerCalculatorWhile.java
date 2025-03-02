import java.util.*;

class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Power: ");
        int power = sc.nextInt();

        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }
	 else {
            System.out.println("Enter positive integers only.");
        }
    }
}
