import java.util.*;

class FizzBuzz{
 	public static void main(String[] args){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number: ");
	int number =sc.nextInt();

	if(number>0){
		if(number%5==0 && number%3==0){
                        System.out.print("FizzBuzz");
		}
		else if(number%3==0){
			System.out.print("Fizz");
		}
		else if(number%5==0){
			System.out.print("Buzz");
		}
		else{
			System.out.print(number);
		}
	}
	else{
		System.out.print("Not a positive integer");
	}
}
}
