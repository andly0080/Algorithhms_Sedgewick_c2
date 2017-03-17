package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public class Date {


    int month;
    int day;
    int year;


    public Date(int month, int day, int year) {

        if (!isIllegal(month,day,year))

        {
            throw new IllegalArgumentException("Illegal data");
        }


        this.month = month;
        this.day = day;
        this.year = year;

    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }


    private static boolean isLeapYear(int y)
    {


        return ((y%4 == 0 && y%100!=0) || y%400 == 0);
    }


    private boolean isIllegal(int m , int d, int y)
    {
        if(y<0 || d<1 ||d >31)
        {
            return false;

        }
        if(m>12 || m<0)
        {
            return false;
        }


        int[] monthofday = { 0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if(isLeapYear(y))
        {

            monthofday[2] =29;
        }else
        {
            monthofday[2] =28;
        }

        if(d> monthofday[m])
        {
            return false;

        }else
        {

            return true;
        }



    }


    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null) return false;

        if (this.getClass() != o.getClass()) return false;
        Date that = (Date) o;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;


    }

    public static void main(String[] args) {

//        Date date = new Date(12, 31, 1999);
//        System.out.println(date);


//        String string1 = "hello";
//        String string2 = string1;
//
//        string1 = "world";
//        System.out.println(string1);
//        System.out.println(string2);



//        String s = "hello World";
//        s.toUpperCase();
//        s= s.substring(6,11);
//        System.out.println(s);



        String s = "ACTGACG";
        String s2 = shift(s, 4);

        System.out.println(s2);

    }



    public static String shift(String source, int index)
    {

        //index =2 ;
        //ACTGACG   -> TGACGAC

         String backTemp = source.substring(0,index);

         String rest  = source.substring(index);

        rest =rest.concat(backTemp);



        return rest;
    }

}
