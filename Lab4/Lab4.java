import javax.swing.*;
import java.awt.*;

class Lab4 extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Lab4 m = new Lab4();

        f.add(m);
        f.setTitle("Lab4 Ellipse and Circle");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        midpointCircle(g, 300, 100, 100);

        g.setColor(Color.BLUE);
        midpointEllipse(g, 300, 300, 100, 50);

    }

    public void midpointCircle(Graphics g, int xc, int yc, int r) {
        int x = 0;
        int y = r;
        int Dx = 2 * x;
        int Dy = 2 * y;
        int D = 1 - r;

        while (x <= y) {
            plot(g, xc + x, yc + y, 5, 5);
            plot(g, xc + x, yc - y, 5, 5);
            plot(g, xc - x, yc + y, 5, 5);
            plot(g, xc - x, yc - y, 5, 5);
            plot(g, xc + y, yc + x, 5, 5);
            plot(g, xc + y, yc - x, 5, 5);
            plot(g, xc - y, yc + x, 5, 5);
            plot(g, xc - y, yc - x, 5, 5);

            x = x + 1;
            Dx = Dx + 2;
            D = D + Dx + 1;

            if (D >= 0) {
                y = y - 1;
                Dy = Dy - 2;
                D = D - Dy;
            }
        }
    }

    private void plot(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    private void midpointEllipse(Graphics g, int xc, int yc, int a, int b) {
        int a2 = a * a;
        int b2 = b * b;
        int twoA2 = 2 * a2;
        int twoB2 = 2 * b2;
        // REGION 1
        int x = 0;
        int y = b;
        int D = (int) (b2 - a2 * b + a2 / 4);
        int Dx = 0;
        int Dy = twoA2 * y;
        while (Dx <= Dy) {
            plot(g, xc + x, yc + y, 5, 5);
            plot(g, xc - x, yc + y, 5, 5);
            plot(g, xc - x, yc - y, 5, 5);
            plot(g, xc + x, yc - y, 5, 5);

            x = x + 1;
            Dx = Dx + twoB2;
            D = D + Dx + b2;
            if (D >= 0) {
                y = y - 1;
                Dy = Dy - twoA2;
                D = D - Dy;
            }
        }
        //REGION 2
        x = a;
        y = 0;
        D = (int) (a2 - b2 * a + b2 / 4);
        Dx = twoB2 * x;
        Dy = 0;
        while (Dx >= Dy) {
            plot(g, xc + x, yc + y, 5, 5);
            plot(g, xc - x, yc + y, 5, 5);
            plot(g, xc - x, yc - y, 5, 5);
            plot(g, xc + x, yc - y, 5, 5);
            y = y + 1;
            Dy = Dy + twoA2;
            D = D + Dy + a2;
            if (D >= 0) {
                x = x - 1;
                Dx = Dx - twoB2;
                D = D - Dx;
            }
        }
    }

}
