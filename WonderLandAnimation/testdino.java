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

        // _3
        // nose
        bezierPaint(g2, 304,324,320,337,336,344,350,342,4);
        bezierPaint(g2, 350,342,374,337,392,321,402,300,4);
        bezierPaint(g2, 402, 300, 404, 285, 398, 260, 380, 241, 4);
        bezierPaint(g2, 380, 241, 372, 237, 336, 228, 306, 268, 4);
        
        //eyes
        bezierPaint(g2, 323, 250, 318, 207, 303, 213, 292, 235, 3);
        bezierPaint(g2, 292, 235, 278, 207, 258, 224, 265, 269, 3);
        bezierPaint(g2, 292, 235, 286, 201, 259, 200, 250, 239, 3);
        bezierPaint(g2, 250, 239, 250, 258, 251, 268, 253, 276, 3);
        bezierPaint(g2, 319, 229, 314, 206, 298, 204, 289, 221, 3);

        g2.drawOval(279, 242, 16, 24);
        g2.drawOval(301, 239, 14, 22);

        //undereyes
        bezierPaint(g2, 303,269,291,279,279,280,270,275,3);

        //wavy
        bezierPaint(g2, 248,253,222,262,220,268,242,292,3);
        bezierPaint(g2, 242,292,211,318,210,320,248,339,3);
        bezierPaint(g2, 248,339,243,347,243,356,244,363,3);


        //mouth
        bezierPaint(g2, 309, 315,305,318,303,320,297,324,5);
        bezierPaint(g2, 350, 342,343,351,326,360,317,360,5);

        //cheek
        bezierPaint(g2, 253, 276, 224, 304, 235, 342, 275, 358, 3);
        
        // back body
        bezierPaint(g2, 275, 358, 280, 401, 258, 411, 245, 408, 4);
        // bezierPaint(g2, 245, 408, 229, 406, 218, 395, 225, 384, 4);
        // bezierPaint(g2, 225, 384, 205, 383, 197, 378, 197, 378, 3);

        // //tail
        // bezierPaint(g2, 197, 379, 177, 368, 167, 376, 173, 391, 3);
        // bezierPaint(g2, 173, 391, 176, 414, 204, 450, 228, 457, 3);

        // //front leg
        // bezierPaint(g2, 237, 442, 232, 457, 229, 461, 225, 467, 3);
        // bezierPaint(g2, 291,457, 285, 469, 275, 479, 262, 487, 3);
        // bezierPaint(g2, 261, 482, 248, 485, 232, 477, 223, 469, 3);
        // bezierPaint(g2, 261, 485, 266, 493, 264, 498, 256, 505, 3);
        // bezierPaint(g2, 237, 511, 256, 503, 267, 507, 273, 508, 3);
        // bezierPaint(g2, 274, 507, 289, 514, 290, 529, 276, 540, 3);
        // bezierPaint(g2, 276, 540, 276, 542, 275, 544, 272, 547, 3);
        // bezierPaint(g2,272, 547, 257, 547, 237, 547, 217, 547,3);
        // bezierPaint(g2,217, 547, 204, 540, 196, 521, 192, 509,3);
        // bezierPaint(g2,192, 509, 190, 502, 191, 497, 197, 498,3);
        // bezierPaint(g2,197, 498, 200, 489, 203, 486, 211, 484,3);
        // bezierPaint(g2,211, 484, 212, 475, 216, 469, 223, 467,3);

        // //saddle
        // bezierPaint(g2, 275, 358, 249, 356, 231, 365, 225, 384, 2);
        // bezierPaint(g2, 275, 358, 266, 367, 267, 378, 262, 388, 3);
        // bezierPaint(g2, 262, 388, 249, 397, 232, 395, 235, 370, 3);

        // //front arm
        // bezierPaint(g2, 297, 367, 298, 386, 302, 395, 307, 404, 3);
        // bezierPaint(g2, 307, 404, 324, 382, 332, 372, 345, 380, 3);
        // bezierPaint(g2, 345, 380, 351, 379, 355, 385, 345, 390, 3);
        // bezierPaint(g2, 345, 390, 357, 414, 354, 423, 337, 429, 3);
        // bezierPaint(g2, 346, 417, 330, 437, 317, 437, 305, 443, 3);
        // bezierPaint(g2, 305, 443, 294,445,287,441,279,427, 3);
        // bezierPaint(g2, 279, 427, 272, 400, 268, 400, 274, 384, 3);

        // //front body
        // bezierPaint(g2, 326, 360, 326, 364, 328, 369, 330, 376, 3);
        // bezierPaint(g2, 327, 436, 324, 447, 310, 461, 284, 470, 3);

        // //back leg
        // bezierPaint(g2, 341, 430, 354, 436, 357, 448, 348, 467, 3);
        // bezierPaint(g2, 348, 467, 332, 466, 316, 469, 303, 469, 3);
        // bezierPaint(g2, 348, 468, 350, 471, 351, 473, 349, 476, 3);
        // bezierPaint(g2, 338, 487, 360, 469, 380, 472, 387, 480, 3);
        // bezierPaint(g2, 387, 480, 399, 490, 392, 497, 377, 509, 3);
        // bezierPaint(g2, 377, 509, 377, 516, 376, 520, 374, 522, 3);
        // bezierPaint(g2, 374, 525, 357, 528, 336, 528, 305, 529, 3);
        // bezierPaint(g2, 305, 529, 303, 525, 303, 522, 305, 520, 3);
        // bezierPaint(g2, 305, 520, 296, 509, 297, 499, 303, 490, 3);
        // bezierPaint(g2, 303, 490, 298, 482, 298, 477, 302, 462, 3);

        // //white area
        // g2.setColor(new Color(248,252,228));
        // bezierPaint(g2, 239, 307, 265, 285, 286, 294, 303, 316, 3);
        // bezierPaint(g2, 278, 356, 286, 355, 294, 356, 303, 359, 3);
        // bezierPaint(g2, 303, 359, 307, 365, 308, 371, 305, 395, 3);
        // bezierPaint(g2, 298, 446, 298, 448, 295, 450, 293, 455, 3);
        // bezierPaint(g2, 233, 447, 218, 447, 205, 438, 194, 428, 2);

        // bezierPaint(g2, 270,275, 268, 272, 267, 270, 265, 269, 1);

        // //brown of boots
        // g2.setColor(new Color(118,59,25));
        // bezierPaint(g2,211, 484, 220, 494, 230, 503, 254, 505,3);
        // bezierPaint(g2,275, 539, 252, 539, 232, 539, 222, 539,3);
        // bezierPaint(g2,222, 539, 209, 529, 200, 509, 197, 498,3);

        // bezierPaint(g2,337, 485, 327, 486,314,486, 304, 486,3);
        // bezierPaint(g2,375, 513, 351, 520,324,515, 302,519,3);

        // // color green
        // buffer = floodFill(buffer, 325, 291, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 320, 397, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 344, 440, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 295, 220, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
       
        // // color boots
        // buffer = floodFill(buffer, 331, 478, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 355, 492, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 244, 525, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 247, 491, Color.white, new Color(190,122,49));
        
        // buffer = floodFill(buffer, 242, 543, Color.white, new Color(224,191,119));
        // buffer = floodFill(buffer, 346, 520, Color.white, new Color(224,191,119));
        
        // //color wavy
        // buffer = floodFill(buffer, 237, 270, Color.white, new Color(179,67,64));
        // buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
        // buffer = floodFill(buffer, 260, 353, Color.white, new Color(179,67,64));
        
        // buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));
        
        // //color similar to white?
        // buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
        // buffer = floodFill(buffer, 302,448, Color.white, new Color(248,252,227));
        // buffer = floodFill(buffer, 221, 449, Color.white, new Color(248,252,227));

        // //color eyes
        // buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
        // buffer = floodFill(buffer, 306, 248, Color.white, Color.black);

        // //nose hole
        // g2.setColor(Color.black);
        // bezierPaint(g2,352, 255, 355, 257,358, 259, 360, 260,5);
        // bezierPaint(g2,376, 249,374, 252,378, 255, 376,257,5);
        // }
        // // nose
        // bezierPaint(g2, 304,324,320,337,336,344,350,342,4);
        // bezierPaint(g2, 350,342,374,337,392,321,402,300,4);
        // bezierPaint(g2, 402, 300, 404, 285, 398, 260, 380, 241, 4);
        // bezierPaint(g2, 380, 241, 372, 237, 336, 228, 306, 268, 4);
        
        // //eyes
        // bezierPaint(g2, 323, 250, 318, 207, 303, 213, 292, 235, 3);
        // bezierPaint(g2, 292, 235, 278, 207, 258, 224, 265, 269, 3);
        // bezierPaint(g2, 292, 235, 286, 201, 259, 200, 250, 239, 3);
        // bezierPaint(g2, 250, 239, 250, 258, 251, 268, 253, 276, 3);
        // bezierPaint(g2, 319, 229, 314, 206, 298, 204, 289, 221, 3);

        // g2.drawOval(279, 242, 16, 24);
        // g2.drawOval(301, 239, 14, 22);

        // //undereyes
        // bezierPaint(g2, 303,269,291,279,279,280,270,275,3);

        // //wavy
        // bezierPaint(g2, 248,253,222,262,220,268,242,292,3);
        // bezierPaint(g2, 242,292,211,318,210,320,248,339,3);
        // bezierPaint(g2, 248,339,243,347,243,356,244,363,3);


        // //mouth
        // bezierPaint(g2, 309, 315,305,318,303,320,297,324,5);
        // bezierPaint(g2, 350, 342,343,351,326,360,317,360,5);

        // //cheek
        // bezierPaint(g2, 253, 276, 224, 304, 235, 342, 275, 358, 3);
        
        // // back body
        // bezierPaint(g2, 275, 358, 280, 401, 258, 411, 245, 408, 4);
        // bezierPaint(g2, 245, 408, 229, 406, 218, 395, 225, 384, 4);
        // bezierPaint(g2, 225, 384, 205, 383, 197, 378, 197, 378, 3);

        // //tail
        // bezierPaint(g2, 197, 379, 177, 368, 167, 376, 173, 391, 3);
        // bezierPaint(g2, 173, 391, 176, 414, 204, 450, 228, 457, 3);

        // //front leg
        // bezierPaint(g2, 237, 442, 232, 457, 229, 461, 225, 467, 3);
        // bezierPaint(g2, 291,457, 285, 469, 275, 479, 262, 487, 3);
        // bezierPaint(g2, 261, 482, 248, 485, 232, 477, 223, 469, 3);
        // bezierPaint(g2, 261, 485, 266, 493, 264, 498, 256, 505, 3);
        // bezierPaint(g2, 237, 511, 256, 503, 267, 507, 273, 508, 3);
        // bezierPaint(g2, 274, 507, 289, 514, 290, 529, 276, 540, 3);
        // bezierPaint(g2, 276, 540, 276, 542, 275, 544, 272, 547, 3);
        // bezierPaint(g2,272, 547, 257, 547, 237, 547, 217, 547,3);
        // bezierPaint(g2,217, 547, 204, 540, 196, 521, 192, 509,3);
        // bezierPaint(g2,192, 509, 190, 502, 191, 497, 197, 498,3);
        // bezierPaint(g2,197, 498, 200, 489, 203, 486, 211, 484,3);
        // bezierPaint(g2,211, 484, 212, 475, 216, 469, 223, 467,3);

        // //saddle
        // bezierPaint(g2, 275, 358, 249, 356, 231, 365, 225, 384, 2);
        // bezierPaint(g2, 275, 358, 266, 367, 267, 378, 262, 388, 3);
        // bezierPaint(g2, 262, 388, 249, 397, 232, 395, 235, 370, 3);

        // //front arm
        // bezierPaint(g2, 297, 367, 298, 386, 302, 395, 307, 404, 3);
        // bezierPaint(g2, 307, 404, 324, 382, 332, 372, 345, 380, 3);
        // bezierPaint(g2, 345, 380, 351, 379, 355, 385, 345, 390, 3);
        // bezierPaint(g2, 345, 390, 357, 414, 354, 423, 337, 429, 3);
        // bezierPaint(g2, 346, 417, 330, 437, 317, 437, 305, 443, 3);
        // bezierPaint(g2, 305, 443, 294,445,287,441,279,427, 3);
        // bezierPaint(g2, 279, 427, 272, 400, 268, 400, 274, 384, 3);

        // //front body
        // bezierPaint(g2, 326, 360, 326, 364, 328, 369, 330, 376, 3);
        // bezierPaint(g2, 327, 436, 324, 447, 310, 461, 284, 470, 3);

        // //back leg
        // bezierPaint(g2, 341, 430, 354, 436, 357, 448, 348, 467, 3);
        // bezierPaint(g2, 348, 467, 332, 466, 316, 469, 303, 469, 3);
        // bezierPaint(g2, 348, 468, 350, 471, 351, 473, 349, 476, 3);
        // bezierPaint(g2, 338, 487, 360, 469, 380, 472, 387, 480, 3);
        // bezierPaint(g2, 387, 480, 399, 490, 392, 497, 377, 509, 3);
        // bezierPaint(g2, 377, 509, 377, 516, 376, 520, 374, 522, 3);
        // bezierPaint(g2, 374, 525, 357, 528, 336, 528, 305, 529, 3);
        // bezierPaint(g2, 305, 529, 303, 525, 303, 522, 305, 520, 3);
        // bezierPaint(g2, 305, 520, 296, 509, 297, 499, 303, 490, 3);
        // bezierPaint(g2, 303, 490, 298, 482, 298, 477, 302, 462, 3);

        // //white area
        // g2.setColor(new Color(248,252,228));
        // bezierPaint(g2, 239, 307, 265, 285, 286, 294, 303, 316, 3);
        // bezierPaint(g2, 278, 356, 286, 355, 294, 356, 303, 359, 3);
        // bezierPaint(g2, 303, 359, 307, 365, 308, 371, 305, 395, 3);
        // bezierPaint(g2, 298, 446, 298, 448, 295, 450, 293, 455, 3);
        // bezierPaint(g2, 233, 447, 218, 447, 205, 438, 194, 428, 2);

        // bezierPaint(g2, 270,275, 268, 272, 267, 270, 265, 269, 1);

        // //brown of boots
        // g2.setColor(new Color(118,59,25));
        // bezierPaint(g2,211, 484, 220, 494, 230, 503, 254, 505,3);
        // bezierPaint(g2,275, 539, 252, 539, 232, 539, 222, 539,3);
        // bezierPaint(g2,222, 539, 209, 529, 200, 509, 197, 498,3);

        // bezierPaint(g2,337, 485, 327, 486,314,486, 304, 486,3);
        // bezierPaint(g2,375, 513, 351, 520,324,515, 302,519,3);

        // // color green
        // buffer = floodFill(buffer, 325, 291, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 320, 397, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 344, 440, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 295, 220, Color.white, new Color(139,197,91));
        // buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
       
        // // color boots
        // buffer = floodFill(buffer, 331, 478, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 355, 492, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 244, 525, Color.white, new Color(190,122,49));
        // buffer = floodFill(buffer, 247, 491, Color.white, new Color(190,122,49));
        
        // buffer = floodFill(buffer, 242, 543, Color.white, new Color(224,191,119));
        // buffer = floodFill(buffer, 346, 520, Color.white, new Color(224,191,119));
        
        // //color wavy
        // buffer = floodFill(buffer, 237, 270, Color.white, new Color(179,67,64));
        // buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
        // buffer = floodFill(buffer, 260, 353, Color.white, new Color(179,67,64));
        
        // buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));
        
        // //color similar to white?
        // buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
        // buffer = floodFill(buffer, 302,448, Color.white, new Color(248,252,227));
        // buffer = floodFill(buffer, 221, 449, Color.white, new Color(248,252,227));

        // //color eyes
        // buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
        // buffer = floodFill(buffer, 306, 248, Color.white, Color.black);

        // //nose hole
        // g2.setColor(Color.black);
        // bezierPaint(g2,352, 255, 355, 257,358, 259, 360, 260,5);
        // bezierPaint(g2,376, 249,374, 252,378, 255, 376,257,5);
        // g.drawImage(buffer, 0, 0, null);
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
