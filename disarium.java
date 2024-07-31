import java.util.Scanner;

public class disarium {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt(); 
        int temp =a,temp1=a;
        int r=0,s=0,sq=0,t=0;
        while (temp>0) {
            temp/=10;   
            s++;
        }System.out.println(s);
        // for(int i=a;a>0;s--){
        //     r=a%10;
        //     // System.out.println(sq);
        //     t+=Math.pow(r,s);
        //     a/=10;
        // }System.out.println(t);
        //System.out.println((temp1==t)? "it diserium":"not");
        while (a!=0) {
            r=a%10;
            t+=Math.pow(r,s);
            a/=10;
            s--;     
        }System.out.println(t);
    }
    
}
