package ex_15_StringBuffer_StringBuilder;

import java.util.Scanner;

public class Lab0092_149_cahtReverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The the word to reverse it");
        String user_input = scanner.next();
        String reverse_input = "";

        for(int i = user_input.length() - 1; i >=0;i--){
            reverse_input = reverse_input+user_input.charAt(i);
        }
    System.out.println(reverse_input);

        StringBuilder SB = new StringBuilder(user_input);
        System.out.println(SB.reverse());
    }
}
