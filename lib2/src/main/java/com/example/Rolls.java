package com.example;

import java.util.Random;

import static com.example.Interval.mystery;


/**
 * Created by davidyu on 2/21/17.
 */

public class Rolls {


    public static void main(String[] args)
    {


//        int times = Integer.parseInt(args[0]);
//
//        int SIZE = 6 ;
//
//        CounterImpl[] rolls = new CounterImpl[SIZE+1];
//
//        Random random = new Random();
//
//
//        for (int i = 1; i <=SIZE ; i++) {
//
//            rolls[i] = new CounterImpl(i+ " s");
//        }
//
//
//        for (int i = 0; i < times; i++) {
//
//            int result = random.nextInt(6) + 1;
//
//            rolls[result].increment();
//
//        }
//
//
//        for (int i = 1; i <=SIZE ; i++) {
//
//            System.out.println(rolls[i]);
//
//        }




//        double xlo = Double.parseDouble(args[0]);
//        double xhi = Double.parseDouble(args[1]);
//        double ylo = Double.parseDouble(args[2]);
//        double yhi = Double.parseDouble(args[3]);
//
//        int T = Integer.parseInt(args[4]);
//
//        Interval1D x = new Interval1D(xlo,xhi);
//        Interval1D y = new Interval1D(ylo,yhi);
//
//
//        Interval2D box = new Interval2D(x, y);
//        box.draw();
//
//
//        CounterImpl c = new CounterImpl("hits");
//
//        for (int t= 0 ; t<T; t++)
//        {
//
//            double x1 =   Math.random();
//            double y2 =   Math.random();
//
//
//            Point2D p = new Point2D(x1, y2);
//            if(box.contains(p)) c.increment();
//            else
//                p.draw();
//
//        }
//
//        StdOut.println(c);
//        StdOut.println(box.area());




//        String s = args[0];







//        Interval[] intervals = new Interval[4];
//
//        intervals[0] = new Interval(15.0, 33.0);
//        intervals[1] = new Interval(45.0, 60.0);
//        intervals[2] = new Interval(20.0, 70.0);
//        intervals[3] = new Interval(46.0, 55.0);
//
//        for (int i = 0; i < intervals.length; i++)
//            System.out.println(intervals[i]);
//        System.out.println("");


        String s = mystery("hellook");

        System.out.println(s);



    }










}


  class Interval {
    private final double min;
    private final double max;

    /**
     * Initializes a closed interval [min, max].
     *
     * @param min the smaller endpoint
     * @param max the larger endpoint
     * @throws IllegalArgumentException if the min endpoint is greater than the max endpoint
     * @throws IllegalArgumentException if either {@code min} or {@code max}
     *                                  is {@code Double.NaN}, {@code Double.POSITIVE_INFINITY} or
     *                                  {@code Double.NEGATIVE_INFINITY}
     */
    public Interval(double min, double max) {
        if (Double.isInfinite(min) || Double.isInfinite(max))
            throw new IllegalArgumentException("Endpoints must be finite");
        if (Double.isNaN(min) || Double.isNaN(max))
            throw new IllegalArgumentException("Endpoints cannot be NaN");

        // convert -0.0 to +0.0
        if (min == 0.0) min = 0.0;
        if (max == 0.0) max = 0.0;

        if (min <= max) {
            this.min = min;
            this.max = max;
        } else throw new IllegalArgumentException("Illegal interval");
    }

    /**
     * Returns the min endpoint of this interval.
     *
     * @return the min endpoint of this interval
     */
    public double min() {
        return min;
    }

    /**
     * Returns the max endpoint of this interval.
     *
     * @return the max endpoint of this interval
     */
    public double max() {
        return max;
    }

    /**
     * Returns true if this interval intersects the specified interval.
     *
     * @param that the other interval
     * @return {@code true} if this interval intersects the argument interval;
     * {@code false} otherwise
     */
    public boolean intersects(Interval that) {
        if (this.max < that.min) return false;
        if (that.max < this.min) return false;
        return true;
    }

    /**
     * Returns true if this interval contains the specified value.
     *
     * @param x the value
     * @return {@code true} if this interval contains the value {@code x};
     * {@code false} otherwise
     */
    public boolean contains(double x) {
        return (min <= x) && (x <= max);
    }

    /**
     * Returns the length of this interval.
     *
     * @return the length of this interval (max - min)
     */
    public double length() {
        return max - min;
    }

    /**
     * Returns a string representation of this interval.
     *
     * @return a string representation of this interval in the form [min, max]
     */
    public String toString() {
        return "[" + min + ", " + max + "]";
    }

    /**
     * Compares this transaction to the specified object.
     *
     * @param other the other interval
     * @return {@code true} if this interval equals the other interval;
     * {@code false} otherwise
     */
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.getClass() != this.getClass()) return false;
        Interval that = (Interval) other;
        return this.min == that.min && this.max == that.max;
    }


      public static String mystery(String s)
      {
          int N = s.length();
          if (N <= 1) return s;
          String a = s.substring(0, N/2);
          String b = s.substring(N/2, N);
          return mystery(b) + mystery(a);
      }
}
