package ex_06_Ternary_Operator;

public class Lab0025_65_Int_ques {
    public static void main(String[] args){
        // Find maximum number between two number
        int x= 10, y = 20;
        System.out.println(Math.max(x,y)); //Max num
        System.out.println(Math.min(x,y)); //Min num
        System.out.println();

        int R = x>=y ? x:y;
        System.out.println(R); //Max num

        int _s= x<y ? x:y;
        System.out.println(_s); //Minium num

    }
}
