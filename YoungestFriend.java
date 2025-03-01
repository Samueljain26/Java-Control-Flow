import java.util.*;

class YoungestFriend{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter the height of Anthony: ");
        double heightAnthony = sc.nextDouble();

	int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

	System.out.println("The youngest friend height is: " + youngestAge);
        System.out.println("The tallest friend height is: " + tallestHeight);
}
}
