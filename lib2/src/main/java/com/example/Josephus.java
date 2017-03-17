package com.example;

/**
 * Created by davidyu on 2/23/17.
 */

public class Josephus {


    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        //initialize the uque
        QueueImpl<Integer> queue = new QueueImpl<>();


        for (int i = 0 ; i< n ; i++)
        {
            queue.enqueue(i);
        }


        while (!queue.isEmpty())
        {
           for (int i = 0 ; i <m-1;i++)
           {


               queue.enqueue(queue.dequeue());
           }

            System.out.print(queue.dequeue() + "");
        }




    }
}
