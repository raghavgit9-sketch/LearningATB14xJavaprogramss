package ex_04_Operators;

public class Lab044_BODMAS {

    public static void main(String[] args) {

        System.out.println((9 * 3 / 9 + 1) * 3);
        // BODMAS
        //First solve the Inside Parenthesis Multiplication from left to right (9 * 3 / 9 + 1) -> (27 / 9 + 1)
        //Inside First Parenthesis Division from left to right (27 / 9 + 1) -> (3 + 1)
        //Inside First Parenthesis Addition from left to right (3 + 1) -> (4)
        //Now Second or outer Parenthesis from left to right ((4) * 3) -> 12

        // Pramod Sir Explanation
        //BODMAS
        // 9 * 3 -> 27
        // 27 / 9 -> 3
        // 3 + 1 -> 4
        // 4 * 3 -> 12
    }
}
