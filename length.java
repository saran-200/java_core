//to find the count of the odd an even in the given 

import java.util.*;

public class length {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();

        // String b= String.valueOf(a);// type converting from Sring
        // int c=b.length();
        // System.out.println(c);
        
        // // using Math.log()
        // int b=(int)(Math.log10(a)+1);
        // System.out.println(b);

        // using while
        int r=0,t=0;
        while (a>0) {
            r=a%10;
            t++;
            a/=10;


        }
        
        }
    }
    
