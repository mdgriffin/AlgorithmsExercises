package mdgriffin.me.lab2;

/**
 * Encryption and Decryption using a transpositional cipher
 *
 * @author Michael Griffin
 */

public class Encryption {

    /**
     * Encrpyts a String using a transpositional Cipher
     * pads out the String with a X character if the number
     * of columns does not divide evenly into the String length
     *
     * @param plainText   The String to be encrypted
     * @param numColumns  The number of columns to split the text into
     * @return            An encrypted String
     */

    public static String encrypt (String plainText, int numColumns) {

        // Remove all spaces
        plainText = plainText.replace(" ", "");
        int numRows;

        // Calculate numRows required for plaintext
        if (plainText.length() % numColumns == 0) {
            numRows = plainText.length() / numColumns;
        } else {
            numRows = plainText.length() / numColumns + 1;
        }

        // If plaintext doesn’t fit exactly, pad it with Xs
        if (plainText.length() < numColumns * numRows) {
            plainText = padOut(plainText, numColumns *  numRows, 'X');
        }

        String ciphertext = "";

        for (int col = 0; col < numColumns; col++) {
            int index = col;

            for (int row = 0; row < numRows; row++) {
                ciphertext += plainText.charAt(index);
                index += numColumns;
            }
        }

        return ciphertext;
    }

    /**
     * Decrpyts a String that has been encrypted using a transposition cipher
     *
     * Simpler solution using the existing encryption method
     *
     * @param encryptedString   The source encrpyted String
     * @param numColumns        The number of columns that were used to encrypt the String
     * @return                  A plain text String of the unencrypted String
     */

    public static String decrypt (String encryptedString, int numColumns) {
        int numRows;

        // Calculate numRows required for plaintext
        if (encryptedString.length() % numColumns == 0) {
            numRows = encryptedString.length() / numColumns;
        } else {
            numRows = encryptedString.length() / numColumns + 1;
        }

        return encrypt(encryptedString, numRows);
    }

    /**
     * Alternative implementation of the Decryption method
     *
     * @param encryptedString   The source encrpyted String
     * @param numColumns        The number of columns that were used to encrypt the String
     * @return                  A plain text String of the unencrypted String
     */

    public static String decryptAlt (String encryptedString, int numColumns) {
        String plaintText = encryptedString;
        int numRows = encryptedString.length() / numColumns;

        for (int row = 0, i = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++, i++) {
                plaintText = plaintText.substring(0, i) + encryptedString.charAt(col * numRows + row) + plaintText.substring(i + 1);
            }
        }

        return plaintText;
    }

    /**
     * Utility Method to pad out a String with a specified character
     *
     * @param srcStr         The src String to pad out
     * @param numCharacters  The number of characters to add to end of String
     * @param padChar        The character to use when padding out
     * @return               A String padded out with padding character
     */
    private static String padOut (String srcStr, int numCharacters, char padChar) {
        for (int i = srcStr.length(); i <= numCharacters; i++) {
            srcStr += padChar;
        }

        return srcStr;
    }

}
