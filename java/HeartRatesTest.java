import java.util.Scanner;

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        HeartRates hr = new HeartRates();
        System.out.println("\nWelcome to HeartRate Calculatore:%n%n");
        System.out.println("\nEnter First Name: ");
        String firstname = input.nextLine();
        hr.setFirstName(firstname);
        System.out.println("\nEnter Last Name: ");
        String lastname = input.nextLine();
        hr.setLastName(lastname);
        System.out.println("\nEnter Date Of Birth in dd/mm/yyyy format: ");
        String dob = input.nextLine();
        hr.setDOB(dob);
        int age = hr.getAge();
        System.out.println("\n\n==========================================================");
        System.out.printf("Here are the Measurements for %s %s", hr.getFirstName(), hr.getLastName());
        System.out.println("\n==========================================================");

        System.out.printf("\nAge of Person is: %d", age);
        int maxHeartRate = hr.getMaxHeartRate();
        System.out.printf("\nMaximum Heart Rate: %d", maxHeartRate);
        hr.printTargetHeartRate();
    }
}
