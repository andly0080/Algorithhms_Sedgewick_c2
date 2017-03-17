package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public class VusualAccumulator {

    public double total;
    public int N;



    public VusualAccumulator(int trails, double max)
    {


        StdDraw.setXscale(0,trails);
        StdDraw.setYscale(0,max);

        StdDraw.setPenRadius(.005);

    }


    public void addDataValue(double val)
    {

        N++;
        total++;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);

    }



    public double mean()
    {

        return total/N;

    }

    @Override
    public String toString() {
        return "means ("+N+"): is "+ mean();
    }



    public static void main(String[] args)
    {

        int T = 1000;
        VusualAccumulator a = new VusualAccumulator(T,1.0);

        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);

    }
}
