package ex_22_OOPs_accessModifier.Police;

public class JrCop {
    public static void main(String[] args){
        Cop jrCop = new Cop(5);
        jrCop.thisDefaultF1();
        jrCop.canIShoot();
        jrCop.gun = 6;
        System.out.println(jrCop.gun);
    }
}
