import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        int totalMarks = physics + chemistry + maths;
        double average = totalMarks/3;

        System.out.println("Average Marks: " + average);

        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        }
	 else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        }
	 else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        }
	 else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        }
	 else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        }
	 else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }
    }
}
