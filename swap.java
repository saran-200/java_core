public class swap {
    public static void main(string[] args) {
        // without tempary variable
         int a = 12;
         int b= 23;
         // using + and - 
        //  a=a+b; //12+23=35
        //  b=a-b; //35-23=12
        //  a=a-b; //35-12=23
         // using * and / 
        //  a=a*b; // 276
        //  b=a/b; // 276/23 = 12
        //  a=a/b; //276/12 = 23
        // using XOR '^'
        a=a^b;
        b=a^b;
        a=a^b;
         System.out.println("a="+a);
         System.out.println("b="+b);
    }
}
