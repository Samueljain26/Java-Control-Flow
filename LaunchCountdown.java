import java.util.*;

class LaunchCountdown{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown value: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
}
}
