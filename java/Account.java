// Account class that contains a name instance variable
// and methods to set and get its value.

public class Account
{
    private String name; // instance variable
    private double balance;

    // constructor initializes name with parameter name
    public Account(String name, double balance) // constructor name is class name
    {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    // method to set the name in the object
    public void setName(String name)
    {
        this.name = name; // store the name
    }

    // method to retrieve the name from the object
    public String getName()
    {
        return name; // return value of name to caller
    }

    public double getBalance()
    {
        return balance;
    }

    public void displayAccount()
    {
        System.out.printf("%s Balance is: %.2f%n%n", name, balance);
    }
} // end class Account
