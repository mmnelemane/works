import java.util.Scanner;
import java.util.Random;

public class KnightsTourTest {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int rowNumber = 0;
        int columnNumber = 0;

        KnightsTour newKnight = new KnightsTour();
        Random ran = new Random();
        int pos = 0;

        System.out.println ( "%nWELCOME TO KNIGHTS TOUR TEST%n");
        System.out.println ( "%nEnter the Initial Position of the knight");

        System.out.println("Enter row number: ");
        rowNumber = input.nextInt();

        System.out.println("Enter column number: ");
        columnNumber = input.nextInt();

        // Place the knight at the desired position
        newKnight.setKnightPosition(rowNumber, columnNumber);

        while (!newKnight.checkAllTouched() &&
                !newKnight.checkInfiniteLoop())
        {
            pos = ran.nextInt(8);
            newKnight.makeMove(pos);
            System.out.printf("%n**Board after this move**%n");
            newKnight.displayBoard();
        }

        System.out.printf("%nTotal number of moves: %d%n",
            newKnight.getMoveCount());

    }
}
