package mdgriffin.me.lab2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {
    @Test
    public void encrypt() throws Exception {
        assertEquals("TSRSHAESISTASEMGICEE", Encryption.encrypt("THIS IS A SECRET MESSAGE", 5));
        assertEquals("IehinWlagdAythhNafoiDslelEaorlRcavsEltaXDoslXluoeXodnsXnThaX", Encryption.encrypt("I WANDERED lonely as a cloud That floats on high oer vales and hills", 12));
    }

    @Test
    public void decrypt() throws Exception {
        assertEquals("THISISASECRETMESSAGE", Encryption.decrypt("TSRSHAESISTASEMGICEE", 5));
        // TODO if number has a remainder subtract that number of char from end of string
        assertEquals("IWANDEREDlonelyasacloudThatfloatsonhighoervalesandhillsXXXXX", Encryption.decrypt("IehinWlagdAythhNafoiDslelEaorlRcavsEltaXDoslXluoeXodnsXnThaX", 12));
    }

    @Test
    public void decryptAlt() throws Exception {
        assertEquals("THISISASECRETMESSAGE", Encryption.decryptAlt("TSRSHAESISTASEMGICEE", 5));
        // TODO if number has a remainder subtract that number of char from end of string
        assertEquals("IWANDEREDlonelyasacloudThatfloatsonhighoervalesandhillsXXXXX", Encryption.decryptAlt("IehinWlagdAythhNafoiDslelEaorlRcavsEltaXDoslXluoeXodnsXnThaX", 12));
    }

    @Test
    public void padOut() throws Exception {
        assertEquals("ABCDEFXXXX", Encryption.padOut("ABCDEF", 9, 'X'));
        assertEquals("Two plus two is equal to Twenty Twooooooo", Encryption.padOut("Two plus two is equal to Twenty Two", 40, 'o'));
    }
}