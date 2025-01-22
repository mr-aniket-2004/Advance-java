import java.awt.*;
import java.awt.event.*;

public class Slip12a extends Frame implements Runnable, ActionListener{
    TextField tf;
    Button b ,b1;
    Thread t;
    int i=1;
    volatile boolean running = false;

    Slip12a() throws Exception{
        tf = new TextField(20);
        b = new Button("Start");
        b1 = new Button("Stop");
        t = new Thread(this);
        Font f = new Font("Arial", Font.BOLD,20);
        setFont(f);
        setSize(500, 500);
        add(tf);
        add(b);
        add(b1);
        setVisible(true);
        setLayout(new GridLayout(3, 1));
        b.addActionListener(this);
        b1.addActionListener(this);
    }
    
    public void run(){
        try{
            while (true) { 
                if (running) {
                    tf.setText(i+"");
                    i++;
                    if (i>=100) {
                        i=1;
                        
                    }
                    
                    Thread.sleep(500);
                   
                }
                  
            }
            
        }catch(Exception ee){}
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b) {
            running =true;
            t.start();  
                   
        }
        else if (e.getSource()==b1) {
            running=false;
            tf.setText("Stopped"); 
        }
    }
    public static void main(String[] args) throws Exception {
        Slip12a ob = new Slip12a();
    }
}