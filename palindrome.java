import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        String c=abc.nextLine();
        int cou=0;
        StringBuilder a=new StringBuilder(c);
        StringBuilder b= a.reverse();
        char[] r=c.toCharArray();
        String t=b.toString();
        char[] y=t.toCharArray();
        // if(a.eq 
        for(int i=0;i<a.length();i++){
            if(r[i]==y[i]){
               cou++;
            }
        }if(cou==a.length()){
            System.out.println("yeah");
        }else{
            System.out.println("no");
        }
    }
    
}
