package ex_27_Exceptions;

public class Lab00161_204_Exception {
    public static void main(String[] args){
        System.out.println("Start of program");
        String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // java.lang.NumberFormatException
        int b = 100/a; // java.lang.ArithmeticException
        System.out.println(b);

        System.out.println("End of the program");
    }
}
