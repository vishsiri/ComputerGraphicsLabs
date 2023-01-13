//Vish Siriwatana 64050229


package Lab1;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class TenDots extends JPanel {
    final Random r = new Random();
    int dotAmount = 100;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        TenDots m = new TenDots();
        f.add(m);
        f.setTitle("Vish Siriwatana 64050229");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        //get the size of the panel
        Dimension size = getSize();
        //get the width of the panel
        int x = size.width;
        int y = size.height;
        //set dot position tranfrom to random
        for (int i = 0; i < dotAmount; i++) {
            Color c = new Color(r.nextInt(10), r.nextInt(50), r.nextInt(100), r.nextInt(256));
            g.setColor(c);
            g.fillOval(x, y, 20, 20);
            //random position
            x = r.nextInt(size.width);
            y = r.nextInt(size.height);
        }
    }

}