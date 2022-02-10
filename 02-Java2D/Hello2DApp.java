import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Java2D - Hello World!");
        this.setSize(350, 250);
        this.setVisible(true);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.blue);
        int w = getWidth();
        int h = getHeight();
        g2d.drawRect(0, 0, w, h);
        g2d.drawRect(w/3, 0, w/3, h);
        g2d.fillRect(w/3, 0, w/3, h);
        g2d.setPaint(Color.red);
        g2d.fillRect(0, 0, w/3, h);
        g2d.setPaint(Color.white);
        g2d.setFont(new Font("Times New Roman", Font.TYPE1_FONT, 15));
        g2d.drawString("FRANCE.", (w/2) - 30, h/2);
    }
}