package ex_16_Arrays;

import java.util.Scanner;

public class Lab00108_163_2D_Right_Triangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = scanner.nextInt();
        int Number = 1;
        for (int i=0; i<n;i++){
            for (int j = 0; j<=i;j++){
                //System.out.print(Number++);
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
