import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        String a="Hellow123";
        String b= new String("hellow");
        String c="123";
        // using equals
        // System.out.println(a.equals(c));  // it checks the cotent with case sensitive but not the memory allocation
        // System.out.println(b.equals(c));

        // using ==
        
        // System.out.println(a==b);   // it checks the cotent with case sensitive with the memory allocation
        // System.out.println(a==c);

        // using compareTo

        // System.out.println(a.compareTo(b));   // it checks the cotent with case sensitive if same return 0 else generate random values
        // System.out.println(a.compareTo(c));

        
        

    }
    
}
