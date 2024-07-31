package exception;
import java.util.*;

public class throw_throws {
    
    public static void dis(int arr[],int i)

        throws Exception {

            if(i<arr.length){
                System.out.println(arr[i]);
            }else{
                throw new Exception();
            }
        
        }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
            dis(arr,6);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
                System.out.println("welcome");
        }
    }
}
