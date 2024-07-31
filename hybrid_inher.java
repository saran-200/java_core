class A{
    void f(){
        System.out.println("priyu");
    }
}
class B extends A{
    void x(){
        System.out.println("priyu");
    }

}
class C extends A{
    void s(){
        System.out.println("priyu");
    }

}
// class D extends C{
//     void t(){
//         System.out.println("priyu");
//     }

// }
class Main {
    public static void main(String[] args) {
        C e=new C();
        e.f();
        e.s();
       // e.t();
        B r=new B();
        r.x();
        
    }
    
}
