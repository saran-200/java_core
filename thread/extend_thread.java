package thread;
public class extend_thread extends Thread{
    public void run(){
        System.out.println("runinnggg......!");
    }

public static void main(String[]args){
    extend_thread t1=new extend_thread();
    t1.start();
}
}