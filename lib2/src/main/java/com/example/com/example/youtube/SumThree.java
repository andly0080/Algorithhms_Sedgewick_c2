package com.example.com.example.youtube;

import com.example.In;
import com.example.Stopwatch;

/**
 * Created by davidyu on 3/2/17.
 */

public class SumThree {



    public static int count(int[] a)
    {
        int N = a.length;

        int count = 0 ;


        for (int i = 0; i < N; i++) {

            for(int j = i +1; j< N; j++)
            {

                for(int k = j+1; k < N ;  k++)
                {

                    if(a[i]+ a[j]+ a[k] == 0)
                    {
                        count++;
                    }

                }

            }



        }

        return count;



    }



    public static void main(String[] args)
    {




     // int[] a = readInts(args);

        int[] ints = In.readInts(args[0]);


        Stopwatch stopwatch = new Stopwatch();
        System.out.println(count(ints));


        double time = stopwatch.elapsedTime();

        System.out.println(time + "spend");
    }





    public static int[] readInts(String[] string)
    {


        int[] a ;



        a = new int[string.length];


        for (int i = 0 ; i <string.length; i++)
        {

            a[i] = Integer.parseInt(string[i]);

        }

        return a;
    }

}
