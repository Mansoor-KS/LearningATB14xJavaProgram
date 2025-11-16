package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab00194_240_Set {
    public static void main(String[] args){
        Set hs = new HashSet();
        hs.add("mansoor");
        hs.add("Kiran");
        hs.add("Mahi");

        System.out.println(hs); //not in order

        Set lhs = new LinkedHashSet();
        lhs.add(1);
        lhs.add(2);
        lhs.add("mans");
        System.out.println(lhs); // in order

        Set Treeset = new TreeSet();
        Treeset.add("1");
        Treeset.add("01"); //01
        Treeset.add("Mah");
        System.out.println(Treeset); // Multiple datatype element not allowed
    }
}
