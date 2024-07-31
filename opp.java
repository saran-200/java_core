public class opp {
    int a=123;
    String name="priyuu";
// we can able access mutilple object with single class 
    public static void main(String[] args) {
        opp obj= new opp();
        System.out.println(obj.a+" "+obj.name);
        opp ab=new opp();
        System.out.println(ab.a+ab.name);
    }
}
