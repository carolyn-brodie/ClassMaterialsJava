package week1;


import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number1 =input.nextInt();
        System.out.println("Enter an integer: ");
        int number2 =input.nextInt();
        System.out.println("Enter an integer: ");
        int number3 =input.nextInt();

        if (number1 <= number2 && number2 <= number3 )
        {
            System.out.println("Increasing");
        }else if (number1 >= number2 && number2 >= number3)
        {
            System.out.println("Decreasing");
        } else {
            System.out.println("false");
        }
    }
}
