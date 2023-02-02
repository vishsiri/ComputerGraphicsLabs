import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

class Lab3 extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Lab3 m = new Lab3();

        f.add(m);
        f.setTitle("Test Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        // int xPoly[] = {150, 250, 325, 375, 400, 275, 100};
        // int yPoly[] = {150, 100, 125, 225, 325, 375, 300};
        // Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);

        // Polygon poly = new Polygon();
        // poly.addPoint(150, 150);
        // poly.addPoint(250, 100);
        // poly.addPoint(325, 125);
        // poly.addPoint(375, 225);
        // poly.addPoint(400, 325);
        // poly.addPoint(275, 375);
        // poly.addPoint(100, 300);
        // g.drawPolygon(poly);

        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.DARK_GRAY);
        g2.fillRect(0, 0, 600, 600);

        bezierPaint(g2, 100, 100, 200, 300, 300, 100, 400, 300);
        int xPoly[] = { 150, 250, 325, 375, 400, 275, 100 };
        int yPoly[] = { 150, 100, 125, 225, 325, 375, 300 };
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.drawPolygon(poly);

        buffer = floodFill(buffer, 200, 200, Color.DARK_GRAY, Color.WHITE);
        buffer = floodFill(buffer, 200, 150, Color.DARK_GRAY, Color.blue);
        buffer = floodFill(buffer, 200, 400, Color.DARK_GRAY, Color.yellow);

        g.drawImage(buffer, 0, 0, null);
    }

    public void bezierPaint(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        plotPoint(g, x1, y1, x2, y2, x3, y3, x4, y4);
        for (double t = 0; t <= 1; t += 0.001) {
            double xt = ((Math.pow((1 - t), 3) * x1) + (3 * t * (Math.pow(1 - t, 2)) * x2) + (3 * t * t * (1 - t) * x3)
                    + (Math.pow(t, 3) * x4));
            double yt = ((Math.pow((1 - t), 3) * y1) + (3 * t * (Math.pow(1 - t, 2)) * y2) + (3 * t * t * (1 - t) * y3)
                    + (Math.pow(t, 3) * y4));
            plot(g, (int) Math.round(xt), (int) Math.round(yt), 1, 1);
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

    public BufferedImage floodFill(BufferedImage bf, int x, int y, Color target_colour, Color replacement_colour) {
        Queue<Point> queue = new LinkedList<Point>();
        Graphics2D g3 = bf.createGraphics();

        if (bf.getRGB(x, y) == target_colour.getRGB()) {
            g3.setColor(replacement_colour);
            plot(g3, x, y, 1, 1);
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

    private void plot(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }
}