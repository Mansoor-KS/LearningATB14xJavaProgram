package ex_07_Increment_Decrement_Op;

public class Lab0032_74_Advance_increament {
    public static void main(String[] args){
        int a = 10;
        System.out.println(a++ + a); //21
        System.out.println(a); // 11
        int b = 10;
        System.out.println(++b + b++ + b); //11 + 11 + 12 = 34
        System.out.println(b); //12
        int c = 10;
        System.out.println(c++ + ++c); // 10 (incremented to 11) + 12 = 22
    }
}
