// Addition program that inputs two numbers then displays their sum
import java.util.Scanner;

public class Addition
{
    // main method begins execution of Java application
    public static void main(String[] args)
    {
        //create a Scanner to obtail input from the command line
        Scanner input = new Scanner(System.in);

        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        System.out.print("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read the first number from the user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt();

        sum = number1 + number2; // add numbers and store the total in sum

        System.out.printf("Sum is %d\n", sum); // display sum
    } // end method main
} // end class Addition
