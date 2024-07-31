// import java.util.Scanner;
// // to reverse the number
// public class reverse {
//     public static void main(String[] args) {
//         Scanner abc =new Scanner(System.in);
//         int a= abc.nextInt();
//         int b=a,x=0,rev=0;
//         while (b>0) {
//             x=b%10;//123%10=3
//             rev=rev*10+x;//0*10+3=3//3*10+2=32//32*10+1=321
//             b/=10;//123/10=12 //12/10=1 //1/10=0 
//         }System.out.println(rev);

//     }
// }


// using for 

import java.util.Scanner;


public class reverse {

    public static void main(string[] args) {
        Scanner abc= new Scanner(System.in);
        int a =abc.nextInt();
        int b=a,x=0,rev=0;
        for(;b>0;b/=10){
            x=b%10;
            rev=rev*10+x;
        }System.out.println("reverse"+rev);
    }
}
