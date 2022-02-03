package ForComputerOrg;

public class TryBitWise {
    public static void main(String[] args) {
        byte x = 6;  //00000110
        byte y = 11; //00001011

        System.out.println(x < y && y > 11);
        System.out.println(x | y);
        System.out.println(x & y);
        //System.out.println(x && y);
    }
}
