import java.util.*;

class SumTillZero{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
	int sum =0;

	while(number !=0){
	sum = sum +number;
	 System.out.print("Enter the next number: ");
	int newNumber =sc.nextInt();
	number =newNumber;
	}
	 System.out.print("Total sum = " + sum);
}
}
