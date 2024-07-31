// APPORACH ==> 1


import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        int a=abc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=abc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    //arr[j]=0;// if input is non zero values
                    arr[j]=Integer.MIN_VALUE;
                }
            }
        }
        for(int i=0;i<a;i++){
            if(arr[i]==Integer.MIN_VALUE){
                continue;
            }System.out.print(arr[i]+"  ");
        }
    }
    
}



/// APPORACH ==> 2

// import java.util.Scanner;

// public class remove_duplicates {

//     public static void main(string[] args) {
//         Scanner abc=new Scanner(System.in);
//         int a =abc.nextInt();
//         int[]arr =new int[a];
//         for(int i=0;i<a;i++){
//             arr[i]=abc.nextInt();
//         }
//         int[] arr1=new int[a];
//         int c=0; 
//         arr1[0]=arr[0];
//         c++;
//         for(int i=1;i<a;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i]==arr[j]){
//                     continue;
//                 }else{
//                     c++;
//                 }
//             }
//             }for(int i=0;i<c;i++){
//                 System.out.print(arr1[i]+" ");
//         }
//     }
// }