
import java.awt.*;

public class Slip7b extends Frame implements Runnable{
    int x=0;
    int xx=0;
    Thread t;
    Image img1,img2;
    Slip7b(){
        t=new Thread(this);
        t.start();
        setSize(1800,800);
        setVisible(true);
        img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Exam\\Desktop\\Temp\\car1.jpg");
        img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Exam\\Desktop\\Temp\\car2.jpg");
    }
    public void run(){
        try {
            while (true) { 
                if(x<=1800){
                    x=x+10;
                    xx=xx+8;
                    Thread.sleep(50);
                }
                else{
                    return;
                }
                repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gg){

        gg.drawImage(img1, x, 100, this);
        gg.drawImage(img2, xx, 550, this);
        // gg.setColor(Color.RED);
        // gg.fillRect(x, 50, 70, 50);
        // gg.setColor(Color.BLUE);
        // gg.fillRect(xx, 150, 70, 50);
        // //gg.fillRect(700, 500, 20, 500);
        gg.drawLine(1700, 0, 1700 , 800);

    }
    public static void main(String[] args) {
        new Slip7b();
    }
}
