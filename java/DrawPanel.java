// Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    // draws an X from the corners of the panel
    public void paintComponent(Graphics g)
    {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        int lineCount = 0;

        int left = width;
        int right = 0;
        while (lineCount <= 15)
        {
            // draw a line from the upper-left to the lower-right
            g.drawLine(0, 0, right, left);
            left = left - 45;
            right = right + 45;
            lineCount = lineCount + 1;
        }

        // draw a line from the lower-left to the upper-right
        // g.drawLine(0, height, width, 0);
    }
} // end class DrawPanel

