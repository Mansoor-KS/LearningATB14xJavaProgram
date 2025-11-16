package ex_30_Collection_Framework.CF_01_List;

import java.util.Arrays;

public class Lab00180_226_Array_Problem {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        arr[0] = 1;
        arr[1]= 4;
        System.out.println(arr[0]);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // 1. Fixed Size
        // 2. Same data can  be stored.
        // 3. wastage of memory for the 9 elements
        // 4. insertion and deletion is heavy operation.
    }
}
