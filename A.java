class Student{
    int id;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }
    Student(Student s){
        id=s.id;
        name=s.name;
    }
    void displayInformation(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"saran");
        Student s2=new Student(s1); 
        s1.displayInformation();
        s2.displayInformation();
    }
}
