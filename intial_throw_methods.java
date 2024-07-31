class Student{
    int rollno;
    String name;
    void insertRecord(int id,String n){
        rollno=id;
        name=n;
    }
    void displayInformation()
    {
        System.out.println(rollno+"  "+name);
    }
}
public class intial_throw_methods {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.insertRecord(111,"student");
        s1.displayInformation();
    }
    
}
