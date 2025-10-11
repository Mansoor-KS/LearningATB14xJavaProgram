package ex_16_Arrays;

public class Lab0095_149_Arrays {
    public static void main(String[] args){
        int marks [] = {90, 80, 85, 91,99,100};
        boolean [] is_married = {true, false, true};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        //System.out.println(marks[6]); OP Exception error because array's index start from 0
        // if len is 6 then its starts from 0 - 5;
        System.out.println(marks[5]);

        for(int i = 0; i< marks.length; i++){
            System.out.print(marks[i] + "-");
        }
        System.out.println();
        String name = "mansoor";
        String[] Name_each_elemenyt = name.split("");
        // For each loop
        for (String s: Name_each_elemenyt){
            System.out.println(s);
        }
    }
}
