package week3;

public class CallByValue {
    public static void test(int x) {
        x = 5;
        System.out.println("Value inside of function: " + x);
    }

    public static void main(String[] args) {
        int y = 6;
        test(y);
        System.out.println("Value outside of function: " + y);
    }

}
