package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public class Node<Item> {



    public Item item;


    public Node  next;



    @Override
    public String toString() {
        return "Node{" +
                "item='" + item + '\'' +
                ", next=" + next +
                '}';
    }

}
