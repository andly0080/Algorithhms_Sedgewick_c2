package com.example;

import java.util.Random;

/**
 * Created by davidyu on 2/21/17.
 */

public class FlickTest {


    public static void main(String[] args)
    {

        int numberOfFlick = Integer.parseInt(args[0]);

        CounterImpl head = new CounterImpl("head");
        CounterImpl tail = new CounterImpl("tail");

        Random random = new Random();

        for (int i = 0; i < numberOfFlick; i++) {

            int n = random.nextInt(2) + 1;

            if(n ==2)
            {
                head.increment();

            }else
            {
                tail.increment();
            }

        }


        System.out.println(head);
        System.out.println(tail);

        int d = head.tally() - tail.tally();

        System.out.println("delta: "+ Math.abs(d));

        System.out.println(max(head,tail)+ "wins");


    }


    public static Counter max(Counter x , Counter y)
    {

        if(x.tally() > y.tally())
            return x;
        else
            return y;


    }



}
