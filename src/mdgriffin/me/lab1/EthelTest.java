package mdgriffin.me.lab1;

import static org.junit.Assert.*;

public class EthelTest {
    @org.junit.Test
    public void decrypt() throws Exception {
        assertEquals(Ethel.decrypt("IFMMP XPSME", (int)Math.pow(3, 3)), "HELLO WORLD");
        assertEquals(Ethel.decrypt("GT OTBKYZOMGZOUT UL ZNK RGCY UL\nZNUAMNZ", (int)Math.pow(2, 5)), "AN INVESTIGATION OF THE LAWS OF\nTHOUGHT");
    }

    @org.junit.Test
    public void encrypt() throws Exception {
        assertEquals(Ethel.encrypt("HELLO WORLD", (int)Math.pow(3, 3)), "IFMMP XPSME");
        assertEquals(Ethel.encrypt("AN INVESTIGATION OF THE LAWS OF\nTHOUGHT", (int)Math.pow(2, 5)), "GT OTBKYZOMGZOUT UL ZNK RGCY UL\nZNUAMNZ");
    }

}