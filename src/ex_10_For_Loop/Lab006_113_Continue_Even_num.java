package ex_10_For_Loop;

public class Lab006_113_Continue_Even_num {
    public static void main(String[] args){
        for(int i=0; i<20; i++){
            if(i%2 !=0){
                continue;
            }
            System.out.println("Even Num" + i);
        }

    }
}
