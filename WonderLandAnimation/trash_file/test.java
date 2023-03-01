package trash_file;
import java.awt.*;
import javax.swing.*;

public class test extends JPanel {
    private int x;
    private int y;
    private int width;
    private int height;
    private int animationSpeed;
    private Color fillColor;
    private boolean isFilling;

    public test(int x, int y, int width, int height, int animationSpeed, Color fillColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.animationSpeed = animationSpeed;
        this.fillColor = fillColor;
        this.isFilling = false;

        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
    }

    public void startAnimation() {
        isFilling = true;
        Thread t = new Thread(() -> {
            while (isFilling) {
                if (x >= getWidth()) {
                    x = 0;
                }
                repaint();
                try {
                    Thread.sleep(animationSpeed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x += 5;
            }
        });
        t.start();
    }

    public void stopAnimation() {
        isFilling = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(fillColor);
        g.fillRect(x, y, width, height);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flood Fill Animation");
        test animation = new test(0, 0, 100, 100, 50, Color.BLUE);
        frame.getContentPane().add(animation);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animation.startAnimation();
    }
}
