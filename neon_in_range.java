import java.util.Scanner;

public class neon_in_range {
    public static void main(string[]aargs){
        Scanner abc =new Scanner(System.in);
        int a= abc.nextInt();
        int a1=abc.nextInt();
        int b=0,d=0,c=0,i=0;
        for(i=a;i<a1;i++){
            b=i*i;
            while (b>0) {
                d=b%10;
                //System.out.println(d);
                c=c+d;
                b/=10;
                //System.out.println(b);
                //System.out.println(c);
                if(i==c){
                System.out.println(i);
                }
            }
        
            
        }

    }
}
