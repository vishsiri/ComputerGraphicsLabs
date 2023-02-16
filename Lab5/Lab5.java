import javax.swing.*;
import java.awt.*;

class Lab5 extends JPanel implements Runnable {
    double circleMove = 0;
    double squareRotate = 0;
    double rectMove = 0;
    double rectDirection = 1.0;

    public static void main(String[] args) {
        Lab5 m = new Lab5();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Graphics");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.BLACK);
        g2.translate(0, -rectMove);
        g2.drawRect(0, 510, 50, 50);
        g2.translate(0, rectMove);
        g2.translate(circleMove, 0);
        g2.drawOval(0, 0, 100, 100);
        g2.translate(-circleMove, 0);
        g2.rotate(squareRotate);
        g2.rotate(squareRotate, 300, 300);
        g2.drawRect(200, 200, 200, 200);
    }

    public void run() {
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        double circleDirection = 1.0; // initial direction is to the right

        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;

            // Update circle position and direction
            circleMove += circleDirection * 50.0 * elapsedTime / 1000.0;
            if (circleMove >= 500.0 || circleMove <= 0.0) {
                circleDirection *= -1.0; // reverse direction
            }

            // Update square rotation
            squareRotate += 0.5 * elapsedTime / 1000.0;

            // Update rectangle y position (move up/down)
            rectMove += rectDirection * 50.0 * elapsedTime / 1000.0;
            if (rectMove >= 500.0 || rectMove <= 0.0) {
                rectDirection *= -1.0; // reverse direction
            }

            // Display
            repaint();
        }
    }
}
