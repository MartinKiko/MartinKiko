import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!
        for (int i = 0; i <= 3; i++) {
            int a1 = (int) (100*Math.random()+10);
            rectangle(graphics,a1);
        }
    }
    public static void rectangle (Graphics rectangles,int a) {
        rectangles.setColor(new Color(a*2,a/2,a*2));
        rectangles.drawRect(a,a,a,a);
        System.out.println(a);
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
