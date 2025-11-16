package ex_30_Collection_Framework.CF_01_List;

import java.util.*;

public class Lab00191_237_ALiteration {
    public static void main(String[] args){
        List <String> mylist = new ArrayList();
        mylist.add("Mansoor");
        mylist.add("KS");
        mylist.add("F");

        System.out.println(mylist);

        System.out.println("------Using For each------");
        for(String i : mylist){
            System.out.println(i);
        }
        System.out.println("------Using Iterator------");
        Iterator<String> i = mylist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("------Using For Loop------");
        for(int j=0; j< mylist.size();j++){
            System.out.println(mylist.get(j));
        }

    }
}
