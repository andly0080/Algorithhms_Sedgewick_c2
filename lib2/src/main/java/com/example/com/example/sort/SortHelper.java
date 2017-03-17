package com.example.com.example.sort;

/**
 * Created by davidyu on 3/3/17.
 */

public class SortHelper {


    public static boolean less(Comparable v, Comparable w)
    {

        return v.compareTo(w) < 0 ;

    }


    public static void exch(Comparable[] a , int i , int j)
    {

        Comparable swap =a[i];

        a[i] = a[j];

        a[j] = swap;

    }



    public static boolean isSorted(Comparable[] a)
    {

        for (int i = 0; i < a.length; i++) {

            if(less(a[i], a[i-1])) return false;
        }

        return true;





    }


    public static void main(String[] args)
    {


       Integer[] a = new Integer[]{9,1,3,4,6,10,7,8,5,2};
//        Character[] a = new Character[]{ 'c','a', 'z' ,'d','f','q','w'};


        //Selection.sort(a);
        MergeSort.sort(a);


        for (int i = 0; i < a.length; i++) {

            System.out.printf(" "+ a[i]);
        }




    }
}
