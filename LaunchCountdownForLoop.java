import java.util.*;

class LaunchCountdownForLoop{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown value: ");
        int counter = sc.nextInt();

        for(int i=counter;i>=1;i--) {
            System.out.println(counter);
	counter --;
        }
}
}
