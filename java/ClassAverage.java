// Solving the class-average problem using counter-controlled repitition.
import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1; // initialize # of grade to be entered next

        // processing phase uses counter-controlled repetition
        while (gradeCounter <= 10) // loop 10 times
        {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        // termination phase
        int average = total / 10;

        System.out.printf("%nTotal of all 10 grades is %d%n", total);

        System.out.printf("Class average is %d%n", average);

        // processing phase for sentinel-controlled repetition
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        total = 0;
        gradeCounter = 0;

        // loop until sentinel value read from user
        while (grade != -1)
        {
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // termination phase sentinel-controlled repetition
        if (gradeCounter != 0)
        {
            double sentinelAverage = (double) total / gradeCounter;

            System.out.printf("%nTotal of the %d grades entered is %d%n",
                gradeCounter, total);
            System.out.printf("Class average is %.2f%n", sentinelAverage);
        }
        else
            System.out.println("No grades were entered");
    }
} // end class ClassAverage
