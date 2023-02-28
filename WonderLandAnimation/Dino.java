import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Dino extends JPanel implements Runnable {
    double px = 0;
    int x = 1;
    int timepast = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Dino m = new Dino();

        f.add(m);
        f.setTitle("Wonderland 64050060 & 64050229");
        f.setSize(600, 600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }
    @Override
    public void run(){
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime, timechecks = 0;
        double speedwalk = 0.05;

        while(true){
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;
            timechecks += elapsedTime/1000;
            if(timechecks >= 0 && timechecks < speedwalk){
                timepast = 1;
                
            }
            else if(timechecks < speedwalk*2){
                timepast = 2;
                
            }
            else if(timechecks < speedwalk*3){
                timepast = 3;
                    
            }
            else if(timechecks < speedwalk*4){
                timepast = 4;
                    
            }
            else if(timechecks < speedwalk*5){
                timepast = 5;
                    
            }
            else if(timechecks < speedwalk*6){
                timepast = 6;
                    
            }
            if(timechecks >= speedwalk*6) timechecks = 0;
            repaint();
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        // g2.setColor(Color.pink);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);
        
        if (timepast == 1){
            // _1
            // nose
            bezierPaint(g2, 304,319,320,332,336,339,350,337,4);
            bezierPaint(g2, 350,337,374,332,392,316,402,295,4);
            bezierPaint(g2, 402, 295, 404, 280, 398, 255, 380, 236, 4);
            bezierPaint(g2, 380, 236, 372, 232, 336, 223, 306, 263, 4);
            
            //eyes
            bezierPaint(g2, 323, 245, 318, 202, 303, 208, 292, 230, 3);
            bezierPaint(g2, 292, 230, 278, 202, 258, 219, 265, 264, 3);
            bezierPaint(g2, 292, 230, 286, 196, 259, 195, 250, 234, 3);
            bezierPaint(g2, 250, 234, 250, 253, 251, 263, 253, 271, 3);
            bezierPaint(g2, 319, 224, 314, 201, 298, 199, 289, 216, 3);

            g2.drawOval(279, 237, 16, 24);
            g2.drawOval(301, 234, 14, 22);

            //undereyes
            bezierPaint(g2, 303,264,291,274,279,275,270,270,3);

            //wavy
            bezierPaint(g2, 248,248,222,257,220,263,242,287,3);
            bezierPaint(g2, 242,287,211,313,210,315,248,334,3);
            bezierPaint(g2, 248,334,243,342,243,351,244,358,3);


            //mouth
            bezierPaint(g2, 309, 310,305,313,303,315,297,319,5);
            bezierPaint(g2, 350, 337,343,346,326,355,317,355,5);

            //cheek
            bezierPaint(g2, 253, 271, 224, 299, 235, 337, 275, 353, 3);
            
            // back body
            bezierPaint(g2, 275, 353, 280, 396, 258, 406, 245, 403, 4);
            bezierPaint(g2, 245, 403, 229, 401, 218, 390, 225, 379, 4);
            bezierPaint(g2, 225, 379, 205, 378, 197, 373, 197, 373, 3);

            //tail
            bezierPaint(g2, 197, 373, 175, 360, 166, 360, 173, 386, 3);
            bezierPaint(g2, 173, 386, 176, 409, 204, 445, 228, 452, 3);

            //front leg
            bezierPaint(g2, 235, 442, 230, 457, 227, 461, 223, 467, 3);
            bezierPaint(g2, 285, 444, 285, 467, 275, 478, 261, 485, 3);
            bezierPaint(g2, 261, 485, 248, 483, 232, 475, 223, 467, 3);
            bezierPaint(g2, 261, 485, 264, 493, 263, 498, 256, 505, 3);
            bezierPaint(g2, 237, 511, 256, 503, 267, 507, 273, 508, 3);
            bezierPaint(g2, 274, 507, 289, 514, 290, 529, 276, 540, 3);
            bezierPaint(g2, 276, 540, 276, 542, 275, 544, 272, 547, 3);
            bezierPaint(g2,272, 547, 257, 547, 237, 547, 217, 547,3);
            bezierPaint(g2,217, 547, 204, 540, 196, 521, 192, 509,3);
            bezierPaint(g2,192, 509, 190, 502, 191, 497, 197, 498,3);
            bezierPaint(g2,197, 498, 200, 489, 203, 486, 211, 484,3);
            bezierPaint(g2,211, 484, 212, 475, 216, 469, 223, 467,3);

            //saddle
            bezierPaint(g2, 275, 353, 249, 351, 231, 360, 225, 379, 2);
            bezierPaint(g2, 275, 353, 266, 362, 267, 373, 262, 383, 3);
            bezierPaint(g2, 262, 383, 249, 392, 232, 390, 235, 365, 3);

            //front arm
            bezierPaint(g2, 297, 367, 304, 376, 309, 381, 316, 388, 3);
            bezierPaint(g2, 316, 388, 324, 378, 332, 368, 336, 364, 3);
            bezierPaint(g2, 336, 364, 344, 354, 356, 356, 359, 366, 3);
            bezierPaint(g2, 354, 364, 371, 377, 371, 392, 365, 398, 3);
            bezierPaint(g2, 365, 398, 354, 405, 349, 405, 345, 404, 3);
            bezierPaint(g2, 359, 394, 353, 396, 349, 400, 345, 404, 3);
            bezierPaint(g2, 345, 404, 340, 411, 328, 421, 319, 424, 3);
            bezierPaint(g2, 319, 424, 308, 428, 296, 434, 291, 417, 3);
            bezierPaint(g2, 291, 417, 288, 412, 285, 409, 281, 400, 3);

            //front body
            bezierPaint(g2, 326, 355, 326, 359, 328, 364, 330, 371, 3);
            bezierPaint(g2, 327, 421, 321, 442, 307, 456, 284, 465, 3);

            //back leg
            bezierPaint(g2, 341, 410, 354, 426, 357, 438, 348, 457, 3);
            bezierPaint(g2, 348, 457, 332, 454, 316, 457, 305, 455, 3);
            bezierPaint(g2, 348, 457, 350, 461, 351, 465, 349, 471, 3);
            bezierPaint(g2, 338, 482, 360, 464, 380, 467, 387, 475, 3);
            bezierPaint(g2, 387, 475, 399, 485, 392, 494, 377, 506, 3);
            bezierPaint(g2, 377, 506, 377, 513, 376, 517, 374, 519, 3);
            bezierPaint(g2, 374, 519, 357, 528, 336, 528, 305, 519, 3);
            bezierPaint(g2, 305, 519, 303, 515, 303, 512, 305, 510, 3);
            bezierPaint(g2, 305, 510, 296, 499, 297, 489, 303, 480, 3);
            bezierPaint(g2, 303, 480, 298, 472, 298, 467, 305, 455, 3);

            //white area
            g2.setColor(new Color(248,252,228));
            bezierPaint(g2, 239, 302, 265, 280, 286, 289, 303, 311, 3);
            bezierPaint(g2, 278, 351, 286, 350, 294, 351, 303, 354, 3);
            bezierPaint(g2, 303, 354, 304, 360, 305, 366, 305, 373, 3);
            bezierPaint(g2, 297, 429, 295, 434, 292, 440, 286, 444, 3);
            bezierPaint(g2, 235, 442, 220, 442, 207, 433, 196, 425, 2);

            bezierPaint(g2, 270,270, 268, 267, 267, 265, 265, 264, 1);

            //brown of boots
            g2.setColor(new Color(118,59,25));
            bezierPaint(g2,211, 484, 220, 494, 230, 503, 254, 505,3);
            bezierPaint(g2,275, 539, 252, 539, 232, 539, 222, 539,3);
            bezierPaint(g2,222, 539, 209, 529, 200, 509, 197, 498,3);

            bezierPaint(g2,337, 480, 327, 481,314,481, 306, 479,3);
            bezierPaint(g2,375, 508, 351, 520,324,510, 304,508,3);

            // color green
            buffer = floodFill(buffer, 325, 291, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 320, 397, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 344, 440, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 295, 216, Color.white, new Color(139,197,91));
        
            // color boots
            buffer = floodFill(buffer, 331, 468, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 355, 492, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 244, 525, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 247, 491, Color.white, new Color(190,122,49));
            
            buffer = floodFill(buffer, 242, 543, Color.white, new Color(224,191,119));
            buffer = floodFill(buffer, 346, 520, Color.white, new Color(224,191,119));
            
            //color wavy
            buffer = floodFill(buffer, 237, 270, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 260, 351, Color.white, new Color(179,67,64));
            
            buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));
            
            //color similar to white?
            buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 302,443, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 221, 444, Color.white, new Color(248,252,227));

            //color eyes
            buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
            buffer = floodFill(buffer, 306, 248, Color.white, Color.black);

            //nose hole
            g2.setColor(Color.black);
            bezierPaint(g2,352, 255, 355, 257,358, 259, 360, 260,5);
            bezierPaint(g2,376, 249,374, 252,378, 255, 376,257,5);
        }
        else if (timepast == 2){
            // _3
            //nose
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
            bezierPaint(g2, 245, 408, 229, 406, 218, 395, 225, 384, 4);
            bezierPaint(g2, 225, 384, 205, 383, 197, 378, 197, 378, 3);

            //tail
            bezierPaint(g2, 197, 379, 177, 368, 167, 376, 173, 391, 3);
            bezierPaint(g2, 173, 391, 176, 414, 204, 450, 228, 457, 3);

            //front leg
            bezierPaint(g2, 237, 442, 232, 457, 229, 461, 225, 467, 3);
            bezierPaint(g2, 291,457, 285, 469, 275, 479, 262, 487, 3);
            bezierPaint(g2, 261, 482, 248, 485, 232, 477, 223, 469, 3);
            bezierPaint(g2, 261, 485, 266, 493, 264, 498, 256, 505, 3);
            bezierPaint(g2, 237, 511, 256, 503, 267, 507, 273, 508, 3);
            bezierPaint(g2, 274, 507, 289, 514, 290, 529, 276, 540, 3);
            bezierPaint(g2, 276, 540, 276, 542, 275, 544, 272, 547, 3);
            bezierPaint(g2,272, 547, 257, 547, 237, 547, 217, 547,3);
            bezierPaint(g2,217, 547, 204, 540, 196, 521, 192, 509,3);
            bezierPaint(g2,192, 509, 190, 502, 191, 497, 197, 498,3);
            bezierPaint(g2,197, 498, 200, 489, 203, 486, 211, 484,3);
            bezierPaint(g2,211, 484, 212, 475, 216, 469, 223, 467,3);

            //saddle
            bezierPaint(g2, 275, 358, 249, 356, 231, 365, 225, 384, 2);
            bezierPaint(g2, 275, 358, 266, 367, 267, 378, 262, 388, 3);
            bezierPaint(g2, 262, 388, 249, 397, 232, 395, 235, 370, 3);

            //front arm
            bezierPaint(g2, 297, 367, 298, 386, 302, 395, 307, 404, 3);
            bezierPaint(g2, 307, 404, 324, 382, 332, 372, 345, 380, 3);
            bezierPaint(g2, 345, 380, 351, 379, 355, 385, 345, 390, 3);
            bezierPaint(g2, 345, 390, 357, 414, 354, 423, 337, 429, 3);
            bezierPaint(g2, 346, 417, 330, 437, 317, 437, 305, 443, 3);
            bezierPaint(g2, 305, 443, 294,445,287,441,279,427, 3);
            bezierPaint(g2, 279, 427, 272, 400, 268, 400, 274, 384, 3);

            //front body
            bezierPaint(g2, 326, 360, 326, 364, 328, 369, 330, 376, 3);
            bezierPaint(g2, 327, 436, 324, 447, 310, 461, 284, 470, 3);

            //back leg
            bezierPaint(g2, 341, 430, 354, 436, 357, 448, 348, 467, 3);
            bezierPaint(g2, 348, 467, 332, 466, 316, 469, 303, 469, 3);
            bezierPaint(g2, 348, 468, 350, 471, 351, 473, 349, 476, 3);
            bezierPaint(g2, 338, 487, 360, 469, 380, 472, 387, 480, 3);
            bezierPaint(g2, 387, 480, 399, 490, 392, 497, 377, 509, 3);
            bezierPaint(g2, 377, 509, 377, 516, 376, 520, 374, 522, 3);
            bezierPaint(g2, 374, 525, 357, 528, 336, 528, 305, 529, 3);
            bezierPaint(g2, 305, 529, 303, 525, 303, 522, 305, 520, 3);
            bezierPaint(g2, 305, 520, 296, 509, 297, 499, 303, 490, 3);
            bezierPaint(g2, 303, 490, 298, 482, 298, 477, 302, 462, 3);

            //white area
            g2.setColor(new Color(248,252,228));
            bezierPaint(g2, 239, 307, 265, 285, 286, 294, 303, 316, 3);
            bezierPaint(g2, 278, 356, 286, 355, 294, 356, 303, 359, 3);
            bezierPaint(g2, 303, 359, 307, 365, 308, 371, 305, 395, 3);
            bezierPaint(g2, 298, 446, 298, 448, 295, 450, 293, 455, 3);
            bezierPaint(g2, 233, 447, 218, 447, 205, 438, 194, 428, 2);

            bezierPaint(g2, 270,275, 268, 272, 267, 270, 265, 269, 1);

            //brown of boots
            g2.setColor(new Color(118,59,25));
            bezierPaint(g2,211, 484, 220, 494, 230, 503, 254, 505,3);
            bezierPaint(g2,275, 539, 252, 539, 232, 539, 222, 539,3);
            bezierPaint(g2,222, 539, 209, 529, 200, 509, 197, 498,3);

            bezierPaint(g2,337, 485, 327, 486,314,486, 304, 486,3);
            bezierPaint(g2,375, 513, 351, 520,324,515, 302,519,3);

            // color green
            buffer = floodFill(buffer, 325, 291, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 320, 397, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 344, 440, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 295, 220, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
        
            // color boots
            buffer = floodFill(buffer, 331, 478, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 355, 492, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 244, 525, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 247, 491, Color.white, new Color(190,122,49));
            
            buffer = floodFill(buffer, 242, 543, Color.white, new Color(224,191,119));
            buffer = floodFill(buffer, 346, 520, Color.white, new Color(224,191,119));
            
            //color wavy
            buffer = floodFill(buffer, 237, 270, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 260, 353, Color.white, new Color(179,67,64));
            
            buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));
            
            //color similar to white?
            buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 302,448, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 221, 449, Color.white, new Color(248,252,227));

            //color eyes
            buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
            buffer = floodFill(buffer, 306, 248, Color.white, Color.black);

            //nose hole
            g2.setColor(Color.black);
            bezierPaint(g2,352, 255, 355, 257,358, 259, 360, 260,5);
            bezierPaint(g2,376, 249,374, 252,378, 255, 376,257,5);        
            g.drawImage(buffer, 0, 0, null);
        }
        else if (timepast == 3){
            // _4
            //white area
            g2.setColor(new Color(248,252,228));
            bezierPaint(g2, 278, 356, 290, 362, 290, 362, 301, 361, 2);
            bezierPaint(g2, 300, 361, 308, 376, 308, 409, 299, 423, 2);
            bezierPaint(g2, 295, 441, 294, 452, 294, 452, 296, 452, 2);
            bezierPaint(g2, 234, 456, 220, 456, 203, 446, 190, 430, 3);
            bezierPaint(g2, 265, 272, 267, 273, 268, 275, 269, 276, 2);

            bezierPaint(g2, 239, 312, 266, 288, 284, 292, 308, 318, 2);
            g2.setColor(Color.black);
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
            bezierPaint(g2, 248,339,243,347,243,356,244,368,3);


            //mouth
            bezierPaint(g2, 309, 315,305,318,303,320,297,324,5);
            bezierPaint(g2, 350, 342,343,351,326,360,317,360,5);

            //cheek
            bezierPaint(g2, 253, 276, 224, 304, 235, 342, 275, 358, 3);
            
            // //tail
            bezierPaint(g2, 221, 386, 211, 384, 201, 380, 197,379, 3);
            bezierPaint(g2, 197, 379, 177, 368, 167, 376, 173, 391, 3);
            bezierPaint(g2, 173, 391, 176, 414, 200, 450, 223, 468, 3);

            // //front leg
            bezierPaint(g2, 240, 450, 238, 459, 238, 459, 231, 467, 3);
            bezierPaint(g2, 297,454,294,469,287,479,267,486, 3);
            bezierPaint(g2, 229, 467,253, 484,237,475,266,487, 3);
            bezierPaint(g2, 263, 486, 272, 493,270,503,255,507, 3);
            bezierPaint(g2, 242, 511,277, 506,274,504,286,521, 3);
            bezierPaint(g2, 285,520,288,533,288,533, 276,548, 3);
            bezierPaint(g2, 276, 548, 276, 553,276,553,274,557, 3);
            bezierPaint(g2,272,558,219,556,219,556, 217,555,3);
            bezierPaint(g2,217, 555,201,530,201,530,195,503,3);
            bezierPaint(g2,194,505,195,498,195,498,200,496,3);
            bezierPaint(g2,203,495,203,487,210,482,215,482,3);
            bezierPaint(g2,217,483,219,470, 216,474,227, 467,3);

            //saddle
            bezierPaint(g2, 262,370,242,367,230,376,231,395, 2);
            bezierPaint(g2, 235,375,217,387,214,402,227,411, 3);
            // bezierPaint(g2, 262, 388, 249, 397, 232, 395, 235, 370, 3);

            // //front arm
            bezierPaint(g2, 275,360,240,381,242,379,232,395, 3);
            bezierPaint(g2, 234,391,227,403,229,419,239,429, 3);
            bezierPaint(g2, 240,430,269,459,269,459,290,433, 3);
            bezierPaint(g2, 286,386,268,403,268,403,286,416, 3);
            bezierPaint(g2, 287,414,303,430,303,439,287,438, 3);

            //front body
            bezierPaint(g2, 327, 360,339,415,334,453,292,473, 3);
            // bezierPaint(g2, 327, 436, 324, 447, 310, 461, 284, 470, 3);

            //back leg
            bezierPaint(g2, 334, 401, 350, 409, 352, 423, 342, 438, 3);
            bezierPaint(g2, 332, 426, 349, 444, 347, 463, 339, 475, 3);
            bezierPaint(g2, 338, 474, 323, 477, 291, 478, 294, 472, 3);
            bezierPaint(g2, 296, 475, 290, 478, 287, 489, 295, 496, 3);
            bezierPaint(g2, 296, 496, 286, 505, 289, 520, 299, 525, 3);
            bezierPaint(g2, 297, 527, 297, 532, 297, 532, 300, 536, 3);
            bezierPaint(g2, 302, 537, 315, 539, 352, 536, 369, 532, 3);
            bezierPaint(g2, 370, 532, 373, 521, 373, 521, 368, 516, 3);
            bezierPaint(g2, 371, 517, 382, 507, 383, 490, 374, 484, 3);
            bezierPaint(g2, 372, 483, 363, 474, 349, 474, 329, 495, 3);
            bezierPaint(g2, 340, 484, 342, 478, 342, 478, 336, 474, 3);

            
            // //brown of boots
            g2.setColor(new Color(118,59,25));
            bezierPaint(g2,248, 510, 228, 498, 228, 498, 219, 484, 3);
            bezierPaint(g2,275, 545, 267, 548, 267, 548, 225, 544, 3);
            bezierPaint(g2,225, 545, 215, 533, 206, 510, 204, 498, 3);

            bezierPaint(g2,329, 494, 314, 498, 314, 498, 297, 497, 3);
            bezierPaint(g2,370, 517, 351, 523, 324, 526, 300, 525, 3);

            // color green
            buffer = floodFill(buffer, 300, 215, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 336, 292, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 264, 434, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 330, 462, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 340, 422, Color.white, new Color(139,197,91));

            // // color boots
            buffer = floodFill(buffer, 331, 480, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 355, 492, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 244, 525, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 247, 491, Color.white, new Color(190,122,49));
            
            buffer = floodFill(buffer, 235,551, Color.white, new Color(224,191,119));
            buffer = floodFill(buffer, 336,530, Color.white, new Color(224,191,119));
            
            //color wavy
            buffer = floodFill(buffer, 237, 270, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 260, 353, Color.white, new Color(179,67,64));
            
            buffer = floodFill(buffer, 240, 379, Color.white, new Color(142,31,63));
            
            //color similar to white?
            buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
            // buffer = floodFill(buffer, 302,448, Color.white, new Color(248,252,227));
            // plot(g2,225,460,5,5);
            buffer = floodFill(buffer, 225, 460, Color.white, new Color(248,252,227));

            //color eyes
            buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
            buffer = floodFill(buffer, 306, 248, Color.white, Color.black);

            //nose hole
            g2.setColor(Color.black);
            bezierPaint(g2,352, 255, 355, 257,358, 259, 360, 260,5);
            bezierPaint(g2,376, 249,374, 252,378, 255, 376,257,5);
        }
        else if (timepast == 4){
            // _5
            //white area
            g2.setColor(new Color(248,252,228));
            bezierPaint(g2, 278, 356, 290, 362, 290, 362, 301, 361, 2);
            bezierPaint(g2, 300, 361, 308, 376, 308, 409, 302, 420, 2);
            bezierPaint(g2, 239,454, 220,452,220,452,200,436, 3);
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

            // backhand
            bezierPaint(g2, 330,370,346,382,346,382,354,372,3);
            bezierPaint(g2, 353,372,352,351,364,346,375,367,3);
            bezierPaint(g2, 362,367,369,378,380,377,374,366,3);
            bezierPaint(g2, 362,352,376,333,397,346,398,367,3);
            bezierPaint(g2, 398,366,402,375,390,398,373,366,3);
            bezierPaint(g2, 374,404,360,412,350,411,334,401,3);
            bezierPaint(g2, 394,380,393,386,393,396,374,404,3);
            
            //tail
            bezierPaint(g2, 228,462,198,452,204,450,186,408, 3);
            bezierPaint(g2, 186,408,174,369,172,372,202,372, 3);

            //front leg
            bezierPaint(g2, 303,418,326,452,319,467,285,481, 3);
            bezierPaint(g2, 249,445,259,468,272,472,284,481, 3);
            bezierPaint(g2, 255,454,242,448,237,455,233,466, 3);
            bezierPaint(g2, 234,464,224,465,220,470,218,481, 3);
            bezierPaint(g2, 218,481,211,482,211,482,207,481, 3);
            bezierPaint(g2, 208,485,211,503,216,517,225,529, 3);
            bezierPaint(g2, 226,530,239,542,256,552,270,557, 3);
            bezierPaint(g2,271,556,275,552,275,552,275,546,3);
            bezierPaint(g2,276,547,300,546,312,535,306,513,3);
            bezierPaint(g2,306,512,296,493,283,491,258,500,3);
            bezierPaint(g2,280,478,288,484,284,490,277,495,3);
            bezierPaint(g2,301,537,303,555,303,555,275,552,3);

            // //front arm 
            bezierPaint(g2, 283,358,232,329,231,336,218,351, 3);
            bezierPaint(g2, 218,349,204,368,197,386,202,403, 3);
            bezierPaint(g2, 203,403,206,411,213,416,220,412, 3);
            bezierPaint(g2, 220,411,225,423,237,428,238,402, 3);
            bezierPaint(g2, 237,407,249,407,249,395,243,392, 3);
            bezierPaint(g2, 244,392,247,383,247,383,248,375, 3);
            bezierPaint(g2, 248,381,262,382,262,382,276,381, 3);
            bezierPaint(g2, 268,381,261,397,261,397,243,407, 3);

            //front body
            bezierPaint(g2, 326,358,338,406,338,406,315,440, 3);

            //back leg
            bezierPaint(g2, 317,444,330,480,320,492,298,498, 3);

            
            //brown of boots
            g2.setColor(new Color(118,59,25));
            bezierPaint(g2,234,464,241,483,241,483,264,497, 3);
            bezierPaint(g2,275, 547, 234,523,234,523,218,481, 3);

            // color green
            buffer = floodFill(buffer, 302,483, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 336, 292, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 343,389, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 389,367, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 303,219, Color.white, new Color(139,197,91));

            // color boots
            buffer = floodFill(buffer, 244, 520, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 247, 474, Color.white, new Color(190,122,49));
            
            buffer = floodFill(buffer, 231, 524, Color.white, new Color(224,191,119));
            buffer = floodFill(buffer, 296,548, Color.white, new Color(224,191,119));
            
            //color wavy
            buffer = floodFill(buffer, 246, 266, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
            
            //color similar to white?
            buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 302,448, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 225, 455, Color.white, new Color(248,252,227));

            //color eyes
            buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
            buffer = floodFill(buffer, 312, 248, Color.white, Color.black);

            //nose hole
            g2.setColor(Color.black);
            bezierPaint(g2,352, 260, 355, 262,358, 264, 360, 265,5);
            bezierPaint(g2,376, 254, 374, 257,378, 260, 376,262,5);
        }
        else if (timepast == 5){
            // _6
            //white area
            g2.setColor(new Color(248,252,228));
            bezierPaint(g2, 278, 356, 290, 362, 290, 362, 301, 361, 2);
            bezierPaint(g2, 300, 361, 308, 376, 308, 409, 302, 410, 2);
            bezierPaint(g2, 258,466,234,445,223,456,206,450, 2);
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

            // backhand
            bezierPaint(g2, 330,370,346,382,346,382,354,372,3);
            bezierPaint(g2, 353,372,352,351,364,346,375,367,3);
            bezierPaint(g2, 362,367,369,378,380,377,374,366,3);
            bezierPaint(g2, 362,352,376,333,397,346,398,367,3);
            bezierPaint(g2, 398,366,402,375,390,398,373,366,3);
            bezierPaint(g2, 374,404,360,412,350,411,334,401,3);
            bezierPaint(g2, 394,380,393,386,393,396,374,404,3);
            
            //tail
            bezierPaint(g2, 228,462,198,452,204,450,186,408, 3);
            bezierPaint(g2, 186,408,174,369,172,372,202,372, 3);
            bezierPaint(g2, 228,462,238,465,257,467,267,469, 3);

            //front leg
            bezierPaint(g2, 278,408,310,403,323,418,317,454, 3);
            bezierPaint(g2, 267,469,284,459,302,454,317,454, 3);
            bezierPaint(g2, 268,469,262,482,264,486,273,490, 3);
            bezierPaint(g2, 273,490,267,505,274,517,282,522, 3);
            bezierPaint(g2, 281,520,282,529,282,529,287,532, 3);
            bezierPaint(g2, 286,532,308,531,351,514,362,506, 3);
            bezierPaint(g2, 361,508,361,500,361,500,359,491, 3);
            bezierPaint(g2,360,492,372,469,369,457,353,452,3);
            bezierPaint(g2,353,453,335,452,325,457,313,482,3);
            bezierPaint(g2,320,471,322,458,322,458,314,456,3);

            // //front arm 
            bezierPaint(g2, 283,358,232,329,231,336,218,351, 3);
            bezierPaint(g2, 218,349,204,368,197,386,202,403, 3);
            bezierPaint(g2, 203,403,206,411,213,416,220,412, 3);
            bezierPaint(g2, 220,411,225,423,237,428,238,402, 3);
            bezierPaint(g2, 237,407,249,407,249,395,243,392, 3);
            bezierPaint(g2, 244,392,247,383,247,383,248,375, 3);
            bezierPaint(g2, 248,381,262,382,262,382,276,381, 3);
            bezierPaint(g2, 268,381,261,397,261,397,243,407, 3);

            //front body
            bezierPaint(g2, 326,358,338,406,338,406,315,440, 3);

            //back leg
            bezierPaint(g2, 239,465,248,473,248,473,266,481, 3);
            bezierPaint(g2, 244,468,234,467,230,472,233,485, 3);
            bezierPaint(g2, 235,483,225,482,220,488,220,496, 3);
            bezierPaint(g2, 221,495,214,500,214,500,214,504, 3);
            bezierPaint(g2, 215,501,218,517,226,540,239,551, 3);
            bezierPaint(g2, 239,550,255,555,281,553,292,553, 3);
            bezierPaint(g2, 291,553,297,553,297,553,296,543, 3);
            bezierPaint(g2, 296,543,303,535,303,535,302,530, 3);
            bezierPaint(g2, 259,508,269,503,269,503,274,511, 3);
            
            //brown of boots
            g2.setColor(new Color(118,59,25));
            bezierPaint(g2,262,504,248,500,248,500,234,485, 3);
            bezierPaint(g2,295,543,270,543,270,543,246,543, 3);
            bezierPaint(g2,246,542,229,520,229,520,222,498, 3);

            bezierPaint(g2,312,480,294,484,294,484,273,490, 3);
            bezierPaint(g2,357,496,324,509,324,509,281,522, 3);


            // color green
            buffer = floodFill(buffer, 302,483, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 336, 292, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 343,389, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 389,367, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 220, 420, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 303,219, Color.white, new Color(139,197,91));
            buffer = floodFill(buffer, 261,474, Color.white, new Color(139,197,91));

            // color boots
            buffer = floodFill(buffer, 251, 527, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 252,487, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 293,472, Color.white, new Color(190,122,49));
            buffer = floodFill(buffer, 328,482, Color.white, new Color(190,122,49));

            buffer = floodFill(buffer, 336,511, Color.white, new Color(224,191,119));
            buffer = floodFill(buffer, 254,548, Color.white, new Color(224,191,119));
            
            //color wavy
            buffer = floodFill(buffer, 246, 266, Color.white, new Color(179,67,64));
            buffer = floodFill(buffer, 231, 319, Color.white, new Color(179,67,64));
            
            //color similar to white?
            buffer = floodFill(buffer, 280, 323, Color.white, new Color(248,252,227));
            buffer = floodFill(buffer, 232,458, Color.white, new Color(248,252,227));

            //color eyes
            buffer = floodFill(buffer, 288, 254, Color.white, Color.black);
            buffer = floodFill(buffer, 312, 248, Color.white, Color.black);

            //nose hole
            g2.setColor(Color.black);
            bezierPaint(g2,352, 260, 355, 262,358, 264, 360, 265,5);
            bezierPaint(g2,376, 254, 374, 257,378, 260, 376,262,5);
        }
        else if(timepast == 6){
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
        }
        g.drawImage(buffer, 0, 0, null);
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
}