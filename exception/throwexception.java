import java.util.*;
package exception;
public class throwexception{
    static void validate(int age){
            if(age<18){
                throw new ArrayIndexOutOfBoundsException ();
                                
            }else{
                System.out.println("ne major maple");
            }
        }    

    public static void main(String[] args){
        Scanner abc=new Scanner(System.in);
        int age=abc.nextInt();   
        validate(age);

    }
}