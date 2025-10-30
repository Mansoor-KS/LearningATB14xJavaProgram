package ex_20_OOPs_Polymorphisim.methodoverloading.methodoverriding;

public class Lab00126_189_Moverriding {
    public static void main(String[] args){
        Pramod p1 = new Pramod();
      //  p1.home();
        father f1 = new father();
        f1.home();
        father f2 = new Pramod(); // Dynamic Dispatch /
        f2.home();
        //  Pramod p1 = new Father();
        // When father is getting born, child reference cannot be given to.

    }
}
class father{
    void home(){
        System.out.println("2BHK");
    }
}
class Pramod extends father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}