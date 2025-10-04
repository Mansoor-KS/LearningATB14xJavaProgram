package ex_11_While;

public class Lab0062_115_while {
    public static void main(String[] args){
        int i =0; // initilaisation outside : I
        while(i<10){ // Condition in loop : C
            System.out.println(i);
            i++; // Updation inside loop : U
        }
        for (int a = 0; a<10; a++){
            System.out.println(a);
        }
    }
}
