import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter<fo> {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line - OK, x,y,y1

        // Parameters: the x and y coordinates of the line's starting point and the graphics

        // The function shall draw a line from that point to the center of the canvas - OK

        // Draw at least 3 lines with that function using a loop - OK, >3

        for (int i = 0; i < 30; i++) {
            int x = (int) (100 * Math.random()) + 10;
            int y = WIDTH / 2;
            int y1 = HEIGHT / 2;
            //graphics.drawLine(x, 0, y, y1);
            center(graphics, x, y, y1);
        }
    }
    public static void center (Graphics centerLine, int a, int b, int c) {
        centerLine.drawLine(a,0, b, c);
    }



    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
