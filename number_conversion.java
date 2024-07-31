import java.util.Scanner;
// type converstion using bulit in functions
public class number_conversion {
    public static void main(string[] args) {
        Scanner abc =new Scanner(System.in);
        // int a=14;
        // System.out.println(Integer.toBinaryString(a));  // decimal to binary
        // int b =1101;
        // string c= Integer.toString(b);
        // System.out.println(Integer.parseInt(c,2)); //binary to decimal

        int d=34;
        System.out.println(Integer.toOctalString(d));
        string e = Integer.toString(d);
        System.out.println(Integer.parseInt(e,8)); // octal to decimal
 
        // int f = 10;
        // System.out.println(Integer.toHexString(f));// decimal to hexadecimal
        // string y = "b";
        // System.out.println(Integer.parseInt(y,16 )); 

    } 
}
