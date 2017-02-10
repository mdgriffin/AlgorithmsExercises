package mdgriffin.me.lab1;
/**
 * Ethel Solution
 * This is more commonly known as a Caesar Cipher
 * Characters a shifted by a specified number to encrypt the strip
 * Shifting in the opposite direction decrypts the string
 */

public class Ethel {
    private final static char FIRST_CHAR = 'A';
    private final static char LAST_CHAR = 'Z';
    final static int NUM_LETTERS = 26;

    /**
     * Decrypts an encrypted String using a Caesar Cipher
     *
     * @param encryptedString  The source encrpted String
     * @param offset           The number of characters to offset
     * @return                 A unencrypted String
     */

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

    /**
     * Encrypt a String using a Caesar Cipher
     *
     * @param source  The plain text unencrypted String
     * @param offset  The number of characters to offset by
     * @return        A encrypted String
     */

    public static String encrypt (String source, int offset) {
        String encrypted = "";
        char currentLetter;
        offset = offset % NUM_LETTERS;

        for (int i = 0;i < source.length(); i++) {
            currentLetter = source.charAt(i);

            if (currentLetter != ' ' && currentLetter != '\n') {
                if (currentLetter + offset > LAST_CHAR) {
                    currentLetter = (char)(FIRST_CHAR - 1 + ((currentLetter + offset) - LAST_CHAR));
                } else {
                    currentLetter = (char)(currentLetter + offset);
                }
            }
            encrypted += currentLetter;
        }

        return encrypted;
    }

}
