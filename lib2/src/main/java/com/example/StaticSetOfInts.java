package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by davidyu on 2/21/17.
 */

public class StaticSetOfInts {

    private int[] a;



    public StaticSetOfInts(int[] keys)
    {

        a= new int[keys.length];
        for (int i = 0; i < keys.length; i++) {

            a[i] = keys[i];
        }

        Arrays.sort(a);

    }


    public boolean contains(int key,Counter counter)
    {

        return rank(key,counter)!=-1;

    }



    private int rank(int key ,Counter counter)
    {

        //Binary search.
        int lo= 0;
        int hi = a.length -1 ;
        while(lo <= hi )
        {
            //Key is in a[lo...hi] or not present

            int mid = lo+(hi - lo)/2;

            if(key < a[mid])
            {
                hi = mid -1;
                counter.increment();
            }
            else if(key > a[mid]) {
                lo = mid+1;
                counter.increment();
            }

            else {
                System.out.println("c = "+ counter.tally());
                return mid ;
            }


        }
        return -1;



    }

    public static void main(String[] arg)
    {


        Random random = new Random();
        int N =10000;
        int[] w = new int[N];
        for (int i = 0; i < N; i++) {
            w[i] = random.nextInt(100)+1;

        }

        for (int i = 0; i < w.length; i++) {

            System.out.printf(" "+ w[i]);

        }

        StaticSetOfInts set = new StaticSetOfInts(w);


        Scanner scanner = new Scanner(System.in);
        Counter counter = new CounterImpl("counter ");

        while(scanner.hasNext())
        {
            int value  = scanner.nextInt();

            if(set.rank(value,new CounterImpl("counter ")) == -1)
            {
                System.out.println(value);

            }


        }


    }



}
