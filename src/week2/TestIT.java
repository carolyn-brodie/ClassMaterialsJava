package week2;

public class TestIT {
    public static void main(String[] args) {
        int b = 1;
        int a=3;
        b = (a == ++b) ? b - 1 : a + 1;
        System.out.println(b);



    }
}
