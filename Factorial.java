import java.util.*;

class Factorial{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
	else {
            int factorial = 1;
	    int i = 1;

            while (i <= n) {
                factorial =factorial* i;
                i++;
            }

            System.out.println("Factorial: " + factorial);
        }
}
}
