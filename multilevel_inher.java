class dealer{
    void del(){
        System.out.println("I'm dealer");
    }
}
class wholesaler extends dealer{
    void sk(){
        System.out.println("I'm shopkeeper");
    }
}
class shopkeeper extends wholesaler {
    void ws(){
        System.out.println("I'm wholesaler");
    }
}class Main 
{
    public static void main(String[]args){
    shopkeeper d=new shopkeeper();
    d.del();
    d.ws();
    d.sk();
    }
}
