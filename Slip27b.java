
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class Slip27b extends Frame implements ActionListener, Runnable {

    volatile boolean running = false;
    Button start, stop;
    TextField t1;
    Thread t;
    int h, m, s;

    Slip27b() {
        start = new Button("Start");
        stop = new Button("Stop");
        t1 = new TextField(20);
        t = new Thread();

        t.start();
        h = 0;
        m = 0;
        s = 0;
        add(t1);
        add(start);
        add(stop);
        Font f = new Font("Arial", Font.BOLD, 30);
        setFont(f);
        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        start.addActionListener(this);
        stop.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            try {
                running = true;
                t = new Thread(this);
                t.start();
            } catch (Exception ee) {
            }
        }
        else{
            running =false;
        }
    }
    public void run(){
        try {
            while (running) { 
                LocalTime now = LocalTime.now();
                h= now.getHour();
                m= now.getMinute();
                s= now.getSecond();

                t1.setText(h+" : "+m+" : "+s);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        Slip27b ob = new Slip27b();
    }
    
}
