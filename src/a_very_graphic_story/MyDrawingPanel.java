package a_very_graphic_story;

import java.awt.*;
import javax.swing.*;

public class MyDrawingPanel extends JPanel {

    public void paintComponent(Graphics g) {

        // this puts an orange rectangle on the screen
//        g.setColor(Color.orange);
//
//        g.fillRect(20, 50, 100, 100);

        // this puts a pic of a cat on the window
//        Image image = new ImageIcon("C:\\Users\\Ohiosumua Daniel\\Pictures\\Screen Saver\\cat_pet_glance_181682_1280x960.jpg").getImage();
//
//        g.drawImage(image, 3, 4, this);

        // this draws a random color oval
//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);

        // this makes an oval with gradient colors of blue and orange
//        Graphics2D g2d = (Graphics2D) g;
//
//        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
//
//        g2d.setPaint(gradient);
//        g2d.fillOval(70, 70, 100, 100);

        // this makes an oval with random gradient colors
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);

    }

}
