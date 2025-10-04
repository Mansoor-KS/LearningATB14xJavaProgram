package ex_08_If_Condition;

public class Lab0034_79_If {
    public static void main(String[] args){
        String User_input = args [0];
        System.out.println(User_input);
        int age = Integer.parseInt(User_input);

        if (age >= 18)
        {
            System.out.println("You can vote");
        } else {
            System.out.println("you cannot Vote 'Sorry'");
        }
    }
}
