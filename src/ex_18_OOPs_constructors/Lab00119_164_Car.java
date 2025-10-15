package ex_18_OOPs_constructors;

import java.sql.SQLOutput;

public class Lab00119_164_Car {
    public static void main(String[] args){
        LoginPage L = new LoginPage();
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car2 c2 = new Car2("i20");
        Car2 c3 = new Car2("i20", 2012);
        System.out.println(c2.model);
        System.out.println(c3);
    }
}
