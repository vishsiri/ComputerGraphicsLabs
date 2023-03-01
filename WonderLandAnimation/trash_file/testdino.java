package trash_file;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class testdino extends JPanel {
    double px = 0;
    int x = 1;
    boolean timepast = true;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        testdino m = new testdino();

        f.add(m);
        f.setTitle("Wonderland 64050060 & 64050229");
        f.setSize(600, 600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        // (new Thread(m)).start();
    }
    // @Override
    // public void run(){
    //     double lastTime = System.currentTimeMillis();
    //     double currentTime, elapsedTime, timechecks = 0;

    //     while(true){
    //         // currentTime = System.currentTimeMillis();
    //         // elapsedTime = currentTime - lastTime;
    //         // lastTime = currentTime;
    //         // timechecks += elapsedTime/1000;
    //         // if(timechecks >=1 && timechecks <= 2){
    //         //     timepast = false;
                
    //         // }
    //         // else{
    //         //     timepast = true;
    //         // }
    //         // if(timechecks >= 2) timechecks = 0;
    //         repaint();
    //     }
    // }
    @Override
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        // g2.setColor(Color.pink);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);
        
        // _8
        //white area
        g2.setColor(new Color(248,252,228));
        bezierPaint(g2, 278, 356, 290, 362, 290, 362, 301, 361, 2);
        bezierPaint(g2, 300, 361, 308, 376, 308, 409, 302, 410, 2);
        bezierPaint(g2, 272, 272, 274, 273,275, 275,276, 276, 2);

        bezierPaint(g2, 252, 301, 266, 288, 284, 292, 305, 318, 2);
        g2.setColor(Color.black);

        bezierPaint(g2, 302,271,293,277,293,277,278,274,4);
        bezierPaint(g2, 300,230,315,214,330,217,329,244,4);
        bezierPaint(g2, 300,230,282,213,265,226,271,268,4);
        bezierPaint(g2, 349,343,339,355,339,355,318,359,4);
        bezierPaint(g2, 330,243,326,207,312,204,295,217,4);
        bezierPaint(g2, 301,231,286,202,262,205,257,237,4);
        bezierPaint(g2, 258,235,256,249,256,249,261,273,4);
        bezierPaint(g2, 261,275,239,311,248,330,283,357,4);
        
        // nose
        bezierPaint(g2, 302,272,344,226,381,225,403,268,4);
        bezierPaint(g2, 403,269,409,314,393,343,333,341,4);
        bezierPaint(g2, 331,340,312,335,312,335,303,320, 4);
        bezierPaint(g2, 308,314,304,319,304,319,298, 320, 4);

        g2.drawOval(284, 242, 16, 24);
        g2.drawOval(306, 239, 14, 22);

        //wavy
        bezierPaint(g2, 256,249,226,257,227,262,254,287,3);
        bezierPaint(g2, 250,292,218,314,216,324,255,333,3);

        //saddle
        bezierPaint(g2, 275, 353, 249, 351, 231, 360, 225, 379, 2);
        bezierPaint(g2, 275, 353, 260, 411, 231, 410, 224, 378, 2);
        bezierPaint(g2, 275, 353, 266, 362, 267, 373, 262, 383, 3);
        bezierPaint(g2, 262, 383, 249, 392, 232, 390, 235, 365, 3);

        // // backhand
        bezierPaint(g2, 334,409,376,409,365,437,315,457,3);
        // bezierPaint(g2, 353,372,352,351,364,346,375,367,3);
        // bezierPaint(g2, 362,367,369,378,380,377,374,366,3);
        
        //tail
        bezierPaint(g2, 242,472,214,470,196,454,192,428, 3);
        bezierPaint(g2, 192,428,172,371,178,370,202,378, 3);
        bezierPaint(g2, 202,378,224,384,224,384,224,384, 3);
        // bezierPaint(g2, 230,476,181,445,172,437,165,410, 3);
        // bezierPaint(g2, 165,409,139,322,134,332,233,366, 3);

        // // front leg
        bezierPaint(g2, 284,408,310,403,323,418,312,469, 3);
        bezierPaint(g2, 267,484,284,474,302,469,307,469, 3);
        bezierPaint(g2, 266,487,250,474,250,474,250,474, 3);
        bezierPaint(g2, 263,487,245,475,245,475,225,471, 3);
        bezierPaint(g2, 238,483,238,475,238,475,238,475, 3);
        // bezierPaint(g2, 281,520,282,529,282,529,287,532, 3);
        // bezierPaint(g2, 286,532,308,531,351,514,362,506, 3);
        // bezierPaint(g2,320,471,322,458,322,458,314,456,3);
        bezierPaint(g2, 309,467,318,470,318,470,317,482, 3);
        bezierPaint(g2, 311,494,327,461,345,457,358,468, 3);
        bezierPaint(g2, 355,466,367,472,366,493,360,503, 3);
        bezierPaint(g2, 359,501,361,508,361,508,360,517, 3);
        bezierPaint(g2, 362,515,346,527,312,541,285,547, 3);
        bezierPaint(g2, 286,546,281,544,281,544,283,535, 3);
        bezierPaint(g2, 283,538,265,527,268,517,271,505, 3);
        bezierPaint(g2, 271,506,262,498,261,491,266,484, 3);
        bezierPaint(g2,238,482,229,481,225,488,224,495,3);
        bezierPaint(g2,227,493,219,496,219,496,216,502,3);
        bezierPaint(g2,218,500,220,520,229,535,238,550,3);
        bezierPaint(g2,238,550,254,553,285,554,294,554,3);
        bezierPaint(g2,292,554,296,549,296,549,297,544,3);

        //front arm 
        bezierPaint(g2, 282,358,275,382,243,408,215,424, 3);
        bezierPaint(g2, 216,423,204,439,205,448,221,457, 3);
        bezierPaint(g2, 223,458,221,468,240,483,246,456, 3);
        bezierPaint(g2, 245,463,262,460,267,451,257,443, 3);
        bezierPaint(g2, 257,444,277,422,292,402,295,381, 3);
        
        //front body
        bezierPaint(g2, 326,358,338,406,338,406,315,440, 3);
        
        //brown of boots
        g2.setColor(new Color(118,59,25));
        bezierPaint(g2,265,504,251,500,251,500,237,485, 3);
        bezierPaint(g2,295,548,270,543,270,543,246,543, 3);
        bezierPaint(g2,246,542,229,520,229,520,225,498, 3);

        bezierPaint(g2,310,492,292,496,292,496,271,504, 3);
        bezierPaint(g2,357,506,324,519,324,519,285,537, 3);

        // color green
        buffer = floodFill(buffer,241,427, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 336, 292, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 338,438, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 293,452, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 303,219, Color.white, new Color(139,197,91));
        buffer = floodFill(buffer, 261,474, Color.white, new Color(139,197,91));

        // color boots
        buffer = floodFill(buffer, 287,486, Color.white, new Color(190,122,49));
        buffer = floodFill(buffer, 253,530, Color.white, new Color(190,122,49));
        buffer = floodFill(buffer, 251,488, Color.white, new Color(190,122,49));
        buffer = floodFill(buffer, 328,482, Color.white, new Color(190,122,49));

        buffer = floodFill(buffer, 335,522, Color.white, new Color(224,191,119));
        buffer = floodFill(buffer, 254,548, Color.white, new Color(224,191,119));
        
        //color wavy
        buffer = floodFill(buffer, 246, 266, Color.white, new Color(179,67,64));
        buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
        
        buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));

        //color similar to white?
        buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));

        //color eyes
        buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
        buffer = floodFill(buffer, 312, 248, Color.white, Color.black);

        //nose hole
        g2.setColor(Color.black);
        bezierPaint(g2,352, 260, 355, 262,358, 264, 360, 265,5);
        bezierPaint(g2,376, 254, 374, 257,378, 260, 376,262,5);


        g.drawImage(buffer, 0, 0, null);
        // // exportImage(buffer, "bunny.png");
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
