package com.example;

import java.util.NoSuchElementException;

/**
 * Created by davidyu on 2/22/17.
 */

public class ResizingArrayQueue<Item> implements Queue<Item> {


    Item[] array ;

    public int size;

    public ResizingArrayQueue( ){

        array = (Item[]) new Object[1];

    }

    public void resize(int number)
    {
        Item[] temp  = (Item[]) new Object[number];

        for (int i = 0; i <size ; i++) {

            temp[i] = array[i];

        }


        array = temp;



    }


    @Override
    public void enqueue(Item o) {

        if(size == array.length)
        {
            resize(array.length*2);
        }

        array[size] = o;
        size ++;

    }

    @Override
    public Item dequeue() {



        if(isEmpty())
        {

            throw new NoSuchElementException("stack underflow");
        }

        if(size <= array.length/4)
        {
            resize(array.length/2);

        }


        size = size -1;
        Item item = array[size];

        return item;
    }



    @Override
    public boolean isEmpty() {
        return size ==0 ;
    }


    @Override
    public int size() {
        return size;
    }


    public int arraySize()
    {

        return array.length;
    }


    public void traverl()
    {

        for (int i = 0; i < size; i++) {


            System.out.print(" "+ array[i]);

        }
    }



    public static void main(String[] args)
    {
        ResizingArrayQueue<String> queue = new ResizingArrayQueue<>();
        queue.enqueue("davd");
        queue.enqueue("gwen");
        queue.enqueue("ming");
        queue.enqueue("yu");
        queue.enqueue("feng");
        queue.enqueue("feng");
        queue.enqueue("feng");
        queue.enqueue("feng");
        queue.enqueue("feng");


        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();





        System.out.println("size "+queue.size());
        System.out.println("array size "+queue.arraySize());
        queue.traverl();
    }
}
