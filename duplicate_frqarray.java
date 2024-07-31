import java.util.Scanner;

public class duplicate_frqarray {
    public static void main(String[] args) {
        Scanner abc =new Scanner(System.in);
        String a=abc.nextLine();
        char[] s1=a.toCharArray();
        int b[]=new int[257];
        for(int i=0;i<s1.length;i++){
            b[s1[i]]++;
        }
        for(int i=0;i<257;i++){
            if(b[i]>1){
                System.out.print((char)i+" ");  // space also contain ascii values 
            }
        }
    }
}
