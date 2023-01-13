//Vish Siriwatana 64050229


package Lab1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class DrawLine extends JPanel {
    final Random r = new Random();
    int dotAmount = 100;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        DrawLine m = new DrawLine();
        f.add(m);
        f.setTitle("Vish Siriwatana 64050229");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int width = this.getWidth();
        int height = this.getHeight();
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, width, height);
        // g.drawLine(0, height, width, 0);
    }

}