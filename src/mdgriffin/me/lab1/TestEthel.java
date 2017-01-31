package mdgriffin.me.lab1;

/**
 * Created by mdgriffin on 28/01/2017.
 */
public class TestEthel {

    public static void main(String[] args) {
        Ethel eth = new Ethel(3, 3, "IFMMP XPSME");

        Ethel eth2 = new Ethel(2, 5, "GT OTBKYZOMGZOUT UL ZNK RGCY UL\nZNUAMNZ");

        System.out.println(eth.decrypt());

        System.out.println(eth2.decrypt());
    }
}
