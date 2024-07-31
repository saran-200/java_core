class Student{
    int id;
    String name;
    int age;
    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
   void displayInformation(){
        System.out.println(id+" "+name+" "+age);
    }
}
public class parameterized {
    public static void main(String args[]) {
        Student s1=new Student(1,"saran");
        Student s2=new Student(2,"samu",5);
        s1.displayInformation();
        s2.displayInformation();
    }
}
