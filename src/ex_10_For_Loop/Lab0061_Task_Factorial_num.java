package ex_10_For_Loop;

import java.util.Scanner;

public class Lab0061_Task_Factorial_num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
         int fact = 1;
         int n = scanner.nextInt();
         if(n == 0){
             System.out.println("Fact of num is 0");
         }
         for(int i =1; i<=n; i++){
             fact = fact*i;
         }
         System.out.println(fact);
    }
}
