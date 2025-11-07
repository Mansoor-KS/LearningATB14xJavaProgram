package ex_27_Exceptions;

public class Lab00177_Finally_Not_Excuted {
    public static void main(String[] args) {
     try{
        // int b =  10/0;
         int a = 10/10;
         System.out.println(" Try executed");
         //Now if we put system.exit(0) finally won't execute
         System.exit(0);
     } catch (Exception e) {
         System.out.println("Catching the the exception");
     }finally {
         System.out.println("I will be always executed");
     }

    }
}
