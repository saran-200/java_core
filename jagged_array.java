import java.util.Scanner;

public class jagged_array {
    public static void main(string[] args) {
    // Scanner abc=new Scanner(System.in);
    // int row= abc.nextInt();
    int[][] jagged_array=new int[3][]; // direct input==> int jagged_array={{0,1},{1,2,3},{1,2,3,4,5}};
    jagged_array[0]=new int[1];
    jagged_array[1]=new int[6];
    jagged_array[2]=new int[8];
    int count=0;
    for(int i=0;i<jagged_array.length;i++){
        for(int j=0;j<jagged_array[i].length;j++){
            jagged_array[i][j]=count++;
        }
    }
    for(int i=0;i<jagged_array.length;i++){
        for(int j=0;j<jagged_array[i].length;j++){
            System.out.print(jagged_array[i][j]+"   ");
        }System.out.println(" ");
    }
    
    }
    
}
