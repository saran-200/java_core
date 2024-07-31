import java.util.Scanner;
// get a number check it ia a prime if prime then reverse it and again check it is a prime if is 
public class twisted_prime_num {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int b=a,c=0,d=0,rev=0,e=0;
        for( int i=1;b>=i;i++){
            if(b%i==0){
                c++;
            }
          }// System.out.println(c);
        if(c==2){
                for(;a>0;a/=10){
                    d=a%10;
                    rev=rev*10+d;
                }
        }//System.out.println(rev);
        for(int i=1;rev>=i;i++){
            if(rev%i==0){
                e++;
            }
        }//System.out.println(e);
        System.out.println((e==2)? "tprime":"not");
    }
    
}
