import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Arrays;

public class KnightsTour {
    // The 2-D array to represent the board
    private int[][] chessBoard = new int[8][8];

    // 1-D arrays to represent all possible moves for the Knight
    // Eg: Move of type 2 is 1 step back (-1) and 2 steps down (-2)
    private int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    // Represents the current Row position of the knight
    private int currentRow = 0;

    // Represents the current Column position of the knight
    private int currentColumn = 0;

    // Counter to store the number of moves
    private int moveCount = 0;

    // Constructor
    public void Knightstour()
    {
        // Fill the value with 0 initially
        Arrays.fill(chessBoard,0);

        // Set the initial moveCount to 1 to consider the first position
        moveCount = 0;
    }

    // Method to return the total number of moves
    public int getMoveCount()
    {
        return moveCount;
    }

    // Method to make a move for the knight
    public void makeMove (int moveNumber)
    {
        int newRow = currentRow + vertical[moveNumber];
        int newColumn = currentColumn + horizontal[moveNumber];

        System.out.printf("%nCurrent position (%d, %d)",
            currentRow, currentColumn);
        System.out.printf("%nRequested move, %d vertical, %d horizontal",
            vertical[moveNumber], horizontal[moveNumber]);

        try
        {
            chessBoard[newRow][newColumn]++;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This move is illegal. Try another");
            return;
        }

        System.out.printf("%nNew position after the move: (%d, %d)",
            newRow, newColumn);

        currentRow += vertical[moveNumber];
        currentColumn += horizontal[moveNumber];

        // Increment the move count
        moveCount++;
    }

    // Method to print the current status of the board.
    public void displayBoard()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.printf("  %3d  ", chessBoard[i][j]);
            }
            System.out.printf("%n");
        }
    }

    // Method to set the start position for the knight
    public void setKnightPosition(int row, int column)
    {
        currentRow = row;
        currentColumn = column;

        // Set the move count to zero when a new position is set
        moveCount = 0;
    }

    // Method to test if the cells are reaching the same position
    // more than 64 times which indicates continuous looping.
    public boolean checkInfiniteLoop()
    {
        boolean retVal = false;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (chessBoard[i][j] >= 64)
                {
                    System.out.println("This position of the knight will loop " +
                        "infinitely around the given set of positions. Hence" +
                        " terminating the application.");
                    retVal = true;
                    break;
                }
            }
        }
        return retVal;
    }

    // Method to test if all the cells are touched by the knight
    public boolean checkAllTouched()
    {
        boolean retVal = true;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++) {
                if (chessBoard[i][j] == 0)
                {
                    retVal = false;
                    break;
                }
            }
        }
        return retVal;
    }
}
