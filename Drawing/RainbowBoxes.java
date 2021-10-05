import javax.swing.*;

import java.awt.*;
import java.util.HashMap;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters

        // (the square size, the fill color and the graphics)

        // and draws a square of that size and color to the center of the canvas.

        // Create a loop that fills the canvas with rainbow colored squares

        // (red, orange, yellow, green, blue, indigo, violet).

        String colorMy = "";
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(0, "#9400D3");
        colors.put(1, "#4B0082");
        colors.put(2, "#0000FF");
        colors.put(3, "#00FF00");
        colors.put(4, "#FFFF00");
        colors.put(5, "#FF7F00");
        colors.put(6, "#FF0000");
        int size = 343;

        for (int i = 0; i < colors.size(); i++) {
            colorMy = colors.get(i);
            fillCenterBox(graphics, size, colorMy);
            size -= 50;
        }
    }

    public static void fillCenterBox(Graphics rainbow, int size, String color) {
        rainbow.setColor(Color.decode(color));
        rainbow.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
