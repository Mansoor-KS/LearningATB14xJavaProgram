package ex_16_Arrays;

public class Lab00102_156_sum_of_arrays {
    public static void main(String[]args){
        int num [] ={30,41,91};
        int sum = 0;
        for (int i = 0; i<num.length;i++){
            sum = sum+num[i];
        }
        System.out.println(sum);
    }
}
