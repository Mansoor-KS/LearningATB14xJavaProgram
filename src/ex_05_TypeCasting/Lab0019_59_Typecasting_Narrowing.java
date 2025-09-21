package ex_05_TypeCasting;

public class Lab0019_59_Typecasting_Narrowing {
    public static void main(String[] args){
        int val = 300;

        //     **0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0**
        // in backend this will convert into bits
        //byte b = val; // weding won't work, implicit casting will trow error use explict

        byte b = (byte) val; // Narrowing explicit casting
        System.out.println(b);
        //  **0 0 1 0 1 1 0 0**
        // Value is
        //
        // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**

    }
}
