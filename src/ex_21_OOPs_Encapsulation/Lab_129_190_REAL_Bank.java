package ex_21_OOPs_Encapsulation;

import java.sql.SQLOutput;

public class Lab_129_190_REAL_Bank {
    public static void main(String[] args){
        ICICIBank mansoor = new ICICIBank("mansoor", 100);
        System.out.println(mansoor.getBal());
        long bal = mansoor.getBal();
        //System.out.println(mansoor.bal); can't access as the variable bal is private
        mansoor.setbal(300,false);
        //Cashier
        ICICIBank cashier = new ICICIBank("cash", 100);
        cashier.setbal(200, true);
        System.out.println(cashier.getBal());


    }
}
class ICICIBank{
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }
    public void setbal(long bal, boolean isCashier){
        if (isCashier){
            this.bal = bal;
        }else{
            System.out.println("Not allowed");
        }
    }
}