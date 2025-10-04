package ex_11_While;

import java.util.Scanner;

public class Lab0066_While_factorial {
    public static void main(String[]args){
        // Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.

        // step 2: 0 fact is 1, check number is integer only,
        // check user doesnot enter max number,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check its factorial number");
        //int number = scanner.nextInt();
        if(!scanner.hasNextInt()){
            System.out.println("Please enter valid Number");
        }else{
            int number = scanner.nextInt();
            int fact = 1;
            if (number == 0){
                System.out.println("Factorial of number is 1");
            }if(number < 0 || number > Integer.MAX_VALUE){
                System.out.println("Can't get factorial of number out of bond");
            }else{


            int i = 1;
            while(i<= number){
                fact=fact*i;
                i++;
            }
            System.out.printf("Factporial of %d is %d", number, fact);
        }
        }
    }
}
