import java.util.*;

class IsDivisibleByFive{
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Is the number " + number + " divisible by 5? " +  (number % 5 == 0) );
}
}
