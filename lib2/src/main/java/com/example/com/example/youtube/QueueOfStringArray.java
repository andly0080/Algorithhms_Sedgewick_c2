package com.example.com.example.youtube;

/**
 * Created by davidyu on 3/2/17.
 */

public class QueueOfStringArray implements QueueOfStrings{


        String[] q ;

    int head;
    int tail;
    int size;


    public QueueOfStringArray(int capacity)
    {

        q = new String[capacity];
        head = 0 ;
        tail = 0;
        size = 0;

    }




    @Override
    public void enqueue(String item) {



        q[tail] = item;
        tail++;

        if(tail ==q.length) tail= 0;

        size++;
        //mode the capacity



    }

    @Override
    public String dequeue() {


        String item = q[head];
        q[head] = null;
        head++;
        size--;

        if(head == q.length) head= 0;     //wrap up


        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }


    public int getSize()
    {
        return size;
    }
}
