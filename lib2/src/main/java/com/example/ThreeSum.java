package com.example;

/**
 * Created by davidyu on 2/23/17.
 */

public class ThreeSum {



    public static int cout(int[] a)
    {

        int N= a.length;
        int cnt= 0;
        for (int i = 0; i < N; i++) {


            for (int j = i+1   ; j <N ; j++) {


                for (int k = j+1; k <N ; k++) {

                    if(a[i] + a[j]+ a[k] == 0)
                    {

                        cnt++ ;
                    }

                }

            }
        }


        return cnt;


    }




    public static void main(String[] args)
    {

        int [] a = {10,40,34,2,456,22};

        System.out.println(cout(a));

    }
}
