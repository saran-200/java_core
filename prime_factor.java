
// to find largest prime factor of the number

import java.util.Scanner;

public class prime_factor {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int temp=0,facto,pfacto;
        for(int i=0;i<=a;i++){
           if(a%i==0){
             temp=i;
            };
           if(isPrime(temp)){
            return temp;
           }
        }System.out.println(temp);
    }
    
}
