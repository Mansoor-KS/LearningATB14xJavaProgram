package ex_09_Switch;
import java.util.Scanner;
public class Lab0041_87_Switch_real_automation_use {
    public static void main(String[] args){
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scanner.next();

        switch (browser){
            case "Chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Edge":
                System.out.println("Starting the Edge");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "Firefox":
                System.out.println("Starting the FireFox");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("There is no such browsers");
        }
    }
}
