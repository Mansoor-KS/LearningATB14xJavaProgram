package ex_26_Wrapper_Class;

public class Lab00159_203_wrapper_conversion {
    public static void main(String[] args){
        String num = "10";
        int aa = 10;

        // String -> Wrapper conversion
        Integer a = Integer.parseInt(num);
        System.out.println(num);
        System.out.println(aa);
        Double.parseDouble(num);
        Float.parseFloat(num);
        Long.parseLong(num);

        //String to Primitive
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);
    }
}
