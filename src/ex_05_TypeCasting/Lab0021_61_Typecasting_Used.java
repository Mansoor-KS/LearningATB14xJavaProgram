package ex_05_TypeCasting;

public class Lab0021_61_Typecasting_Used {
    public static void main(String[] args){
        int c = 1000;
        float d = 18.45f;

        //int total = c + d; invalid widening won't work

        int total = c + (int)d;
        System.out.println(total);

        //use higher data type always to so that weidining casting work
        int f = 2000;
        float g = 18.55f;

        float total1 = f+g;

        System.out.println(total1);

    }
}
