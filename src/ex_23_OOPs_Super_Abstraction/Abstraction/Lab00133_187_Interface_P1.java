package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab00133_187_Interface_P1 {
    public static void main(String[] args){
        car2 car2 = new car2();
        car2.drive();
        car2.testEngine1();
        car2.testEngine();
    }
}












class car2 implements Brakes, Engine1{
    void drive(){
        startEngine();
        applyBreak();
        stopEngine();
    }

    @Override
    public void testEngine1() {
        Engine1.super.testEngine1();
    }

    public void testEngine(){
        System.out.println("Override by car 1");
    }
    @Override
    public void applyBreak() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}








interface Brakes{
    void applyBreak();
}
interface Engine1{
    void startEngine();

    void stopEngine();

    default void testEngine(){
        System.out.println("concreate complete");
    }
    default void testEngine1(){
        System.out.println("concreate complete");
    }
}