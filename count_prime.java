import java.util.Scanner;

public class count_prime {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        int s=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                s=s+1;
            }
        }System.out.println((s==2?"prime":"not a prime"));
        
    }
}
