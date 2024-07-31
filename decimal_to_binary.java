// import java.util.Scanner;

// public class decimal_to_binary {
//     public static void main(String[] args) {
//         int a =10,bin=0,p=1;
//         while (a>0) {
//             bin=bin+(a%2)*p;
//             p*=10;
//             a/=2;
            
//         }System.out.println(bin);
//     }
// }


// BINARY to  DECIMAL 
public class decimal_to_binary {

    public static void main(string[] args) {
        int a=1010,dec=0,p=1;
        while (a>0) {
            dec=dec+(a%10)*p;
            p*=2;
            a/=10;
        }System.out.println(dec);

        
    }
}


