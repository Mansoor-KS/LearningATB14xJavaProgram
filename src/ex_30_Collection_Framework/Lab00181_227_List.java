package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab00181_227_List {
    public static void main(String[] args){
        List arraylist = new ArrayList();
        arraylist.add("mansoor");
        arraylist.add(123);
        arraylist.add(1);
        arraylist.add(1.23);
        arraylist.add(0, "mansoorks");
        System.out.println(arraylist);

        List fruits = List.of("Orange", "baigan", 1 , "Mango", "pineapple");
        System.out.println(fruits);
    }
}
