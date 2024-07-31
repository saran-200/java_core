import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        String a= "saran";// by literal
        String b=new String("mec");//by "new" keyword
        String c=abc.next();
        System.out.println(a+b+c);            


        // String a="saran beddy"; // space also contain index
        // int b=a.length();
        // System.out.println(b);


        // String a ="Saranbeddy";// to access the character in the string
        // char charindex=a.charAt(5);
        // System.out.println(charindex);

     //String a ="Saran beddy";

        // String substring=a.substring(6);
        // char charindex=a.charAt(6);
        // System.out.println(charindex);
        // System.out.println(substring);// to skip some front characters


        // String substring=a.substring(6,8);
        // char charindex=a.charAt(6);
        // System.out.println(charindex);
        // System.out.println(substring); // to print the character with range

        // int indexof=a.indexOf('s');  // index of the character
        // System.out.println(indexof);


        //  int indexrange=a.indexOf('d',0);// to print index of the character after the range
        //   System.out.println(indexrange);

       ///  int indexrange=a.lastIndexOf('a');  // to print index of the character from the last
        //System.out.println(indexrange);

        // String b= a.concat(" on instagram ");    // to concat it 
        // System.out.println(b);

        // String replace=a.replace('D','d');      // to replace to charachters
        // System.out.println(replace);

        // String lower=a.toLowerCase();   // to lowercase
        // System.out.println(lower);

        // String upper=a.toUpperCase();  //to uppercase
        // System.out.println(upper);


        // String trim=" on insta   ".trim();  // to the trim the space on the front and the back not in the middle like a video editing
        // System.out.println(trim);

        String[] splitstr=a.split(" ");  // to spilt the word one line into two or more;
        for(String s: splitstr){aWR
            System.out.println(s);
        }
 
        // boolean startswid=a.startsWith("s");   // to check if it is startswith
        // System.out.println(startswid);

        
        // boolean endswid=a.endsWith("s");   // to check if it is endswith
        // System.out.println(endswid);

        
        // String b="Saran beddy";
        // boolean equal=a.equals(b);   // to check if the both are equal or not 
        // System.out.println(equal);

        // boolean ingorecase=a.equalsIgnoreCase("saran beddy"); //it ignore case only compare the content 
        // System.out.println(ingorecase);

        // System.out.println(a.replaceFirst("S","s"));// to replace at first
        
        //System.out.println(a.replaceAll("Saran","SARAN"));  // TO Replace a word

        // String b="Sara beddy";  // compare two string and return some int values AND consider the cases
        // int com=a.compareTo(b);
        // System.out.println(com);
        
        // String b="SARAN beddy";   // compare two string and return some int values and it not consider the cases
        // int com=a.compareToIgnoreCase(b);
        // System.out.println(com);



    }



}
