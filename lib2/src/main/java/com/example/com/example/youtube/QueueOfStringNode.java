package com.example.com.example.youtube;

/**
 * Created by davidyu on 3/2/17.
 */

public class QueueOfStringNode implements QueueOfStrings {


    private Node first;
    private Node last;


    private class Node {
        String item;
        Node next;

    }


    @Override
    public void enqueue(String item) {


        Node oldLastNode = last;

        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        }
        oldLastNode.next = last;


    }

    @Override
    public String dequeue() {

        String item = first.item;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        return item;

    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
