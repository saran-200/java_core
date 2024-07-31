import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner acb=new Scanner(System.in);
        String a=acb.nextLine();
        String[] str=a.split(" ");
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }

    }
}
