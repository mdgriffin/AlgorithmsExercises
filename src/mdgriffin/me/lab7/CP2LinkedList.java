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
        public Node prev;
    }
    private Node first;
    private Node last;

    /**
     Constructs an empty linked list.
     */
    public CP2LinkedList()
    {
        first = null;
        last = null;
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

        if (last == null) {
            last = first;
        }
    }

    public E getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public void removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        if (first == last) {
            first = null;
            last = null;
        } else if (first.next == last) {
            last.prev = null;
            first = last;
        } else {
            first = first.next;
        }
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
        if (last == null) {
            addFirst(element);
        } else {
            Node newNode = new Node();
            newNode.data = element;

            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
    }

    public void removeLast () {

        if (last == null) {
            throw new NoSuchElementException();
        }

        if (last.prev == null) {
            removeFirst();
        } else {
            last.prev.next = null;
            last = last.prev;
        }
    }

    public E getLast () {
        if (last == null) {
            throw new NoSuchElementException();
        }

        return  last.data;

    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void printReverse() {
        Node current = last;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }
}
