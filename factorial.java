import java.util.*;
public class factorial {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        int temp=1;
        for(int i=1; i<=a;i++){
            temp=temp*i;
        }
        System.out.println(temp);

    }
    
}
