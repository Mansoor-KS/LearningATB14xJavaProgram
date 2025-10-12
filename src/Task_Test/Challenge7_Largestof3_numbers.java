package Task_Test;

import java.util.Scanner;

public class Challenge7_Largestof3_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd num:");
        int n2 = scanner.nextInt();
        System.out.println("Enter 3rd num:");
        int n3 = scanner.nextInt();
        ///int temp = 0;
        if (n1 >= n2) {
            if (n1 >= n3){
              System.out.println("Largest num is "+ n1);
            }else{
                System.out.println("Largest num is " + n3);
            }

        } else if (n2>= n1){
            System.out.println("Largest num is" + n2);
        }else{
            System.out.println("Largest num is " + n3);
        }
        if (n1 == n2 && n2 == n3){
            System.out.println("All are equal" + n1);
        }
    }
}
