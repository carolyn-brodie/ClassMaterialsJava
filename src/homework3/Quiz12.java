package homework3;
import java.util.Scanner;

public class Quiz12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a child's age: ");
        int age = in.nextInt();

        if (age < 5)
        {
            System.out.println("The child is in preschool");
        }
        else if (age < 11)
        {
            System.out.println("The child is in elementary school");
        }
        else if (age < 14)
        {
            System.out.println("The child is in middle school");
        }
        else if (age < 18)
        {
            System.out.println("The child is in high school");
        } else
        {
            System.out.println("Not a child!");
        }

    }
}
