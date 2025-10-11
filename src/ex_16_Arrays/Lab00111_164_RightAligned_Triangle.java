package ex_16_Arrays;

import java.util.Scanner;

public class Lab00111_164_RightAligned_Triangle {
    public static void main(String[] args){
        //int n =3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();

        for (int i=0;i<n; i++){
            for (int j=i; j<n-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
