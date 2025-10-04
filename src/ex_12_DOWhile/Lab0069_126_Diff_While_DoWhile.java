package ex_12_DOWhile;

public class Lab0069_126_Diff_While_DoWhile {
    public static void main(String[] args){
        int a = 10;
        do{ //10<10 is false, loop is execute 1 time, do while is not entry controlled
            System.out.println("Body!");
            a++;
        }while(a<10);
    }
}
