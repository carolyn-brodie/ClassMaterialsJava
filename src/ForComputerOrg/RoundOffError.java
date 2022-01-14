package ForComputerOrg;

public class RoundOffError {
    public static void main(String[] args) {
        double r = Math.sqrt(2);
        double d = r * r - 2;
        if (d == 0)
            System.out.println("sqrt(2)squared minus 2 is 0");
        else
            System.out.println("sqrt(2)squared minus 2 is " + d);

    }
}
