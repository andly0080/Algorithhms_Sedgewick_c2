package com.example.com.example.youtube;

/**
 * Created by davidyu on 3/2/17.
 */

public class BinarySearch {

    public static void main(String[] arg)
    {

        int[] a = {34,23,2,4,6,8,9,10};


         find(0, a.length-1, 8, a);




    }



    public static int binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length - 1;


        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;


            if (key < a[mid]) hi = mid - 1;

            else if (key > a[mid]) lo = mid + 1;

            else return mid;


        }

        return -1;

    }


    public static void find(int leftIndex, int rightIndex, int key, int[] a) {


        int midIndex = (leftIndex + rightIndex) / 2;
        int midValue = a[midIndex];

        if (rightIndex >=leftIndex) {

            if (key == midValue) {
                System.out.printf("found "+ midIndex );
            } else if (key < midValue) {

                //find left
                find(leftIndex, midIndex - 1, key, a);


            } else {
                find(midIndex + 1, rightIndex, key, a);

            }


        }


    }


}
