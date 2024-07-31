class animal{
    void ani(){
        System.out.println("saranbeddy");
    }
}
class cat extends animal{
    void ca(){
        System.out.println("saranvirat");
    }
}
class dog extends animal{
    void doo(){
        System.out.println("Zara");
    }

}


class Main{
    public static void main(String[] args) {
        cat a=new cat();
        dog d=new dog();
        a.ani();
        a.ca();
        d.doo();
    }

}