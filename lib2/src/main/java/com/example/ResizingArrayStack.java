package com.example;

import java.util.Scanner;

/**
 * Created by davidyu on 2/21/17.
 */

public class ResizingArrayStack<Item> {


    private Item[] a = (Item[]) new Object[1];  //stack items;
    private int N = 0;   //number of items

    public boolean isEmpty() {

        return N == 0;

    }

    public int size() {
        return N;
    }


    private void resize(int max) {

        //move statck to a new Array of size max.

        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {

            temp[i] = a[i];
        }

        a = temp;
    }


    public void push(Item item) {

        // ad item to top of stack;
        if (N == a.length) resize(2 * a.length);

        a[N] = item;
        N = N + 1;

    }


    public Item pop() {


        N = N - 1;
        Item item = a[N];

        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }


        return item;


    }


    private class ReverserArrayIterator implements Iterator<Item> {

        //support LIFO iteration.
        private int i = N;


        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }


    public Iterator iterator() {

        return new ReverserArrayIterator();

    }


    public static void main(String[] arg) {


        Scanner scanner = new Scanner(System.in);

        ResizingArrayStack<String> s = new ResizingArrayStack<>();

        while (scanner.hasNext()) {

            String item = scanner.nextLine();


            if (item.equals("Q")) {

                iteratorAllData(s);

                break;
            } else {

                if (item.equals("-")) {

                    System.out.println("poping " + s.pop());

                } else {
                    s.push(item);

                }


            }


            System.out.println(s.size() + "left");
        }

    }

    private static void iteratorAllData(ResizingArrayStack<String> s) {
        Iterator iterator = s.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }


}
