import java.util.Scanner;

public class prime_in_range {

    public static void main(string[] args) {
        Scanner abc =new Scanner(System.in);
        int a =abc.nextInt();
        int b=abc.nextInt();
        int flag=0;
        for(int i=a+1;i<b;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }else{
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
       
    }
}