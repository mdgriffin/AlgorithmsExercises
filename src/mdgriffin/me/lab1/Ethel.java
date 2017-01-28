package mdgriffin.me.lab1;

/**
 * Created by mdgriffin on 28/01/2017.
 */
public class Ethel {
    private static char firstChar = 'A';
    private int offset;
    private String encryptedString;
    private int numChars;
    final int NUM_LETTERS = 26;

    public Ethel (int numChars, int a, int b, String encryptedString) {
        this.numChars = numChars;
        offset = (int)Math.pow(a, b);
        this.encryptedString = encryptedString;
    }


    public String decrypt () {
       String decryptedString = "";
        char currentLetter;

        // loop over each char
        // Add the offset to the char
        // if the offset is greater than the last char
        // use modulus to add get the remainder and add to first char

        for (int i = 0; i < encryptedString.length(); i++) {
            currentLetter = encryptedString.charAt(i);

            if (currentLetter != ' ') {
                currentLetter = (char)(firstChar + ((currentLetter + offset) % NUM_LETTERS));

                System.out.println("\n");
                System.out.println((int)currentLetter);
                System.out.println(currentLetter + offset);
                System.out.println(((currentLetter + offset) % NUM_LETTERS));
            }

            decryptedString += currentLetter;
        }

        return decryptedString;
    }

}
