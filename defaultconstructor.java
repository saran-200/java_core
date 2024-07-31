// class Bike{
//     Bike(){
//         System.out.println("welcome");
//     }

//     Bike{
//         public static void main(String[] args) {
//             Bike b=new Bike();
//         }
//     }
// }
class Student{
    int id;
    String name;
    void displayInformation(){
        System.out.println(id+" "+name);
    }
}
public static void main(String[]args){
    Student s1=new Student();
    Student s2=new Student();
    s1.displayInformation();
    s2.displayInformation();
}