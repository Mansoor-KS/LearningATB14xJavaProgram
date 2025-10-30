package ex_20_OOPs_Polymorphisim.methodoverloading;

public class Lab00124_187_poly_Methodoverloading {
    public static void main (String[] args){
        MathOperations m1 = new MathOperations();
        String r1 = m1.add("mansoor", 1);
        System.out.println(r1);
        int r2 = m1.add(2,4,6);
        int r3 = m1.add(5, 5);
        double r4 = m1.add(1.3, 4.5);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
class MathOperations{
    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.
    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a, double b){
        return a+b;
    }
    String add (String a, int b){
        return a+b;
    }
}
