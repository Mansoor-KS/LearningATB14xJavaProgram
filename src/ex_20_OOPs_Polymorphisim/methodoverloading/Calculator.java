package ex_20_OOPs_Polymorphisim.methodoverloading;

public class Calculator {

    public static void main(String[] args) {
        Calc c1 = new Calc();
       double r1 =  c1.add(3.14,3.14);
        System.out.println(r1);
    }


}

class Calc {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    long add(long a, int b) {
        return a + b;
    }
}
