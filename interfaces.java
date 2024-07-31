// interface face{
//      void inter();
// }
// class faces implements face{
//     public void inter(){
//         System.out.println("welcome");
//     }
// }
// public class interfaces{
//     public static void main(String[] args) {
//         faces f=new faces();
//         f.inter();
//     }
// }



// interfaves in multiple inheritance
interface draw{
    void square();
}
class rec implements draw{
    public void square(){
        System.out.println("rectangle");
    }
}
class triangle implements draw{
    public void square(){
        System.out.println("triangle");
    }
}

public class interfaces{
    public static void main(String[] args) {
        draw d=new rec();
        d.square();
    }
}
