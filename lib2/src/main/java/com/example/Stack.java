package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public interface Stack<Item> {

    void push(Item item);

    Item pop();

    boolean isEmpty();

    int size();


}
