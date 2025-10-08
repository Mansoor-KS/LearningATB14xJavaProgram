package ex_13_Functions;

import java.util.Scanner;

public class Lab0071_128_Functions {
    public static void main(String[] args) {

        fun_1();
        fun_2();
        fun_3();
        int result = fun_4(3, 4);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int f = scanner.nextInt();
        System.out.println("Enter the second value");
        int g = scanner.nextInt();
        int result_1 = fun_5(f,g);
        System.out.println(result_1);
    }

    static String fun_1() {
        System.out.println("Hi mansoor, am called by function");
        return "1"; // return basically store the value
    }

    static int fun_2() {
        int a = 10;
        System.out.println("value of a is" + a);
        return a; // return basically store the value
    }

    static long fun_3() {
        int a = 10;
        System.out.println("value of a is" + a);
        return 1l; // return basically store the value
    }

    static int fun_4(int b, int c) {
        //int a = 10;
        System.out.println("value ");
        return b + c;
    }
    static int fun_5(int f,int g) {
        //int a = 10;
        System.out.println("Sum is in below");

        return f + g;
    }
}