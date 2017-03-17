package com.example;

import java.util.Random;

/**
 * Created by davidyu on 2/21/17.
 */

public class Accumulator {


    public double totalValue;
    public int totalCount;

    public void addValue(double value)
    {
        totalValue +=value;
        totalCount ++;


    }

    public double mean()
    {

        return totalValue/totalCount;

    }

    @Override
    public String toString() {
        return "means ("+totalCount+"): is "+ mean();
    }



    public static void main(String[] args)
    {
        int t =10;
        Random random = new Random();
        Accumulator accumulator = new Accumulator();

        for (int i = 0; i <10 ; i++) {


            double v = random.nextDouble();

            accumulator.addValue(v);

        }


        System.out.println(accumulator);

    }
}
