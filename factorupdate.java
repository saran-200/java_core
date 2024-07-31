import java.util.Scanner;
// to find the factor of  two numbers with single loop
public class factorupdate {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a= abc.nextInt();
        int b=abc.nextInt();
        int temp=0,temp1=0;
        int c=Math.max(a, b);// alter (ternary operator)
        for(int i=1;i<=c;i++){
            if(a%i==0){
                temp=temp+i;
            }
            if(b%i==0){
                temp1=temp1+i;
            }
        }
        System.out.println(" smu of a");
        System.out.println(temp);
        System.out.println("sum of b");
        System.out.println(temp1);

    }
}
