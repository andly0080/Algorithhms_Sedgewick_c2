package com.example;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by davidyu on 2/21/17.
 */

public class FixedCapacityStackOfString<Item> {

    private Item[] a ;
    private int N  ;  //size

    public FixedCapacityStackOfString(int cap)
    {

        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty(){

        return N == 0;
    }


    public boolean isFull()
    {

        return N ==a.length;
    }


    public int size()
    {
        return N;
    }


    public void push(Item item)
    {
        if(N == a.length)
        {
            resize(a.length *2);
        }
//        a[N++] = item;

        a[N] = item;
        N = N+1;

    }

    public Item pop()
    {
        N = N-1;
        Item item = a[N];
//        Item item = a[--N];
        a[N] = null;

        if(N > 0 && N == a.length/4) resize(a.length/2);

        return item;



    }


    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];

        for (int i = 0; i < a.length; i++) {

            temp[i] = a[i];
        }

        a = temp;


    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        FixedCapacityStackOfString<String> s = new FixedCapacityStackOfString<>(3);

        while(scanner.hasNext())
        {

            String item = scanner.nextLine();

            if(!item.equals("-"))
            {

                s.push(item);
            }else
            {
                System.out.println("poping "+ s.pop());
            }

            System.out.println(s.size() +"left");
        }




    }



    private class RevereArrayIterator implements  Iterator<Item>
    {

        private int i = N;
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            i = i- 1;
            return a[i];
        }

        @Override
        public void remove() {

        }
    }


}
