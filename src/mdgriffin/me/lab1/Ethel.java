package mdgriffin.me.lab1;


public class Ethel {
    private final static char FIRST_CHAR = 'A';
    private final static char LAST_CHAR = 'Z';
    final static int NUM_LETTERS = 26;

    public static String decrypt (String encryptedString, int offset) {
        String decryptedString = "";
        char currentLetter;
        offset = offset % NUM_LETTERS;

        for (int i = 0; i < encryptedString.length(); i++) {
            currentLetter = encryptedString.charAt(i);

            if (currentLetter != ' ' && currentLetter != '\n') {
                if (currentLetter - offset < FIRST_CHAR) {
                    currentLetter = (char)((LAST_CHAR + 1) - (FIRST_CHAR - (currentLetter - offset)));
                } else {
                    currentLetter = (char)(currentLetter - offset);
                }
            }
            decryptedString += currentLetter;
        }

        return decryptedString;
    }

    public static String encrypt (String source, int offset) {
        String encrypted = "";
        char currentLetter;
        offset = offset % NUM_LETTERS;

        for (int i = 0;i < source.length(); i++) {
            currentLetter = source.charAt(i);

            if (currentLetter != ' ' && currentLetter != '\n') {
                if (currentLetter + offset > LAST_CHAR) {
                    currentLetter = (char)(FIRST_CHAR  - ((currentLetter - offset) - LAST_CHAR));
                } else {
                    currentLetter = (char)(currentLetter + offset);
                }
            }
            encrypted += currentLetter;
        }


        return encrypted;
    }

}
