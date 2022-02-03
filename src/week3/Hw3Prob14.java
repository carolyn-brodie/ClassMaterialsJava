package week3;

public class Hw3Prob14 {

    public static void printRows1(int maxRows, int maxCols) {
        for(int row = 0; row < maxRows; row++) {
            for (int col = 0; col < maxCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRows2(int maxRows, int maxCols) {
        for (int star = 1; star <= maxRows * maxCols; star++) {
            System.out.print("*");
            if (star % maxCols == 0 && star != 0) {
                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        printRows1(3,4);
        System.out.println();
        printRows2(3,4);

    }

}
