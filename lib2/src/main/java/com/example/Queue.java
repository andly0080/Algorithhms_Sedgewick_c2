package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public interface Queue<Item> {



    void enqueue(Item item);

    Item dequeue();

    boolean isEmpty();

    int size();
}
