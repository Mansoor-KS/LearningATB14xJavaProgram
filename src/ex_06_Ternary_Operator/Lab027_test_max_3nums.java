package ex_06_Ternary_Operator;

public class Lab027_test_max_3nums {
    public static void main(String[] args){
        int n1 = 2, n2 =7, n3 = 18;
        //Find max num between 3 numbers using ternary operator,
        // Interview question by Aeta automation

        int result = (n1>n2)?(n1>n3? n1:n3): (n2>n3? n2 : n3);
        System.out.println(result); // Output is integer
        System.out.printf("The out put is %d", result); // Output is in string
    }
}
/*
public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        // LBF
        // Logic Building Formula

        // Step 1 ->  Find the inputs and outputs data type.
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can message with max number.


        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 ->  n1
        //  n2 > n3 && n2 > n1 -> n2
        //  n3


        // Step 3 - Dryn Run - program

        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("max is %d",max);


    }
}
 */