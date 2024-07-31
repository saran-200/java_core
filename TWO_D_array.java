import java.util.Scanner;

public class TWO_D_array {
    public static void main(string[]args){
        Scanner abc=new Scanner(System.in);
        int r=abc.nextInt();
        int c=abc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=abc.nextInt();
            }
        }for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"  ");
            }System.out.println(" ");
        }
        
    }
    
}
