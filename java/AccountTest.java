// Creating and manipulating an Account object.
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest
{
    // Static method can be called without creating an object of the class
    public static void main(String[] args)
    {
        // create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // java.util.Scanner is the fully qualified class name of the class Scanner
        // No need to import if using the fully qualified class name

        // create an Account object and assign it to myAccount
        Account account1 = new Account("John Blue", 100.2);
        Account account2 = new Account("Jane Green", 1000.4);

        account1.displayAccount();
        account2.displayAccount();

        String depositStr = JOptionPane.showInputDialog("Enter deposit for account1.");
        double depositAmount = Double.parseDouble(depositStr);
        System.out.printf("Deposit recieved: %.2f%n%n", depositAmount);
        // System.out.printf("Enter deposit for account1: ");
        // double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("Balance after deposit");
        account1.displayAccount();

        depositStr = JOptionPane.showInputDialog("Enter deposit for account2: ");
        depositAmount = Double.parseDouble(depositStr);
        account2.deposit(depositAmount);
        System.out.printf("Balance after deposit");
        account2.displayAccount();

        Account myAccount = new Account("Noname", 0.0);

        // display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // prompt for and read name
        System.out.println("Please enter the name: ");
        String theName = input.nextLine(); // read a line of text
        myAccount.setName(theName); // put theName in myAccount
        System.out.println(); // outputs a blank line

        // display the name stored in object myAccount
        myAccount.displayAccount();
    } // end method main
} // end class AccountTest
