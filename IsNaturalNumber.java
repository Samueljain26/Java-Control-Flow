import java.util.*;

class IsNaturalNumber{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number: ");
	int number =sc.nextInt();
	int sum =0;
	if(number>0){
	sum =(number*(number+1))/2;
	System.out.print("The sum of " + number + " natural numbers is "+ sum);
	}
	else{
	System.out.print("The number "+ number +" is not a natural number");
	}
}
}
