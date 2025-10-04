package ex_10_For_Loop;

public class Lab0059_112_For_loop_Continue {
    public static void main(String[] args){
        for(int i = 0; i<20; i++){
            if(i == 11){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("hi");
    }

}
