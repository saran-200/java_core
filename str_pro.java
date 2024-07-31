import java.util.Scanner;
// to remove the required character  and count the required character in the string 
public class str_pro {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        String a=abc.next();
        char b=abc.next().charAt(0);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b){
                System.out.print(a.charAt(i));
            }
        }

    }
    
}
