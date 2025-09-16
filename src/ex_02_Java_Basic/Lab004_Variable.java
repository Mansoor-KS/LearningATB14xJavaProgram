package ex_02_Java_Basic;

public class Lab004_Variable {
    public static void main(String[] args) {
        int a = 99;
        a = 66;
        System.out.println(a);
        int age = 67;
        age = 99;
        System.out.println(age+1);
        int _1=101;
        int $=201;
        int hi=301;
        int hi_this_very_long_variable_assign = 1;
        System.out.println(_1+$+hi); // here it will total sum
        System.out.println(_1 + " " + $ + " " + hi);
        // another way is format specifier metod
        System.out.printf("%d %d %d%n", _1, $, hi);
        System.out.println(_1);

        //enum is keyword lets use the keyword and check what is the o/p
        //int enum = 10;
        //System.out.println(enum);

        //OP: java: as of release 5, 'enum' is a keyword, and may not be used as an identifier
        //So keyword cannout be use as a variable

        int Enum = 10;
        System.out.println(Enum);
        //Java is case sensitive:



    }

}
