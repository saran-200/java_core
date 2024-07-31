public class labelled_for {
    public static void main(string[] args) {
        int i=0,j=0;
        a:
        for(i=0;i<3;i++){
            b:
            for(j=0;j<3;j++){
                if(i==1 &&j==2)
                   // break a;
                   continue;
                System.out.println(i+" "+j);
            }
        }
    }
    
}
