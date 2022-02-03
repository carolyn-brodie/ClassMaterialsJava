package ForComputerOrg;

import java.nio.charset.StandardCharsets;

public class TryUnicode {
    public static String newString(int codePoint) {

        return new String(Character.toChars(codePoint));
    }

    public static void main(String[] args) {
        int letter = 0x0041;
        System.out.println(newString(letter));

        ///////////////////////////////////////////
        //translate English ASCII to UTF-8
        String englishString = "Develop with pleasure";
        byte[] englishBytes = englishString.getBytes();

        String asciiEncondedEnglishString = new String(englishBytes, StandardCharsets.US_ASCII);

        System.out.println(englishString +  " and " + asciiEncondedEnglishString);
////////////////////////////////////////////////////////////
        String germanString = "Entwickeln Sie mit Vergnügen";
        byte[] germanBytes = germanString.getBytes();

        String asciiEncodedString = new String(germanBytes, StandardCharsets.US_ASCII);

        System.out.println(germanString + " and " + asciiEncodedString);
//
//
//        ///////////////////////////////////////////////////
//
//
        String rawString = "Entwickeln Sie mit Vergnügen";
        byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);

        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(rawString + " and " + utf8EncodedString);

    }
}
