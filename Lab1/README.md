#IDEA

สำหรับ idea ในการลากเส้น
เนื่องจาก แกน x y มีจุด corner top-left คือ (0,0) เป็น pos เริ่มซึ่งจุดขอบคือขนาดที่ตั้งไว้
ไม่ว่าเป็นใดๆก็แล้วแต่


##DRAW LINE PRESUDO
```java
        int width = this.getWidth();
        int height = this.getHeight();
        g.setColor(Color.BLACK);
        g.drawLine(0, 0, width, height);
```