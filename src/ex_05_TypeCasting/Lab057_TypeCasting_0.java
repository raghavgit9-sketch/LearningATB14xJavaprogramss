package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {

        byte b = 10;
        // int a = b;  // Valid Syntax -> Implicit - Casting -> Widening
        int a = (int)b;  // Explicit Casting - Widening | No use

        //int a1 = 300;
        //byte b1 = a1;
    }
}
