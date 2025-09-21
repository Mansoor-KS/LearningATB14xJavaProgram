package ex_04_Operators;

public class Lab0011_42_43_Intrivew_Concat_Plus {
    public static void main(String[] args){
    int a = 10;
    int b = 30;

    System.out.println(a+b);

    String first_ame = "Mohammed";
    String Last_name = " Mansoor";
    System.out.println(first_ame+Last_name);
    System.out.println(a+b+first_ame+Last_name); //a+b = 40 + Mohammed Mansoor
    System.out.println(first_ame+Last_name+a+b); //Mohammed mansoor 1030
        /*System.out.println(first_ame - Last_name);
        System.out.println(first_ame * Last_name);  Invalid
        System.out.println(first_ame /Last_name);*/
     System.out.println(first_ame+Last_name+ (a+b)); //BODMAS rule

    }
}
