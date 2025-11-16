package ex_30_Collection_Framework.CF_01_List;

import java.util.*;

public class LAb00189_235LL_List {
    public static void main(String[] args){
        List mylist1 = new ArrayList();
        List mylist2 = new ArrayList(10);
        List mylist3 = List.of("10", "23");
        System.out.println(mylist3);
        System.out.println(mylist1);
        System.out.println(mylist2);
        //mylist3.add("mansoor"); we cannot add elements when we r using list.of predifined funtion as we are give size already.
       // System.out.println(mylist3);;
        mylist2.add(1);
        mylist2.add("mansoor");
        System.out.println(mylist2);

        List LL = new LinkedList();
        LL.add(1);
        LL.add("1");
        LL.add(123);

        System.out.println(LL);
    }
}
