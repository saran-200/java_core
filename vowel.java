import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        char a=abc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println("VOWEL");
        }else{
            System.out.println("consonant");
        }

    }
}
