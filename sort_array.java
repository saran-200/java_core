import java.util.*;

public class sort_array {

    public static void main(string[] args) {

        // only sorting

        // Scanner abc =new Scanner(System.in);
        // int n=abc.nextInt();
        // int[] arr=new int[n];
        // int c;
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=abc.nextInt();
        // }
        //     for(int i=0;i<arr.length;i++){
        //          for(int j=i+1;j<arr.length;j++)
        //          {
        //             if(arr[i]>arr[j]){
        //                 c=arr[i];
        //                 arr[i]=arr[j];
        //                 arr[j]=c;
        //             }

        //         }
        //     }for(int i=0;i<n;i++){ 
        //         System.out.print(arr[i]);
        // }
        


        // sorted but printed in (123654)
        Scanner abc =new Scanner(System.in);
        int n=abc.nextInt();
        int[] arr=new int[n];
        int c;
        for(int i=0;i<arr.length;i++){
            arr[i]=abc.nextInt();
        }
            for(int i=0;i<arr.length;i++){
                 for(int j=i+1;j<arr.length;j++)
                 {
                    if(arr[i]>arr[j]){
                        c=arr[i];
                        arr[i]=arr[j];
                        arr[j]=c;
                    }

                }
            }for(int i=0;i<n/2;i++){ 
                System.out.print(arr[i]);
            }
            for(int i=n-1;i>=n/2;i--){
                System.out.print(arr[i]);
            }

    }
}