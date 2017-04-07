package mdgriffin.me.lab7;

import java.util.Arrays;

public class CP2LinkedListDriver {

    public static void main(String[] args) {
        CP2LinkedList<String> cp2LinkedList = new CP2LinkedList<>();


        cp2LinkedList.addFirst("John");

        cp2LinkedList.addLast("Mary");
        cp2LinkedList.addLast("Joan");
        cp2LinkedList.addLast("Timothy");

        cp2LinkedList.removeLast();

        //cp2LinkedList

        /*System.out.println(Arrays.toString(cp2LinkedList));*/

        cp2LinkedList.print();

        System.out.println(cp2LinkedList.size());


    }

}
