package ex_09_Switch;

public class Lab0046_95_Interview {
    public static void main(String[] args) {
        int a = 11;
        // here the case will fetch where ever it is
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
