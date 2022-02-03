package ForComputerOrg;

public class Homework3ProbAlt {
    private static String encode(String string)
    {
        //System.out.println(string.length());
        String encoded = "";
        int count = 0;
        boolean done = (count == string.length());
        while (!done)
        {
            char letter = string.charAt(count);
            int runLength = 1;
            boolean endRun = false;
            while (count < string.length() && !endRun)
            {
                count++;
                //System.out.println(letter + " count = " + count);
                if (count < string.length())
                    if (string.charAt(count) == letter)
                    {
                        runLength++;
                    }
                    else
                    {
                        endRun = true;
                    }

            }
            //System.out.println(runLength + " " + letter);
            if (runLength > 3)
                encoded += (runLength + "" + letter);
            else for (int run = 0; run < runLength; run++) encoded += letter;
            done = (count == string.length());

        }

        return encoded;
    }

    public static void main(String[] args) {
        System.out.println(encode("BBBBBOOOOOOHHHHHHOO"));
    }

}
