package thread;

class Main implements Runnable{
    public void run(){
        int sum=0;
        for(int i=0;i<=3;i++){
            sum+=i;
        }
        try{
            Thread.sleep(6000);
        }catch(Exception e){
            System.out.println("dolls");
    
        }System.out.println(sum);
    }    
    public static void main(String[] args) {
        thr a=new thr();
        Thread t=new Thread("saran");
        System.out.println(t.getName());
        Thread t1=new Thread("beddy");
        System.out.println(t1.getName());
        
        t.run();
        System.out.println(t.isAlive());
        t.stop();
        t1.();
        t1.setName("virat");
        System.out.println(t1.getName());

    }
    
}
