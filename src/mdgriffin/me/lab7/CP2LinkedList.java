package mdgriffin.me.lab7;

import java.util.NoSuchElementException;
//singly linked list with first reference only

/**
 A linked list is a sequence of links with efficient
 element insertion and removal. This class
 contains a subset of the methods of the standard
 java.util.LinkedList class.
 */
public class CP2LinkedList<E> {
    private class Node {
        public E data;
        public Node next;
    }
    private Node first;

    /**
     Constructs an empty linked list.
     */
    public CP2LinkedList()
    {
        first = null;
    }

    /**
     Adds an element to the front of the linked list.
     @param element the element to add
     */
    public void addFirst(E element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    public E getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        first = first.next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int listLen = 0;

        Node current = first;
        while (current != null) {
            listLen++;
            current = current.next;
        }

        return listLen;
    }

    public void addLast (E element)
    {
        Node newNode = new Node();
        newNode.data = element;

        if (first != null) {
            Node current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        } else {
            first = newNode;
        }
    }

    public void print() {
        Node current = first;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
