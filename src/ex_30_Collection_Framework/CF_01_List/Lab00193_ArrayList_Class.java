package ex_30_Collection_Framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab00193_ArrayList_Class {
    public static void main(String[] args) {
    Student s1 = new Student("Mansoor", "1");
    Student s2 = new Student("Kiran", "2");
    Student s3 = new Student("Mahi", "3");



    List<Student> myStudents =new ArrayList<>();
    myStudents.add(s1);
    myStudents.add(s2);
    myStudents.add(s3);
    s1.printdetials();
    s2.printdetials();
    s3.printdetials();
    }
}
class Student{
    private String name;
    private String rollno;

    public Student(String name, String rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public String getName (){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void printdetials(){
        System.out.println("Student Nmae : " + this.name);
        System.out.println("Student Rollno : " + this.rollno);
    }

}




