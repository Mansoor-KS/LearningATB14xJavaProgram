package ex_22_OOPs_accessModifier.Police;

public class Kiran extends Cop{

    public Kiran(int bullet) {
        super(bullet);
    }
    public static void main(String[] args) {
        Cop p = new Cop(100);
        p.thisDefaultF1();
    }
}
