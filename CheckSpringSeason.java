import java.util.*;

class CheckSpringSeason{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month ==4) || (month==5)  || (month == 6 && day <= 20)) {
            System.out.print("I's a Spring Season");
        }
	 else {
            System.out.print("Not a Spring Season");
        }
}
}
