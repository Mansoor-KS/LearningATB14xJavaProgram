package ex_16_Arrays;

public class Lab0099_153_Arrays_Max_Min {
    public static void main(String[] args){
        int [] marks = {20,30,78,5,98,21};
        int max = marks[0];

        for (int i=0; i< marks.length; i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println(max);
        System.out.println("---------------Minimum vale------------");
        //int [] marks2 = {20,30,78,5,98,21};
        int min = marks[0];
        for(int i = 0; i< marks.length;i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        System.out.println(min);
    }
}
