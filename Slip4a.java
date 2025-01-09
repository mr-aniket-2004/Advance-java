class display implements Runnable{
    Thread t;
    int cnt;
    display(int no){
        t = new Thread(this);
        t.start();
        cnt = no;
    }
    public void run(){
        try{
            for (int i=1;i<= cnt;i++){
                System.out.println(i + "\t Hello World");
                Thread.sleep(500);
            }
            System.out.println("End of Thread");
        }catch(Exception e){}
    }
}

public class Slip4a {
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(args[0]);
        display ob = new display(n);
    }    
}
