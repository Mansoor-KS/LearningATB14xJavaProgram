package ex_22_OOPs_accessModifier.Police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }
    // Method and / Behav
    //public void canIShoot()
    protected void canIShoot() {
        System.out.println("Yes you can !!");
    }

    void thisDefaultF1() {
        System.out.println("Hi, Cop!");
    }
}
