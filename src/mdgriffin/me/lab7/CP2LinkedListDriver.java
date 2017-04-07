package mdgriffin.me.lab7;

import java.util.Arrays;

public class CP2LinkedListDriver {

    public static void main(String[] args) {
        CP2LinkedList<String> cp2LinkedList = new CP2LinkedList<>();

        if (cp2LinkedList.isEmpty()) {
            System.out.println("List is empty");
        }

        cp2LinkedList.addFirst("John");

        cp2LinkedList.removeFirst();

        cp2LinkedList.addLast("Mary");
        cp2LinkedList.addLast("Joan");
        cp2LinkedList.addLast("Timothy");
        cp2LinkedList.addLast("james");

        cp2LinkedList.removeLast();

        System.out.println("\nFirst element in the list: " + cp2LinkedList.getFirst());
        System.out.println("\nLast element in the list: " + cp2LinkedList.getLast());

        System.out.println("\n\n=== Print List ===");

        cp2LinkedList.print();

        System.out.println("\n\n=== Print List In Reverse ===");

        cp2LinkedList.printReverse();

        System.out.println("\n\n=== List Size ===");

        System.out.println(cp2LinkedList.size());
    }

}
