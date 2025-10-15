package ex_19_OOPs_Part2OOPs_01_inheritance.Singleinheritance;

public class Lab00120_168_SI {
    public static void main(String[] args){
        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk3();
        s1.bhk2();

        Father f1 = new Father();
        //f1.bhk3();
        System.out.println(f1.gold_f);
        f1.bhk2();

    }
}
