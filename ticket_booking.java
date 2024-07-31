import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ticket_booking {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        if (a>75) {
            System.out.println("invalid");
        }
        else{
             int b= a%8;
            switch(b){
                case (1):
                    System.out.println(" your seat from upper");
                    break;
                case (2):
                    System.out.println(" your seat from upper");
                case(4):
                    System.out.println("your seat is from middle ");
                    break;
                case(3):
                    System.out.println("your seat is from middle ");
                    break;
                case(5):
                    System.out.println("your seat is from  lowwer");
                    break;
                case(6):
                    System.out.println("your seat is from  lowwer");
                    break;
                case 7:
                    System.out.println("your seat is side upper");
                    break;
                case 0:
                    System.out.println("your seat in side lower");
                    break;
                default:
                    System.out.println("error");
                
            } }
        
        
        }
 }

        