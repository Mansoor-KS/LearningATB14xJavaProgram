package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab_00130_182 {
    public static void main(String[] args){
        car tesla = new car(300);
        tesla.drive();
    }
}









class Vehicle{
    public int maxSpeed = 180;

    void noTest() {
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("Default Const");
    }

    Vehicle(int a ){
        System.out.println("Param Con");
    }
    Vehicle(int a, int b ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }
}
class car extends Vehicle{
    private int maxSpeed = 281;

    car(){
        super(100);
    }
    car (int a){
        System.out.println("PC Car");
    }
    void test(){}
    @Override
    void drive(){
        System.out.println("Over ridden the Vehicle");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}




