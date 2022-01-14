package ForComputerOrg;

public class Test2 {

    public static void main(String[] args) {
        long x = 1000000000;  // 1 billion
        for (int i = 0; i < 40; i++) {
            x += 100000000;  // add 100 million
            System.out.println(x);
        }
    }
}
