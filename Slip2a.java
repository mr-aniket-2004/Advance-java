 class display extends Thread{
    String temp ;
    display(String s){
        start();
        temp = s;
    }
    public void run (){
        try{
            for(int i = 0; i<=temp.length();i++){
                char ch = temp.charAt(i);

                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    System.out.println("Vowels : "+ch);
                    Thread.sleep(500);
                }
            }
        }catch(Exception e){}
    }
 }

public class Slip2a {

     public static void main(String[] args) throws Exception {
        String str = args[0];
        display ob = new display(str);
        ob.join();

    }
}