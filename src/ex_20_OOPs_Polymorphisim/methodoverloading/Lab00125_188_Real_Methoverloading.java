package ex_20_OOPs_Polymorphisim.methodoverloading;

public class Lab00125_188_Real_Methoverloading {
    public static void main(String[] args){
        home h1 = new home();
        h1.task();
        h1.task(" Toilet");
    }
}
class home{
    void task(){
        System.out.println("Task cleaing fan");
    }
    void task(String whichTask){
        System.out.println("Task" + whichTask);
    }
}
