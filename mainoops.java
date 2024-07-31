class Dog{
    String name;
    int age;
    Dog(String name,int age){
    this.name=name;
    this.age=age;
    }
    void show(){
        System.out.println(name+" "+age);
    }
}
public class mainoops { 
    public static void main(String[] args) {
        Dog dog1=new Dog("joulie",4);
        Dog dog2=new Dog("sam",5);
        Dog dog3=new Dog("ram",4);
        Dog dog4=new Dog("soudhi",6);
        dog1.show();
        dog2.show();
        dog3.show();
        dog4.show();

    }

    
}