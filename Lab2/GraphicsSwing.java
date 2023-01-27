// Vish Siriwatana 64050229
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

class GraphicsSwing extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        GraphicsSwing m = new GraphicsSwing();

        f.add(m);
        f.setTitle("Test Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {

        // 1.2
        naiveLine(g, 100, 400, 100, 200);
        // 1.3
        naiveLine(g, 400, 100, 300, 200);
        // 1.4
        naiveLine(g, 100, 200, 100, 400);

        // 2.2
        DDA(g, 100, 400, 100, 200);
        // 2.3
        DDA(g, 400, 100, 300, 200);
        // 2.4
        DDA(g, 100, 200, 100, 400);

        // 3.2
        bresenHam(g, 100, 400, 100, 200);
        // 3.3
        bresenHam(g, 400, 100, 300, 200);
        // 3.4
        bresenHam(g, 100, 200, 100, 400);

    }
    // Naive line algorithm
    private void naiveLine(Graphics g, int x1, int x2, int y1, int y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float b = y1 - (dy / dx) * x1;
        int y;
        if (x1 > x2) {
            int tmp = x1;
            x1 = x2;
            x2 = tmp;
        }
        for (int x = x1; x < x2; x++) {
            y = Math.round((dy / dx) * x + b);
            plot(g, x, y);
        }
    }
    // Digital Differential Analyzer (DDA) line algorithm
    private void DDA(Graphics g, int x1, int x2, int y1, int y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float m = dy / dx;
        if (x1 > x2) {
            int tmp = x1;
            x1 = x2;
            x2 = tmp;
        }
        if (y1 > y2) {
            int tmp = y1;
            y1 = y2;
            y2 = tmp;
        }
        float y = y1;
        float x = x1;
        if (m <= 1 && m >= 0) { // 0-1
            for (int xt = x1; xt <= x2; xt++) {
                y = y + m;
                plot(g, xt, Math.round(y));
            }
        } else if (m < 0 && m >= -1) { // -1 -> 0
            for (int xt = x2; xt >= x1; xt--) {
                y = y - m;
                plot(g, xt, Math.round(y));
            }
        } else if (m > 1) {
            for (int yt = y1; yt <= y2; yt++) {
                x = x + (1 / m);
                plot(g, Math.round(x), yt);
            }
        } else { // < -1
            for (int yt = y2; yt >= y1; yt--) {
                x = x - (1 / m);
                plot(g, Math.round(x), yt);
            }
        }
    }
    // Bresenham's line algorithm
    private void bresenHam(Graphics g, int x1, int x2, int y1, int y2) {
        float d;
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);
        boolean isSwap = false;
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        if (dy > dx) {
            float tmp = dx;
            dx = dy;
            dy = tmp;
            isSwap = true;
        }
        d = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g, x, y);
            if (d >= 0) {
                if (isSwap)
                    x += sx;
                else
                    y += sy;
                d -= 2 * dx;
            }
            if (isSwap)
                y += sy;
            else
                x += sx;
            d += 2 * dy;
        }
    }

    private void plot(Graphics g, int x, int y) {
        g.fillRect(x, y, 3, 3);
    }
}