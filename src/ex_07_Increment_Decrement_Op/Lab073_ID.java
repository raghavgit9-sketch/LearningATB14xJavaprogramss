package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {

        int a = 10;
        int result = a++;

        System.out.println(a);   // Value is already assigned 10 so now it will increment a++ ans 11
        System.out.println(result);  // First assign then increment so first value is assigned ans 10
    }
}
