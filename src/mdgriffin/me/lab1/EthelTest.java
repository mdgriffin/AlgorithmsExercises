package mdgriffin.me.lab1;

import static org.junit.Assert.*;

public class EthelTest {
    @org.junit.Test
    public void decrypt() throws Exception {
        assertEquals(Ethel.decrypt("IFMMP XPSME", (int)Math.pow(3, 3)), "HELLO WORLD");
    }

    @org.junit.Test
    public void encrypt() throws Exception {
        assertEquals(Ethel.encrypt("HELLO WORLD", (int)Math.pow(3, 3)), "IFMMP XPSME");
    }

}