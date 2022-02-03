package homework3;
import java.util.Scanner;


public class UserInput {

    public static int howMany() {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        int count = 0;
        while (!done) {
            System.out.print("Please enter an integer or q to quit: ");
            String inputString = in.next();
            if (inputString.equals("q"))
            {
                done = true;
            } else {
                int number = Integer.parseInt(inputString);
                if (number > 10 && number < 15)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number in range is " + howMany());
    }
}
