import java.util.*;
public class ascenddecend{
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
        int c=0;
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=abc.nextInt();
        }for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    c=arr[i];
                    arr[j]=arr[i];
                    arr[i]=c;
                }
            }
        }for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=a-1;i>0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}