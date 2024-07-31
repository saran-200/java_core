import java.util.Scanner;
// single input,sum it,find the reminder (input%sum==0)==>harshad number
public class harshad_num {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt(); //12
        int b=a ,v=0,sum=0; //b=12
        while (b>0) {
            v=b%10;//12%10=2 
            sum=sum+v;//2==3
            b/=10;// 12/10=1
        }
        if (a%sum==0) {// 12%3==0
            System.out.println("it is harshad nmuber");   
        }else{
            System.out.println("not a hrashad number");
        }
    }
}