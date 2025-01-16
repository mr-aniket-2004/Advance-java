import java.awt.*;
import java.awt.event.*;


public class Slip8a extends Frame implements Runnable{
    Thread t;
    Label l1;
    Slip8a(){
        t= new Thread(this);
        t.start();
        l1 = new Label();
        add(l1);
        setVisible(true);
        setSize(800 ,800);
        setLayout(new FlowLayout());
        Font f = new Font("Arial", Font.BOLD, 25);
        l1.setFont(f);

    }
    public void run(){
        try{
            while (true) { 
                l1.setText("Welcome");  
                Thread.sleep(700);
                l1.setText("");
                Thread.sleep(700);
            }
        }catch(Exception ee){}
    }
    public static void main(String[] args) throws Exception{
        Slip8a ob = new Slip8a();
        ob.t.join();
    }
}
