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

    public static String decrypt (String encrpytedStr, int numColumns){
        String plainText = "";
        int numRows = encrpytedStr.length() / numColumns;


        // 0, 4,  8, 12, 16
        // 1, 5, 9, 13, 17
        // 2, 6, 10, 14, 18
        // 3, 7, 11, 15, 19

        for (int row = 1; row <= numRows; numRows++) {

            for (int col = 1; col <= numColumns; col++) {

                plainText.charAt(encrpytedStr.length() % (row * col + numRows) - 1);

            }

        }

        return plainText;

    }

    private static String padOut (String srcStr, int numCharacters, char padChar) {
        for (int i = srcStr.length(); i <= numCharacters; i++) {
            srcStr += padChar;
        }

        return srcStr;

    }

}
