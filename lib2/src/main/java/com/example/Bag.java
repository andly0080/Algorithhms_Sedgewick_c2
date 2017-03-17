package com.example;

import java.util.*;
import java.util.Iterator;

/**
 * Created by davidyu on 2/21/17.
 */

public class Bag<Item>  implements Iterable {


    Node firstNode;



    private void addItem(Item item) {


            Node oldFirstNode = firstNode;

            firstNode = new Node();
            firstNode.item = item;
            firstNode.next = oldFirstNode;




    }




    @Override
    public Iterator iterator() {

        return new myListIterator();

    }




    private class Node {
        Item item;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }


    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {


            String item = scanner.nextLine();

            if (!item.equals("-")) {

                bag.addItem(item);
//            } else {
//                System.out.println(queue.dequeue() + " dequeuing");
//            }

//            System.out.println(bag.getSize() + " left on stack");
//            queue.travel();

                Iterator iterator = bag.iterator();
                while (iterator.hasNext()) {
                    System.out.println((iterator.next()));
                }

            }
        }
    }

    private class myListIterator implements Iterator {

        private Node current = firstNode;

        @Override
        public boolean hasNext() {
            return current!=null;
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
    }
}






