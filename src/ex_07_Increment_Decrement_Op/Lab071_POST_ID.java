package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {

      //  int a = 10;
      //  System.out.println(++a);

        // Post Increment -> Print first then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT (Expression and Result Table)
        // LNo |  a_post  |  b
        // 10  |  10      |  NA
        // 11  |  11      |  10
        // 12  |  11      |
        // 13  |          |  10
    }
}
