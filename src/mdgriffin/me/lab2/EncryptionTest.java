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
        assertEquals("IWANDEREDlonelyasacloudThatfloatsonhighoervalesandhills", Encryption.decrypt("IehinWlagdAythhNafoiDslelEaorlRcavsEltaXDoslXluoeXodnsXnThaX", 12));
    }

}