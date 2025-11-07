package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab00186_232_NestedList {
    public static void main(String[] args){
        List <String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("cherry");
        //fruits.add(133);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits);
        all_fruits.add(fruits2);
        all_fruits.add(vegatables);

        System.out.println(all_fruits);
        System.out.println(all_fruits.size());
        //System.out.println(all_fruits.indexOf(1));
        System.out.println(all_fruits.get(2));
    }
}
