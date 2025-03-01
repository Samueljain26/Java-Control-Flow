import java.util.*;

class FizzBuzzWhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println(i + " = FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println(i + " Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + " Buzz");
                } else {
                    System.out.println(i + " ");
                }
                i++;
            }
        }
	 else {
            System.out.print("Not a positive integer");
        }
    }
}
