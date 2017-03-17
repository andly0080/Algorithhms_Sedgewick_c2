package com.example.com.example.youtube;

import com.example.*;

import java.util.*;
import java.util.Iterator;

/**
 * Created by davidyu on 3/2/17.
 */

public class LinkedStack<Item> implements Iterable<Item>{


    private Node first = null;




    public boolean isEmpty()
    {


        return first == null;
    }

    public void push(Item item)
    {

        Node oldFirst = this.first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;


    }



    public Item pop()
    {

        Item item =first.item;
        first= first.next;

        return item;



    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }



    private class ListIterator implements Iterator<Item>{


        private Node currentItem = first;
        @Override
        public boolean hasNext() {
            return currentItem !=null;
        }

        @Override
        public Item next() {


            Item item = currentItem.item;
            currentItem = currentItem.next;

            return item;
        }

        @Override
        public void remove() {

        }
    }


    private class Node{
        Item item;
        Node next;
    }

}
