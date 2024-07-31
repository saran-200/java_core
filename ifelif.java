import java.util.Scanner;

public class ifelif {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int b=abc.nextInt();
        int c=abc.nextInt();
        // if((a>b) && a>c){
        //     System.out.println("A is greater");
        // }
        // else if(b>a && b>c){
        //     System.out.println("B is greater");
        // }
        // else{
        //     System.out.println("C is greater");
        // }

        System.out.println((a>b && a>c)? "A is max": b>c? "B is mac":"C is max");
    }

}
