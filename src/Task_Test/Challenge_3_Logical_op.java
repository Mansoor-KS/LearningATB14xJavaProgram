package Task_Test;

public class Challenge_3_Logical_op {
    public static void main(String[] args){
        int a= 10;
        int b= 5;
        int c = 10;
        System.out.println("a == b: "  + (a ==b) );
        System.out.println("a > b: " + (a>b));
        System.out.println("a<b: " + (a<b));
        System.out.println("a>b && a>0: " + (a>b && a>0));
        System.out.println("a<b || a>0: " + (a<b || a>0));
        System.out.println("!(a>b): " + !(a>b));

    }
}
