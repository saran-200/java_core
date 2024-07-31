import java.util.*;
public class factor {
    public static void main(string[] args) {
        Scanner abc= new Scanner(System.in);
        int a=abc.nextInt();
        int b=abc.nextInt();
        int temp=0,temp1=0;

        for (int i=1;i<=a;i++){
            if(a%i==0){
                 temp=temp+i; // sum the factors of the digit 
            }
        }System.out.println("sum of a");
        System.out.println(temp);
        for(int i=1;i<=b;i++){
            if(b%i==0){
                temp1=temp1+i;
            }
        }System.out.println("sum of b");
        System.out.println(temp1);
    }
}
    
