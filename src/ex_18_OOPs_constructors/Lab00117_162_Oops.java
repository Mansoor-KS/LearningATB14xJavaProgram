package ex_18_OOPs_constructors;

public class Lab00117_162_Oops {
    public static void main(String[] args){
        Baby b1 = new Baby();
        new Baby();
        Baby b2;
       // System.out.println(b2.name); we need to creat object for b2,
        // b2 is only object refrence
    }
}
class Baby{
    String name;
    // default constructor is created
    Baby(){
        System.out.println("I am called, Object is created");
    }
}
