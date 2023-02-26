import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Dino extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Dino m = new Dino();

        f.add(m);
        f.setTitle("Bunny Cuteธึ 64050060 & 64050229");
        f.setSize(600, 600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);

        // note
        bezierPaint(g2, 304,319,320,332,336,339,350,337,6);
        bezierPaint(g2, 350,337,374,332,392,316,402,295,6);
        bezierPaint(g2, 402, 295, 404, 280, 398, 255, 380, 236, 6);
        


        //mouth
        bezierPaint(g2, 309, 310,305,313,303,315,297,319,5);

        bezierPaint(g2, 350, 337,343,346,326,355,317,355,5);


        // color

        g.drawImage(buffer, 0, 0, null);

        exportImage(buffer, "bunny.png");
    }

    public BufferedImage floodFill(BufferedImage bf, int x, int y, Color target_colour, Color replacement_colour) {
        Queue<Point> queue = new LinkedList<Point>();
        Graphics2D g3 = bf.createGraphics();

        if (bf.getRGB(x, y) == target_colour.getRGB()) {
            g3.setColor(replacement_colour);
            plot(g3, x, y, 4, 4);
            queue.add(new Point(x, y));
        }
        while (!queue.isEmpty()) {
            Point p = queue.poll();

            if (p.y < 600 && bf.getRGB(p.x, p.y + 1) == target_colour.getRGB()) {
                g3.setColor(replacement_colour);
                plot(g3, p.x, p.y + 1, 1, 1);
                queue.add(new Point(p.x, p.y + 1));
            }
            if (p.y > 0 && bf.getRGB(p.x, p.y - 1) == target_colour.getRGB()) {
                g3.setColor(replacement_colour);
                plot(g3, p.x, p.y - 1, 1, 1);
                queue.add(new Point(p.x, p.y - 1));
            }
            if (p.x < 600 && bf.getRGB(p.x + 1, p.y) == target_colour.getRGB()) {
                g3.setColor(replacement_colour);
                plot(g3, p.x + 1, p.y, 1, 1);
                queue.add(new Point(p.x + 1, p.y));
            }
            if (p.x > 0 && bf.getRGB(p.x - 1, p.y) == target_colour.getRGB()) {
                g3.setColor(replacement_colour);
                plot(g3, p.x - 1, p.y, 1, 1);
                queue.add(new Point(p.x - 1, p.y));
            }
        }
        return bf;
    }

    public void bezierPaint(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int wid) {
        // plotPoint(g, x1, y1, x2, y2, x3, y3, x4, y4);
        for (double t = 0; t <= 1; t += 0.001) {
            double xt = ((Math.pow((1 - t), 3) * x1) + (3 * t * (Math.pow(1 - t, 2)) * x2) + (3 * t * t * (1 - t) * x3)
                    + (Math.pow(t, 3) * x4));
            double yt = ((Math.pow((1 - t), 3) * y1) + (3 * t * (Math.pow(1 - t, 2)) * y2) + (3 * t * t * (1 - t) * y3)
                    + (Math.pow(t, 3) * y4));
            plot(g, (int) Math.round(xt), (int) Math.round(yt), wid, wid);
        }
    }

    public void plotPoint(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        g.setColor(Color.red);
        plot(g, x1, y1, 4, 4);
        plot(g, x2, y2, 4, 4);
        plot(g, x3, y3, 4, 4);
        plot(g, x4, y4, 4, 4);
        g.setColor(Color.BLACK);
    }

    private void plot(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }

    private void exportImage(BufferedImage image, String name) {
        try {
            ImageIO.write(image, "png", new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
