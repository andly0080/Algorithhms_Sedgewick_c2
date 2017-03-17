package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public interface Iterator<Item>{


    boolean hasNext();
    Item next();
    void remove();

}
