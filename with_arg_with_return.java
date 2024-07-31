
// public class with_arg_with_return {
//     public static void main(String[] args) {
//         System.out.println(add(5,6));
//     }
//     static int add(int a, int b){
//         int c= a+b;
//         return c;
//     }
    
// }


public class with_arg_with_return {

    public static void main(string[] args) {
        int res=power(2,3);
        System.out.println(res);
    }
    public static int power(int base,int  exponent){
        if(exponent==0){
            return 1;
        }
        return base * power(base,exponent-1);
        
    }
}