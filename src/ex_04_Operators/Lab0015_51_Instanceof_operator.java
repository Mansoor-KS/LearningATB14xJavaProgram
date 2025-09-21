package ex_04_Operators;

public class Lab0015_51_Instanceof_operator {
    public static void main(String[] args){
        String S1 = new String("Mansoor"); //O/P in Boolean true or false
        System.out.println(S1 instanceof String);
        // this like object of or son of
        //System.out.println(S1 instanceof Integer);
        boolean b = (10 == 11);
        //int b = 1;
        System.out.println("Value of b is"+ b); // to write this we need o do concatinate
       // System.out.println(b instanceof boolean); invalid
        // instanceof only used with NON PRIMITIVE data types ex: String
    }
}
