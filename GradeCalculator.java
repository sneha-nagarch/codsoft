import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0, average, marks;
        System.out.println("Enter your number of subjects: ");
        int subjectnum = sc.nextInt();
        for (int i = 1; i <= subjectnum; i++) {
            System.out.println("Enter marks of subject " + i);
            marks = sc.nextFloat();
            sum = sum + marks;
        }
        System.out.println("Your Total marks is " + sum);

        average = sum / subjectnum;
        if (average >= 90 && average < +100) {
            System.out.println("Excilent! you got 'A+' Grade with " + average + "%");
        } else if (average < 90 && average >= 75) {
            System.out.println("very good! you got 'A' Grade with " + average + "%");
        } else if (average < 75 && average >= 60) {
            System.out.println("Good! you got 'B' Grade with " + average + "%");
        } else if (average < 60 && average >= 45) {
            System.out.println("You got 'c' Grade with " + average + "%");
        } else if (average < 45 && average >= 33) {
            System.out.println("You got 'd' Grade with " + average + "%");
        } else if (average < 33) {
            System.out.println("You're Failed ");
        } else {
            System.out.println("Invalid Marks, Enter Marks out of 100 in each subject!");
        }
        sc.close();
    }
}
