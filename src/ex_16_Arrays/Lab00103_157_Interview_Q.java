package ex_16_Arrays;

import java.util.Arrays;

public class Lab00103_157_Interview_Q {
    public static void main(String[] args){
        int num[] = {90,80,70,12};
        Arrays.sort(num);
        System.out.println(num[num.length -1]); // max num
        System.out.println(num[num.length - 2]);// 2nd higest
    }
}
