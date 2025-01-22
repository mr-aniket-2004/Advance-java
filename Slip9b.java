
import java.awt.*;

public class Slip9b extends Frame implements Runnable {

    int y;
    Thread t;
    boolean runner;

    Slip9b() {
        y = 0;
        runner = true;
        t = new Thread(this);
        t.start();
        setSize(1000, 500);
        setVisible(true);

    }

    public void run() {
        try {
            while (true) {
                if (runner) {
                    y = y + 30;
                } 
                else {
                    y=y-10;
                }
                if(y>=250){
                    runner=false;
                }
                if(y<=100){
                    runner=true;
                }
                
                Thread.sleep(50);
                repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gg) {
        // gg.setColor(Color.BLACK);
        // gg.fillArc(100, y, 50, 50, 360  , 360);
        Color clr = new Color(0, 0, 255);
        gg.setColor(clr);
        gg.fillOval(500, y, 30, 30);

        gg.setColor(Color.RED);
        gg.fillRect(300, 300, 500, 10);

    }

    public static void main(String[] args) {
        new Slip9b();
    }
}
