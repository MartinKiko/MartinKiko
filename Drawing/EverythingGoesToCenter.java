import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingGoesToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center
        int size = 320;
        int x1 = 0;
        int y2 = 0;
        int x3 = size;
        int y4 = size;
            for (int j = 0; j < 16; j++) {
                graphics.drawLine(x1,0,WIDTH/2,HEIGHT/2);
                graphics.drawLine(size,y2,WIDTH/2,HEIGHT/2);
                graphics.drawLine(x3,size,WIDTH/2,HEIGHT/2);
                graphics.drawLine(0,y4,WIDTH/2,HEIGHT/2);
                x1 += 20;
                y2 += 20;
                x3 -= 20;
                y4 -= 20;
            }
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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