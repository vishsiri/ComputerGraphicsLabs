import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1_64050060_64050229 extends JPanel{
    public static void main(String[] args){
        JFrame f = new JFrame();
        Assignment1_64050060_64050229 m = new Assignment1_64050060_64050229();

        f.add(m);
        f.setTitle("Bunny Cuteธึ 64050060 & 64050229");
        f.setSize(600,600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent (Graphics g){
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);

        

        // layOut

        // earleft
        bezierPaint(g2, 158, 247, 54, 203, 112, 157, 190, 235, 4);
        // earright
        bezierPaint(g2, 190, 235, 100, 165, 165, 127, 224, 226, 4);
        // cheekleft
        bezierPaint(g2, 158, 247, 70, 284, 70, 391, 155, 428, 4);
        // sidebody left
        bezierPaint(g2, 155, 428, 141, 485, 135, 530, 130, 600, 4);
        // cheekright
        bezierPaint(g2, 224, 226, 271, 219, 319, 247, 332, 277, 4);
        // mouthright
        bezierPaint(g2, 334, 277, 338, 277, 344, 277, 343, 293, 4);
        // mouth1
        bezierPaint(g2, 343, 293, 277, 270, 210, 343, 209, 380, 4);
        // mouth2
        bezierPaint(g2, 209, 380, 201, 405, 211, 432, 271, 462, 4);
        // hand
        bezierPaint(g2, 271, 462, 289, 477, 283, 490, 259, 490, 4);
        // armdown
        bezierPaint(g2, 259, 490, 259, 491, 225, 478, 201, 458, 4);
        // other arm ?
        bezierPaint(g2, 201, 458, 189, 452, 175, 469, 180, 483, 4);
        // other armbelow ?
        bezierPaint(g2, 180, 483, 188, 499, 201, 502, 217, 510, 4);
        // other sidebody ?
        bezierPaint(g2, 217, 510, 220, 515, 230, 530, 210, 600, 4);
        // another head
        bezierPaint(g2, 342, 293, 459, 329, 439, 497, 299, 459, 4);
        // sidebody
        bezierPaint(g2, 340, 467, 345, 500, 345, 551, 330, 600, 4);
    
        

        //eyes
        g2.drawOval(208, 255, 13, 15);
        g2.drawOval(240, 242, 13, 15);
        
        //nose
        g2.drawOval(231, 262, 17, 15);

        //line under nose
        bezierPaint(g2, 246, 274, 246, 273, 274, 288, 276, 296, 2);
    
        // eyes swop
        g2.drawOval(278, 349, 13, 15);


        // shadow
        g2.setColor(Color.LIGHT_GRAY);
        bezierPaint(g2, 345, 297, 261, 294, 204, 362, 218, 419, 2);
        g2.setColor(Color.black);
        buffer = floodFill(buffer, 264, 312, Color.white, Color.LIGHT_GRAY);

        // shadow under arm
        g2.setColor(Color.LIGHT_GRAY);
        bezierPaint(g2, 283, 486, 265, 506, 245, 507, 213, 471, 1);
        g2.setColor(Color.black);
        buffer = floodFill(buffer, 253, 493, Color.white, Color.LIGHT_GRAY);

        // shadow under arm
        g2.setColor(Color.LIGHT_GRAY);
        bezierPaint(g2, 222, 529, 209, 523, 205, 520, 182, 490, 1);
        g2.setColor(Color.black);
        buffer = floodFill(buffer, 215, 521, Color.white, Color.LIGHT_GRAY);

        // other mouth
        bezierPaint(g2, 220, 350, 227, 372, 248, 384, 267, 388, 3);
        
        // eyes left other
        bezierPaint(g2, 252, 312, 260, 323, 250, 335, 240, 323, 3);

        // red cheek
        g2.setColor(Color.pink);
        g2.drawOval(168, 280, 53, 55);
        g2.setColor(Color.black);

        // red cheek right
        g2.setColor(Color.pink);
        bezierPaint(g2, 298, 247, 298, 268, 312, 268, 322, 268, 3);
        g2.setColor(Color.black);

        // bg sunnies 1
        g2.setColor(new Color(0xcd545c));
        bezierPaint(g2, 400, 200, 400, 200, 400, 200, 400, 200, 3);
        g2.setColor(Color.black);
        // bg sunnies 2
        g2.setColor(new Color(0xf08080));
        bezierPaint(g2, 321, 257, 458, 230, 600, 135, 600, 135, 1);
        g2.setColor(Color.black);
        // bg sunnies 3
        g2.setColor(new Color(0xe9967a));
        bezierPaint(g2, 344, 486, 499, 473, 600, 473, 600, 400, 1);
        g2.setColor(Color.black);
        



        



        // fill colour
        // eyes left
        buffer = floodFill(buffer, 210, 260, Color.white, Color.black);
        // eyes right
        buffer = floodFill(buffer, 242, 248, Color.white, Color.black);
        // nose
        buffer = floodFill(buffer, 235, 266, Color.white, Color.black);

        // eye of another
        buffer = floodFill(buffer, 281, 352, Color.white, Color.black);
        // eye left of other
        buffer = floodFill(buffer, 250, 323, Color.LIGHT_GRAY, Color.black);
        // red cheek left
        buffer = floodFill(buffer, 180, 290, Color.white, Color.pink);
        // red cheek right
        buffer = floodFill(buffer, 310, 259, Color.white, Color.pink);
        // sunnies bg
        buffer = floodFill(buffer, 410, 210, Color.white, new Color(0xcd545c));
        // sunnies bg 2
        buffer = floodFill(buffer, 330, 265, Color.white, new Color(0xf08080));
        // sunnies bg 3
        buffer = floodFill(buffer, 350, 495, Color.white, new Color(0xe9967a));






        

        g.drawImage(buffer, 0, 0, null);


        exportImage(buffer, "bunny.png");
    }
    public BufferedImage floodFill(BufferedImage bf, int x, int y, Color target_colour, Color replacement_colour) {
        Queue<Point> queue = new LinkedList<Point>();
        Graphics2D g3 = bf.createGraphics();

        if (bf.getRGB(x, y) == target_colour.getRGB()) {
            g3.setColor(replacement_colour);
            plot(g3, x, y,4 ,4);
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
        for(double t = 0; t <= 1; t += 0.001){
            double xt = ((Math.pow((1-t),3)*x1)+(3*t*(Math.pow(1-t, 2))*x2)+(3*t*t*(1-t)*x3)+(Math.pow(t, 3)*x4));
            double yt = ((Math.pow((1-t),3)*y1)+(3*t*(Math.pow(1-t, 2))*y2)+(3*t*t*(1-t)*y3)+(Math.pow(t, 3)*y4));
            plot(g,(int) Math.round(xt),(int) Math.round(yt), wid, wid);
        }
    }
    public void plotPoint(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        g.setColor(Color.red);
        plot(g, x1, y1,4 ,4);
        plot(g, x2, y2, 4, 4);
        plot(g, x3, y3, 4, 4);
        plot(g, x4, y4, 4, 4);
        g.setColor(Color.BLACK);
    }
    private void plot(Graphics g, int x, int y,int width, int height){
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
