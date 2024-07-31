import java.util.Scanner;

public class largest_using_foreach {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int a= abc.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=abc.nextInt();
        }
        int max=arr[0];
        for( int num:arr){
            if(num>max){
                max=num;
            }
        }System.out.println(max+"is max");
    }
}
