import java.util.Scanner;

public class prime {
    public static void main(string[] args) {
        Scanner abc =new Scanner(System.in);
        int a =abc.nextInt();
        int b=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                b++;
                System.out.println(i);
            }
        }
         System.out.println((b==2? "prime":"not a prime"));
    }
    
}
