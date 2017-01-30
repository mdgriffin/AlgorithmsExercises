package mdgriffin.me.lab1;

/**
 * Created by mdgriffin on 28/01/2017.
 */
public class Ethel {
    private final static char FIRST_CHAR = 'A';
    private final static char LAST_CHAR = 'Z';
    private int offset;
    private String encryptedString;
    private int numChars;
    final int NUM_LETTERS = 26;

    public Ethel (int numChars, int a, int b, String encryptedString) {
        this.numChars = numChars;
        offset = (int)Math.pow(a, b) % NUM_LETTERS;
        this.encryptedString = encryptedString;
    }

    public String decrypt () {
       String decryptedString = "";
        char currentLetter;

        // loop over each char
        // Add the offset to the char
        // if the offset is greater than the last char
        // use modulus to add get the remainder and add to first char

        /*
        J  G  N  N  Q   Y  Q  T  N  F
        10 7  14 14 17  25 17 20 14 6

        H  E  L  L  O   W  O  R  L  D
        8  5  12 12 15  23 15 18 12 4
         */

        for (int i = 0; i < encryptedString.length(); i++) {
            currentLetter = encryptedString.charAt(i);

            //System.out.println("\n\nBefore: " + currentLetter);

            if (currentLetter != ' ') {
                if (currentLetter - offset > LAST_CHAR) {
                    currentLetter = (char)(FIRST_CHAR + ((currentLetter - offset) - LAST_CHAR));
                } else {
                    currentLetter = (char)(currentLetter - offset);
                }
            }

            //System.out.println("After:" + currentLetter);

            decryptedString += currentLetter;
        }

        return decryptedString;
    }

}
