package Task_Test;

public class Challenge_4_Increment_decrement {
    public static void main(String[] args){
        int a = 5;
        System.out.println("Original: " + a);
        System.out.println("Pre-increment: " + (++a));
        System.out.println("Post-increment: " + (a++));

        //System.out.println("_____ Decrement-----");
        //int b = 6;
        System.out.println("pre-decrement: " + (--a));
        System.out.println("post-decrement: " + (a--));
    }
}
