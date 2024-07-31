import java.util.Scanner;

public class sum_of_digit {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        int r =0,s=0;

        while (a>0) {
            r=a%10;
            s+=r;
            a/=10;
        } System.out.println(s);
    }
    
}
