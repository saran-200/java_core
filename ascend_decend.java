import java.util.*;
public class ascend_decend{
    public static void main(String[]args){
        Scanner abc=new Scanner(System.in);
        int a =abc.nextInt();
       
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=abc.nextInt();

        }
    
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]>arr[j])
                {
                    int c=0;
                    c=arr[i];
                    arr[j]=arr[i];
                    arr[i]=c;
                    break;
                }else{
                    arr[i]=arr[i];
                }
               
            }
        }
        for(int i=0;i<a;i++){
            System.out.print("array  "+arr[i]);
        }
        // for(int i=0;i<a;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // for(int i=a-1;i>0;i--)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }
}