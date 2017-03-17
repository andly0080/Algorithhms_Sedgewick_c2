package com.example.java;

/**
 * Created by davidyu on 3/4/17.
 */

public class Pratise {



    public static void  main(String[] args)
    {


        int layer = 4;

        for (int i = 1; i <=layer; i++) {

            //print space
            //   *
            //  **
            // ***
            //****
          //level 1 ->3 , 2 - >2 ; 3->1 4 ->0

            for(int k = 1 ; k <= layer -i; k++)
            {
                System.out.printf(" ");
            }



            // print start
            //1 - >1   2->3  3->5 4 ->7

            for(int j = 1 ; j <=(2*i)-1 ;j ++)
            {

                System.out.printf("*");

            }
            System.out.println("");

        }




        int i  =1 ;

        switch (i)
        {
            default:
                System.out.println("defalut");

            case 1:

                System.out.println("case 1");

            case 2:

                System.out.println("case 2");
                break;

            case 3:

                System.out.println("case 3");









        }

    }
}
