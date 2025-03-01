import java.util.*;

class SumOfNaturalNumbers{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
	    int i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);

            if (sumFormula == sumLoop) {
                System.out.println("Both results match");
            }
	    else {
                System.out.println("There is an error");
            }
            }
	    else {
            System.out.println("The number " + n + " is not a natural number");
            }
}
}
