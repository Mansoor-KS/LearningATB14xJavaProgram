package ex_06_Ternary_Operator;

public class Lab0024_64_Interview_question {
    public static void main(String[] args){
        int age = 18;
        String TO = age>=19 ? (age>21 ? "you can marry" : "you cannot marry") : "No";
        System.out.println(TO);
    }
}
