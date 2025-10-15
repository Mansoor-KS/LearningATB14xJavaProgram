package ex_17_OOPs;

public class Lab00116_161_Cats_OOps {
    public static void main(String[] args){
    Cat c1; // this is only object refrence.
    Cat c2; // This does not create obect for the class
    Cat c3; // it only a object variable
    Cat c23 = new Cat();
    System.out.println(c23.name);
    Cat c24 = new Cat("lucy");
    Cat c25 = new Cat("Spicy");
    Cat c26 = new Cat("mirchi");
    new Cat(); //creat object
    System.out.println(c24.name);
    System.out.println(c25.name);
    c24.running();
    c26.running();
    c25.running();

    }
}
class Cat{
    String name; // instance variable
    Cat(){
        name = "Kitty";
    }
    Cat(String namePara){
        this.name = namePara;
    }
    void running (){
        int locale_var = 10; //local variable
        System.out.println("Who is running ->" + this.name);
    }
}
