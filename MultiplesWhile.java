import java.util.*;

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 99;
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
	 else {
            System.out.println("Enter a positive integer less than 100.");
        }
    }
}
