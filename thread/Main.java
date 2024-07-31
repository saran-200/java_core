
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
    public static void main(String[]args){
        Main s =new Main();
        Thread t=new Thread(s);
        t.start();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.isAlive());
    }            
}





