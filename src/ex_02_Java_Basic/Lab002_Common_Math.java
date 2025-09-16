package ex_02_Java_Basic;

public class Lab002_Common_Math {
    public static void main (String[] args) {
        //System.out.println(10/0); java fallows line by line execution
        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2/2);
        System.out.print(3*3 + "\n");
        System.out.println(3|3);
        System.out.println(0/1);
        System.out.println("2+2 = 5");
        System.out.println(3/2); //It won't give float value
        System.out.println(3/2.0); //here it will give float double value
        System.out.println((float) 3/2); // here to get exact float value we can go for data "type casting"
        System.out.println(10/0); // this will give exception error because we cannot we cannot divide any number by 0

    }
}
