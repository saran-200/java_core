import java.util.Scanner;

public class shape_pattern {
    public static void main(string[] args) {
        Scanner abc =new Scanner(System.in);
        int n=abc.nextInt();
       // right angles triangle
       
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i<=j){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }System.out.println(" ");
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println(" ");
        }
    }
    
}
