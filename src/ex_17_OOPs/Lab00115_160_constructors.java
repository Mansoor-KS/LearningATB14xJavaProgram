package ex_17_OOPs;

public class Lab00115_160_constructors {
    public static void main(String[] args){

    Student s1 = new Student();
    Student s2 = new Student("Mansoor");

    }
}
class Student{
    String name;
    Student(){
        //DC
        System.out.println("Hi am default constuctor called");
    }
    Student(String name){
        System.out.println("PC ->" + name);
    }
    void sleep(){

    }
    void study(){

    }
    void eat(){

    }

}
