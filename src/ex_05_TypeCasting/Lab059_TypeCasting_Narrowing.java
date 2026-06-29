package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
         int val = 300;
        // byte b = val; // Narrowing -> Implicit casting -> Valid -> No
        byte b = (byte)val; //Narrowing -> Explicit casting -> Valid -> Yes

    }
}
