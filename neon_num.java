import java.util.Scanner;
// eg ==> intput=9,9*9=81,8+1=9,i/p==o/p;
public class neon_num {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int b=0,c=0;
        b=a*a;
        int d=b;
        while (b>0) {
            d=b%10;
            //System.out.println(b);
            c=c+d;
            b/=10;
           // System.out.println(b);
        }System.out.println(c);
        System.out.println((c==a)?"neon":"not a neon");
    }
    
}
