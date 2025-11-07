package ex_29_Generics;

public class LAb00178_224 {
    public static void main(String[] args){
        Integer c = tem_sum(3, 2);
        Double d = tem_sum(1.1, 30.9);
        System.out.printf("%d & %f %n", c, d);
        System.out.println(c);
        System.out.println(d);
        // generic
        temp_sum(3, 1);
        temp_sum("mansoor",1);
        temp_sum("maan", "soor");
        temp_sum(12.1, 0.1);
        //System.out.println(temp_sum(9.0, 1.9));

    }

    static Integer tem_sum(Integer a, Integer b){
        return a+b;
    }
    static Double tem_sum(Double a, Double b){
        return a+b;
    }
    //static <Templetize> generic data type method name (GDatatype a, GdataTpe b)
    static <T> T temp_sum (T a, T b){
        return null;
    }
    //    static <MODI> MODI temp_sum1(MODI a, MODI b){
//        return null;
//    }
}
