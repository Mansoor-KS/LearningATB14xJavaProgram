package ex_18_OOPs_constructors;

public class Car2 {
    String model;
    int year;

    Car2() {
        model = "XXX";
        year = 1900;
        System.out.println("DC");
    }

    Car2(String model_name) {
        this(); // Default constructor called here
        this.model = model_name;
    }


    Car2(String model_name, int year_created) {
        this("i10");
        this.model = model_name;
        this.year = year_created;
    }
}
