package Exercises;

import javax.swing.*;
import java.awt.*;

public class Animate {

    int x = 1;
    int y = 2;

    public static void main (String[] args){

        Animate gui = new Animate();
        gui.go();

    }

    public void go() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 127; i++, x++, y++) {

            x++;
            drawP.repaint();

            try {
                Thread.sleep(50);
            }   catch (Exception ex)    {   }
        }



    }

    class MyDrawP extends JPanel{

        public void paintComponent(Graphics g) {

            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);



        }

    }

}
