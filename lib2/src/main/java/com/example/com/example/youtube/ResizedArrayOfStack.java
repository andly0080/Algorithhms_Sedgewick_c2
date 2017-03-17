package com.example.com.example.youtube;

import java.util.Iterator;

/**
 * Created by davidyu on 3/2/17.
 */

public class ResizedArrayOfStack<Item> implements Iterable<Item>{


    Item[] stringArray ;
    int N;



    ResizedArrayOfStack(int capacity)
    {
        stringArray = (Item[])new Object[1];
        N = 0;

    }



    public void push(Item item)
    {

        //increase the array size by 2 *
        if(N == stringArray.length)
        {
            resize(2*stringArray.length);
        }

        stringArray[N++] = item;

    }

    public Item pop()
    {

        Item item =stringArray[--N];
        stringArray[N] = null;

       if(N > 0 && N == stringArray.length/4)
       {
           resize(stringArray.length/2);
       }

        return item;
    }
    
    
    
    
    
    private  void resize(int capacity)
    {
        Item[] copy = (Item[]) new Object[capacity];


        for (int i = 0; i <N ; i++) {


            copy[i] = stringArray[i];
            
        }
        

        stringArray = copy;
        
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {

        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0 ;
        }

        @Override
        public Item next() {
            return stringArray[--i];
        }

        @Override
        public void remove() {

        }
    }
}
