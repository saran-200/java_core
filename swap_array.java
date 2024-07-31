import java.util.Scanner;

public class swap_array {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=abc.nextInt();
        }
        // for(int i=a-1;i<arr.length;i=i-2){ 
        //     System.out.print(arr[i]);       // to reverse the number
        // }

        // without using temp for swaping two two number eg==> input= 12345 // output= 21435
       
        for(int i=0;i<a-1;i+=2){
            arr[i]=arr[i]^arr[i+1];
            arr[i+1]=arr[i]^arr[i+1];
            arr[i]=arr[i]^arr[i+1];   
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
            
    }
}
