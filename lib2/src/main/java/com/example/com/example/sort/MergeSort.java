package com.example.com.example.sort;

/**
 * Created by davidyu on 3/3/17.
 */

public class MergeSort {


    private static Comparable[] aux;
    public static void sort(Comparable[] a)
    {

        aux = new Comparable[a.length];

        sort(a, 0 , a.length -1);



    }


    private static void sort(Comparable[]a , int lo, int hi)
    {

        //sort a[lo....hi]
        if(hi <=lo) return;
        int mid = lo+(hi- lo)/2;
        sort(a,lo, mid);   //sort left half;
        sort(a,mid+1,hi);  //sort right half;
        merge(a,lo ,mid,hi);

    }




    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);   //precondition: a[lo....mid] sorted
        assert isSorted(a, mid + 1, hi); // precondition : a[mid+1...hi] sorted

        for (int k = lo; k <= hi; k++) {   //Copy a[lo...hi] to aux[lo..hi]
            aux[k] = a[k];
        }

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {


            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];


        }


        assert isSorted(a, lo, hi);   //postcondition: a[lo...hi] sorted


    }


    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) < 0;

    }


    private static void exch(Comparable[] a, int i, int j) {

        Comparable swap = a[i];

        a[i] = a[j];

        a[j] = swap;

    }

    public static boolean isSorted(Comparable[] a, int lo, int hi) {

        for (int i = lo+1; i <= hi; i++) {

            if (less(a[i], a[i - 1])) return false;
        }

        return true;


    }


    public static boolean isSorted(Comparable[] a)
    {
        return isSorted(a,0,a.length-1);
    }


}
