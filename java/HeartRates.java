import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class HeartRates
{
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int age;
    private double maxHeartRate;

    public void setFirstName(String name)
    {
        this.firstName = name;
    }

    public void setLastName(String name)
    {
        this.lastName = name;
    }

    public static long getDateDiffInDays(Date latest, Date old)
    {
        long diffInMilli = latest.getTime() - old.getTime();
        return TimeUnit.DAYS.convert(diffInMilli, TimeUnit.MILLISECONDS);
    }

    public void setDOB(String ddmmyyyy)
    {
        SimpleDateFormat ft = new SimpleDateFormat("dd/mm/yyyy");
        try
        {
            dateOfBirth =  ft.parse(ddmmyyyy);
        }catch (ParseException e) {
            System.out.println("Invalid Date Format. Use dd/mm/yyyy");
        }
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        Date today = new Date();
        long diffInDays = getDateDiffInDays(today, dateOfBirth);
        int age = (int)diffInDays/365;
        return age;
    }

    public int getMaxHeartRate()
    {
        int age = getAge();
        return (220 - age);
    }

    public void printTargetHeartRate()
    {
        double lowRate, highRate;
        int maxHeartRate = getMaxHeartRate();
        lowRate = 0.5 * maxHeartRate;
        highRate = 0.85 * maxHeartRate;
        System.out.printf("%nTarget Rate from %.2f to %.2f%n%n", lowRate, highRate);
    }
}

