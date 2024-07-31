package thread;
// we need to implement the thread so we need to create the thread while using the implement 
public class thr implements Runnable{
    public void run(){
        System.out.println("running ");
    }
    public static void main(String[] args) {
        thr d=new thr();
        Thread t= new Thread(d);
        t.start(); // use start run or start function 
    }
    
}


    
