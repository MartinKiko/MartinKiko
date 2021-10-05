import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line -OK, x,y,z

        // Parameters: the x and y coordinates of the line's starting point and the graphics -OK

        // The function shall draw a 50 long horizontal line from that point - OK

        // Draw at least 3 lines with that function using a loop - OK- >30
        for (int i = 0; i < 30; i++) {
            int x = i + 50;
            int y = i * 52;
            int z = i + 30;
            horizont(graphics,x,y,z);
        }
    }
        public static void horizont(Graphics horizontLine,int a,int b,int c) {
            horizontLine.drawLine(a,b,c+50,b);
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
