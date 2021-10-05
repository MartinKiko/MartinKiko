import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {

            int x1 = 50;
            int x2 = 60;
            int x3 = 70;
            int y1 = 450;
            int y2 = 430;
            int y3 = 450;
            int loopWidh = 21;
            //Triangle = 20px
        for (int j = 0; j < 21; j++) {
            for (int i = 0; i < loopWidh; i++) {
                int xpoints[] = {x1,x2,x3};
                int ypoints[] = {y1,y2,y3};
                int npoints = 3;
                graphics.drawPolygon(xpoints, ypoints, npoints);
                x1 += 20;
                x2 += 20;
                x3 += 20;
            }
            x1 -= loopWidh*20;
            x2 -= loopWidh*20;
            x3 -= loopWidh*20;
            loopWidh -= 1;
            y1 -= 20;
            x1 += 10;
            y2 -= 20;
            x2 += 10;
            y3 -= 20;
            x3 += 10;
        }
    }
    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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
