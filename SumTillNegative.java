import java.util.*;

class SumTillNegative{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            sum += number;
        }
        System.out.print("Total sum = " + sum);
}
}
