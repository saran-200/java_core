class employee{
    void mth(){
        System.out.println("the salary");
    }
}
class programmer extends employee{
    void mth1(){
        System.out.println(" the bonus");

    }
        public static void main(String[]args)
        {
            programmer p=new programmer();
            p.mth();
            p.mth1();
           
            
        }
}

