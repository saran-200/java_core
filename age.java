import java.util.Scanner;
public class age {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        string b=(a<=5 && a>=0)? "infant":(a<=17 && a>=6)?"Teen":(a>=18 && a<=50)? "adlut":(a>=51)?"aged" :"invalid";
        System.out.println(b) ;
    }
    
}
