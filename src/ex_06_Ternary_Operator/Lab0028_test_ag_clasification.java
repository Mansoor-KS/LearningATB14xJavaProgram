package ex_06_Ternary_Operator;

public class Lab0028_test_ag_clasification {
    public static void main(String[] args){
      /*  int age = 17;
        String age_clasi = age < 18 ? "minor": (age>=60) ? "senior ctzn":  "Adult";
        System.out.println(age_clasi);


        //Command line (args)
        // set the values in args configuration in top edit option
        String up1 = args[0];
        String up2 = args[1];
        String up3 = args[2];
        System.out.println(up1 + up2 + up3);
        System.out.println(up1);
        System.out.println(up2);
        System.out.println(up3);*/


        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        //converting the String in integer
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String result = age<18? "Minor" : (age<60) ? "Adult" : "Sr. Ctzn";
        System.out.println(result);


    }
}
