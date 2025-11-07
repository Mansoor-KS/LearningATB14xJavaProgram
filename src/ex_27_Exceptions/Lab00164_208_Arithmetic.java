package ex_27_Exceptions;

public class Lab00164_208_Arithmetic {
    public static void main(String[] args){
        int c = 0;
        int b = 0;
        try{
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println("Not allowed 1");
        } catch (Exception e) {
            System.out.println("Hello");
        }catch(Throwable e){
            System.out.println("Not allowed");
        }
    }
}
