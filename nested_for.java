public class nested_for {
    public static void main(string[] args) {
        int i=0,j=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==1 && j==2){
                    continue ;
                }
            }
        }System.out.println(i+" "+j);
    }
    
}
