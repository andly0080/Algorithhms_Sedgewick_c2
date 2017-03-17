package com.example.com.example.youtube;

import com.example.In;
import com.example.StdIn;

import java.io.File;

/**
 * Created by davidyu on 3/3/17.
 */

public class SortTest {

    public static void main(String[] args)
    {
//        File directory = new File(args[0]);
//
//        File[] files = directory.listFiles();
//
//        for (int i = 0; i < files.length; i++) {
//
//            System.out.println(files[i].getName());
//
//        }


        String[] strings = In.readStrings(args[0]);


        for (String string : strings) {


            System.out.println("string is "+ string);
        }

    }
}
