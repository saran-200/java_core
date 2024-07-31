import java.util.Scanner;

public class amstrongnum {
    public static void main(string[] args) {
        Scanner abc=new Scanner( System.in);
        int a =abc.nextInt();
        int temp=a,temp2=a,r=0,s=0,v=0;
        //System.out.println(temp);
        while(temp>0) {
            temp/=10;
           // System.out.println(r);
            s++;
        }
        System.out.println("count");
        System.out.println(s);
        while( a>=1){
            //System.out.println(a);
            r=a%10;
            System.out.println("digits");
            System.out.println(a);
            v+=Math.pow(r,s);
             a/=10;
        }System.out.println(v);
        System.out.println((v==temp2)? "YES":"NO");
    }
    
}
