import java.util.Scanner;

public class count_even_odd {
    public static void main(string[] args) {
        Scanner abc =new Scanner(System.in);
        int a = abc.nextInt();
        int r=0,e=0,o=0;
        while (a>0) {
            r=a%10;
            if(r%2==0){ //alternate using ternary operator
                e++;
            }else{
                o++;
            }
            a/=10;
        }System.out.println("odd"+e);
        System.out.println("even"+o);

    }
    
}
