package ex_05_TypeCasting;

public class Lab0018_Typecasting_0 {
    public static void main(String[] args){
        int a = 10;
        byte b = (byte)a; // explicit catsing narrawoing

        byte b1 = 10;
        int a1 = b1; // valid -> widening -> implicit casting ->automatically , lower value store in higher
        int c1 = b1; // valid not requeried in wieding casting
        System.out.println(a1);
    }
}
