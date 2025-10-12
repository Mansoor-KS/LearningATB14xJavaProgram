package Task_Test;

import java.util.Scanner;

public class Challenge_9_Day_ofweek_Switch {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input to check day's");
//        int day = scanner.nextInt();
        if (scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch(day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter the integer value from 1 to 7");
                    break;
            }
        }else{
            System.out.println("Enter only integer");
        }
    }
}
