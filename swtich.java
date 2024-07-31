import java.util.Scanner;

public class swtich {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("enter num1");
        int a = abc.nextInt();
        System.out.println("enter num2");
        int b = abc.nextInt();
        System.out.println("enter the operation");
        char i =abc.next().charAt(0);
        switch(i)
        {
            case'+':
                System.out.println("addition");
                System.out.println(a+b);
                break;
            case'-':
                System.out.println("subraction");
                System.out.println(a-b);
                break;
            case'*':
                System.out.println("multiple");
                System.out.println(a*b);
                break;
            case'/':
                System.out.println("divide");
                System.out.println(a/b);
                break;
            case'%':
                System.out.println("reminder");
                System.out.println(a%b);
                break;
            default:
                System.out.println("invalid input");
                

        }
    }
    
}
