package week3;

public class HappyBirthdaySong {

    public static void singHappyBirthday(String person) {
        System.out.println(happy() + happy() + "Happy birthday dear "
                + person + ",\n" + happy());
    }


    public static String happy()
    {
        return "Happy birthday to you, ";
    }

    public static void main(String[] args) {
        happy();


    }
}