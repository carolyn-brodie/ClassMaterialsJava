package week3;

public class PrintVsReturn {

    public static boolean isEven(int number){
        if (number % 2 == 0)
        {
            System.out.print(number + " is even ");
            return true;
        } else
        {
            System.out.print(number + " is odd ");
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 10;
        if (isEven(number))
        {
            System.out.print("number is :" + number/2);
        }

    }

}
