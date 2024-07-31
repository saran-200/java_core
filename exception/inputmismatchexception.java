package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputmismatchexception{
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        try{
            int a = abc.nextInt();
            int b = abc.nextInt();
            System.out.println(a/b);
            System.out.println("No error mame");
        }

        // with single catch block 

        // catch(Exception ex){
        //     System.out.println(ex);
        // }
        // System.out.println("welcome");

        // with mutltiple catch block


        // catch(InputMismatchException ex){
        //     System.out.println("olunga numberaa kudu da");
        // }
        // catch(ArithmeticException ar){
        //         System.out.println("arithmetic error(divide la  zero kudukatha da )");
        // }



        // with finally key word

        finally {
            System.out.println(" error mame ");
        }
    }
}
