import java.util.*;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
	    else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            }
	    else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }
	    else {
                System.out.println(year + " is not a Leap Year.");
            }
	}
	else {
            System.out.println("Enter a year greater than or equal to 1582.");
        }
    }
}
