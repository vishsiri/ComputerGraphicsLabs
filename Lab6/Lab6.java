//Vish Siriwatana
//64050229
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Lab6 extends JPanel {
    public static void main(String[] args) {
        Lab6 m = new Lab6();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("LAB6");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double r = Math.toRadians(30);
        double cent = 300;
        double x = (cent * (1 - Math.cos(r))) - (cent * Math.sin(r));
        double y = (cent * (1 - Math.cos(r))) + (cent * Math.sin(r));
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);
        g2.drawRect(200, 200, 200, 200); //FRIST
        g2.setTransform(new AffineTransform(Math.cos(r), -Math.sin(r), Math.sin(r), Math.cos(r), x, y));
        g2.drawRect(200, 200, 200, 200); //ROTATE
        g2.setTransform(new AffineTransform(2, 0, 0, 2, -200 - 50, -200 + 50));
        g2.drawRect(200, 200, 200, 200);
    }
}
