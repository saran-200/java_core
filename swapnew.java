import java.util.Scanner;

public class swapnew {
    public static void main(string[] args) {
        Scanner abc= new Scanner(System.in);
        int n=123456,s=0,r=0;
        // for(int i=n;i>0;i/=10){
        //     s=s*10+(i%10);// to reverse the entire numbers
        // } System.out.println(s); // o/p 654321
        // for(int i=s;i>0;i/=100){
        //     r=r*100+(i%100);
        // }System.out.println(r);// o/p 214365

        // altermethod 

        for(int i=n;i>0;s=s*10+(i%10),i/=10);
        for(int i=n;i>0;r=r*100+(i%100),i/=100);
        System.out.println(r);
        System.out.println(s);

    }
    
}
