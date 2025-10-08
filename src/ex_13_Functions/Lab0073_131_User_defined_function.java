package ex_13_Functions;

import java.util.Scanner;

public class Lab0073_131_User_defined_function {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter b number");
        int b = scanner.nextInt();
        int result = sum_of_2_num(a,b);
        System.out.println(result);
        System.out.println(sum_of_2_num(2,10));
        System.out.println(sum_of_2_num(3333,4444));

    }
    static int sum_of_2_num(int a, int b){
        System.out.println("The sum is = ");
        return a+b;
    }
}
