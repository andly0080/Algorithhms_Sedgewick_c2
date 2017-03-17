package com.example;

/**
 * Created by davidyu on 2/21/17.
 */
public class CounterImpl implements Counter {


    private String name;
    private int numberCount;


    public CounterImpl(String name)
    {
        this.name = name;
    }



    @Override
    public void increment() {
        numberCount ++;
    }

    @Override
    public int tally() {
        return numberCount;
    }


    @Override
    public String toString() {
        return "CounterImpl{" +
                "name='" + name + '\'' +
                ", numberCount=" + numberCount +
                '}';
    }
}
