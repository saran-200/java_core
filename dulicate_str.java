import java.util.Scanner;
// input ==> hii hello    // to print the non repeat numbers
//output==>  eo 
public class dulicate_str {
    public static void main(String[] args) {
        Scanner abc =new Scanner(System.in);
        String s=abc.nextLine();
        char ch[]=new char[s.length()];
        ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[i]=0;
                    ch[j]=0;
                }
            }if(ch[i]!=0)
            {System.out.print(ch[i]+" ");}
        }
    }
}
