package ex_07_Increment_Decrement_Op;

public class Lab077_De {
    public static void main(String[] args) {

        int a = 10;
        int result_post = a--;
        System.out.println(result_post); // first assign the value then decrement so assign value ans 10
        System.out.println(a); // Value was already assigned so now decrement so ans 9
    }
}
