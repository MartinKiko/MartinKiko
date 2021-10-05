import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line

        // Use this function to draw the canvas' diagonals

        // If the line starts from the upper-left corner it should be green, otherwise it should be red

        // Make decision about the color in the function
        int x = 0;
        int y = 0;
        diagonal(graphics,x,y);
        }
        public static void diagonal (Graphics diagonalLine,int a,int b) {
            if (a == 0 && b == 0) {
                diagonalLine.setColor(Color.GREEN);
            }   else {
                diagonalLine.setColor(Color.RED);
            }
            diagonalLine.drawLine(a,b,WIDTH,HEIGHT);
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