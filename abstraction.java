abstract class abt{
    abstract void wtr();
}
class abs extends abt{
    void wtr(){
        System.out.println("hello");
    }
}
public class abstraction{
    public static void main(String[] args) {
        abt d=new abs();
        d.wtr();
    }
}r
