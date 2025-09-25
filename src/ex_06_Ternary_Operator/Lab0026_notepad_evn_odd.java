package ex_06_Ternary_Operator;

public class Lab0026_notepad_evn_odd {
    //public class Even_odd_num{
        public static void main(String[] args) {
            //Find an even num and odd num by using ternary operator
            // Logic if a num is divided by 2 and reminder is 0 then even num else odd

            int a = 12;
            String result = (a%2 == 0) ? "Even num" : "Odd num";
            System.out.println(result);

        }
    }
