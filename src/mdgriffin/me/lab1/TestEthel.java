package mdgriffin.me.lab1;

/**
 * Created by mdgriffin on 28/01/2017.
 */
public class TestEthel {

    public static void main(String[] args) {
        System.out.println(Ethel.decrypt("IFMMP XPSME", (int)Math.pow(3, 3)));

        System.out.println(Ethel.decrypt("GT OTBKYZOMGZOUT UL ZNK RGCY UL\nZNUAMNZ", (int)Math.pow(2, 5)));

        System.out.println(Ethel.encrypt("HELLO WORLD", (int)Math.pow(3, 3)));

        System.out.println(Ethel.encrypt("AN INVESTIGATION OF THE LAWS OF\nTHOUGHT", (int)Math.pow(2, 5)));
    }
}
