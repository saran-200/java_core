import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sceond_large {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a= abc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=abc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[a-2]);
    }
    
}
