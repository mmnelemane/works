// LetterGrades class uses the switch statement to count letter grades.
import java.util.Scanner;

public class LetterGrades
{
    public static void main(String[] args)
    {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n",
            "Enter the integer grades in the range 0-100.",
            "Type Ctrl-D to terminate input:");

        // loop until user enters the EOF indicator
        while (input.hasNext())
        {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            // increment appropriate letter-grade counter
            switch (grade / 10)
            {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            } // end switch
        } // end while

        // display grade repor
        System.out.printf("%nGrade Report:%n");

        // if user entered at least one grade ...
        if (gradeCounter != 0)
        {
            // calculate averate of all grades entered.
            double average = (double) total / gradeCounter;

            // output summary of results
            System.out.printf("Total of the %d grades entered is %d%n",
                gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", aCount,
                "B: ", bCount,
                "C: ", cCount,
                "D: ", dCount,
                "F: ", fCount);
        } // end if
        else
            System.out.println("No grades were entered.");
    } // end main
} // end class LetterGrades

