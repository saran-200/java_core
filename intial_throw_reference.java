class Student{
    int id;
    String name;
}
class intial_throw_reference {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=101;
        s1.name="saran";
        System.out.println(s1.id+" "+s1.name);
    }
}
