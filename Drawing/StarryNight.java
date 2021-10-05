import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black - OK
        //  - The stars can be small squares - OK
        //  - The stars should have random positions on the canvas - OK
        //  - The stars should have random color (some shade of grey) - OK
        int size = 320;
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,size,size);

        for (int i = 0; i < 100; i++) {
            int star = (int) (80*Math.random()*4);
            int star1 = (int) (80*Math.random()*4);
            int color = (int) (20*Math.random()*10);
            if (color > 100 && color < 150) {
                graphics.setColor(new Color(color,color,color,color));
                //System.out.println("color: " + color);
            }
            graphics.fillRect(star,star1,1,1);
            //System.out.println("star: " + star);
            //System.out.println("star1: " + star1);
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