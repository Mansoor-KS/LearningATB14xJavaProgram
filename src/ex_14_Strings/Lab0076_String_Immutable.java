package ex_14_Strings;

public class Lab0076_String_Immutable {
    public static void main(String[] args) {

        String name =  "Pramod";
        name.toUpperCase(); // PRAMOD
        System.out.println(name); // PRAMOD
        // only one string in string constant pool as of now
        // because we have not assigned value to make it mutable
        name = name.toUpperCase();
        System.out.println(name);





    }
}
