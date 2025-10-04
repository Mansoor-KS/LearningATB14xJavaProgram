package ex_10_For_Loop;

import java.util.Scanner;

public class Lab0057_110_Even_Odd {
    public static void main(String[] args){
        // TO find the even numbers from 1 to 50
        /*for(int i=0; i<=50;i++){
            if (i%2 == 0){
                System.out.println("Even number is " + i);\*

         */
        //for (int i=0; i<=50; i++){
        //if(num%2 != 0){
        //System.out.println("Odd number is " + i);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check its Prime or Not");
        int num = scanner.nextInt();

        //for (int i=0; i<=50; i++){
            if(num%2 != 0){
                System.out.println("Odd number is " + num);
            }else{
                System.out.println("Number is Even " + num);
        }


    }
}
