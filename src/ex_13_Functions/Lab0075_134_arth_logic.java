package ex_13_Functions;

import java.util.Scanner;

public class Lab0075_134_arth_logic {
    public static void main(String[] args){
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases
        Scanner scanner = new Scanner(System.in);
        int a = readint(scanner, "Enter the num1");
        int b = readint(scanner, "Enter the num2");

        int result_sum = sum(a,b);
        System.out.println(result_sum);
        int result_sub = sub(a,b);
        System.out.println(result_sub);
        float result_div = div(a,b);
        System.out.println(result_div);
        int result_mul = mul(a,b);
        System.out.println(result_mul);
        float result_mod = mod(a,b);
        System.out.println(result_mod);

    }
    static int readint (Scanner scanner, String prompt){
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else{
            System.out.println("Enter integer only");
            System.exit(0);
            return 0;
        }
    }
    static int sum(int a, int b){
        System.out.println("Sum value");
        return a+b;
    }
    static int sub(int a, int b){
        System.out.println("Sub value");
        return a-b;
    }
    static float div(int a, int b) throws ArithmeticException{
        if(b ==0){
            throw new ArithmeticException("Divisiob by zero is not allowed");
        }
        System.out.println("Div value");
        return a/b;
    }
    static int mul(int a, int b){
        System.out.println("Mul value");
        return a * b;
    }
    static float mod (int a, int b){
        System.out.println("mod value");
        return a %b;
    }

}
