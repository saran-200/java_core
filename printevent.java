import java.util.Scanner;

public class printevent {

    public static void main(string[] args) {
        Scanner abc= new Scanner(System.in);
        int a=abc.nextInt();
        int b=abc.nextInt();
        for (int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
            
        }
    }
}