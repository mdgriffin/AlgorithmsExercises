package mdgriffin.me.lab1;

/**
 * Created by mdgriffin on 28/01/2017.
 */
public class TestEthel {

    public static void main(String[] args) {
        Ethel eth = new Ethel(11, 3, 3, "IFMMP XPSME");

        System.out.println(eth.decrypt());
    }
}
