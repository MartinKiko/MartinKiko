import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

    public static void drawImage(Graphics graphics){
        // Create a function that takes 2 parameters and draws one square - OK

        // Parameters: the square size and the graphics - OK

        // The function shall draw a square of that size to the center of the canvas - OK

        // Draw 3 squares with that function - OK

        // (the squares should not be filled otherwise they will hide each other) - OK

        // Avoid code duplication! - OK
        for (int i = 0; i < 3; i++) {
            int x = (int) (100*Math.random()+10);
            int a = (int) (100*Math.random()+10);
            square(graphics,x,a);
            }
        }
        public static void square(Graphics sq,int b, int c) {
            sq.setColor(new Color(c*2,c+b,c+b/2));
            sq.drawRect((WIDTH/2-(b/2)),(HEIGHT/2-(b/2)),b,b);
            System.out.println(b);
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
