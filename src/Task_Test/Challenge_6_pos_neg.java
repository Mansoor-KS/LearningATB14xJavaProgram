package Task_Test;

import java.util.Scanner;

import static java.lang.System.exit;

public class Challenge_6_pos_neg {
    public static void main(String[] arrgs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        if(scanner.hasNextInt()){ // string
            System.out.println("Enter the Integer value");
            exit(0);
        } else if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0){
            System.out.println(n + " is Negative");
        }else{
            System.out.println(n + " is zero");
        }
    }
}
