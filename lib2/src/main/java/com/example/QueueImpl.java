package com.example;

import java.util.*;
import java.util.Iterator;

/**
 * Created by davidyu on 2/21/17.
 */
public class QueueImpl<Item> implements Queue<Item>, Iterable {


    Node firstNode;
    Node lastNode;
    int size;

    public QueueImpl() {


    }


    @Override
    public void enqueue(Item item) {
        //add item to the end of the list

        Node oldLastNode = lastNode;

        lastNode = new Node();
        lastNode.item = item;
        lastNode.next = null;
        if (isEmpty()) {
            firstNode = lastNode;
        } else {

            oldLastNode.next = lastNode;
        }

        size++;


    }

    @Override
    public Item dequeue() {

        Item item = (Item) firstNode.item;
        firstNode = firstNode.next;
        if (isEmpty()) lastNode = null;

        size--;
        return item;
    }

    public Item dequeueLast() {
        Item item = (Item) lastNode.item;

        //1. find a node before last node;
        //2. set this node as the lastNode;
        //3 . set next = null;

        Node currentNode = null;


        for (Node node = firstNode; node != lastNode; node = node.next) {
            currentNode = node;
        }

        currentNode.next = null;
        lastNode = currentNode;

        size--;

        return item;

    }


    public Item deleteByIndex(int index) {


        // assum the index =2

        //1. loop thour the node until to index;
        //2 . the previous one , next  = this index .next


        Node current = firstNode;

        for (int i = 0; i < index + 1; i++) {

            current = current.next;

            if (i == index - 1) {
                current.next = current.next.next;
            }


        }

        size--;


        return (Item) current.item;


    }


    public boolean findItem(Item item) {


        for (Node node = firstNode; node != null; node = node.next) {
            if (node.item.equals(item)) {
                return true;
            }

        }

        return false;


    }


//    public void travel()
//    {
//        for (Node node = firstNode; node !=null ; node=node.next) {
//
//            System.out.println(node);
//        }
//    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    public static void main(String[] args) {


        QueueImpl<String> queue = new QueueImpl<>();

        queue.enqueue("david");
        queue.enqueue("Gwen");
        queue.enqueue("Gwen");


        queue.enqueue("Emma");
        queue.enqueue("feng");
        queue.enqueue("Gwen");
        queue.enqueue("meng");
        queue.enqueue("ming");


        queue.remove("Gwen");

//        boolean result = queue.findItem("pp");
//
//
//        System.out.println(result);
//        Node nodeGwen = new Node();
//        nodeGwen.item = "Gwen";
//
//
//
//        Node nodeLi= new Node();
//        nodeLi.item = "li";
//
//        queue.insertAfter(nodeGwen,nodeLi);
//

        //queue.removeAfter(nodeGwen);

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Node) iterator.next()));
        }

//        QueueImpl<String> queue = new QueueImpl<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (scanner.hasNext()) {
//
//
//            String item = scanner.nextLine();
//
//            if (!item.equals("-")) {
//
//                queue.enqueue(item);
//            } else {
//                System.out.println(queue.dequeue() + " dequeuing");
//            }
//
//            System.out.println(queue.size() + " left on stack");
////            queue.travel();
//
//            Iterator iterator = queue.iterator();
//            while(iterator.hasNext())
//            {
//                System.out.println(((Node)iterator.next()));
//            }
//
//        }
    }

    @Override
    public Iterator iterator() {

        return new Iterator() {

            Node current = firstNode;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {

                Node item = current;
                current = current.next;
                return item;
            }

            @Override
            public void remove() {

            }
        };

    }


    public boolean removeAfter(Node target) {


        Node node;

        for (node = firstNode; node != null; node = node.next) {

            if (node.item.equals(target.item)) {
                break;
            }

        }

        if (node.next == null) {

            return false;
        }


        if (node.item.equals(target.item)) {

            node.next = node.next.next;
            return true;

        }

        return false;


    }


    public void insertAfter(Node target, Node second) {

        Node node;

        for (node = firstNode; node != null; node = node.next) {

            if (node.item.equals(target.item)) {
                break;
            }

        }


        Node oldNodeNex = node.next;


        node.next = second;
        second.next = oldNodeNex;

    }


    public void remove(String key) {


        for (Node node = firstNode; node != null; node = node.next) {


            if (firstNode.item.equals(key)) {

                Node firstOldNode = node.next;
                firstNode = firstOldNode;
                size--;
            }


            if (node.next != null && node.next.item.equals(key)) {
                node.next = node.next.next;
                size--;

            }

        }


    }


}