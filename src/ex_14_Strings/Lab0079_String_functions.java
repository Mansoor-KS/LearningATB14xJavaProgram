package ex_14_Strings;

public class Lab0079_String_functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); //char is not stored in scp, it stored in integer based on ASCII value

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
    }
}
