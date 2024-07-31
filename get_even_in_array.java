import java.util.Scanner;

public class get_even_in_array {
    public static void main(string[] args) {
        Scanner abc=new Scanner(System.in);
        int n=abc.nextInt(),even=0,odd=0,esum,osum;
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=abc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]%2==0){
                System.out.print("even");
                System.out.println(arr[i]);
                even+=arr[i];
            }else{
                System.out.print("odd");
                System.out.println(arr[i]);
                odd+=arr[i];
            }
        }System.out.println("sum of even"+even);
        System.out.println("sum of odd:"+odd);
        esum=even-odd;
        osum=odd-even;
        System.out.println((esum>=0)? esum:osum);
    }
    
}
