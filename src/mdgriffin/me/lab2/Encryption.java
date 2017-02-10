package mdgriffin.me.lab2;

public class Encryption {

    public static String encrypt (String plainText, int numColumns) {

        // Remove all spaces
        plainText = plainText.replaceAll("\\s+","");
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

    public static String decrypt (String encryptedString, int numColumns) {
        String plaintText = encryptedString;
        int numRows = encryptedString.length() / numColumns;

        for (int row = 0, i = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++, i++) {
                plaintText = plaintText.substring(0, i) + encryptedString.charAt(col * numRows + row) + plaintText.substring(i + 1);
            }
        }

        return plaintText;
    }

    private static String padOut (String srcStr, int numCharacters, char padChar) {
        for (int i = srcStr.length(); i <= numCharacters; i++) {
            srcStr += padChar;
        }

        return srcStr;
    }

}
