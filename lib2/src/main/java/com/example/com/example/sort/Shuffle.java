package com.example.com.example.sort;

import com.example.StdRandom;

/**
 * Created by davidyu on 3/3/17.
 */

public class Shuffle {


    public static void shuffle(Comparable[] a)
    {
        int N = a.length;

        for (int i = 0; i < N; i++) {

            int r = StdRandom.uniform(i+1);    //between 0 and 1;
            exch(a,i,r);

        }


    }


    private  static boolean less(Comparable v, Comparable w)
    {

        return v.compareTo(w) < 0 ;

    }


    private static void exch(Comparable[] a , int i , int j)
    {

        Comparable swap =a[i];

        a[i] = a[j];

        a[j] = swap;

    }



}
