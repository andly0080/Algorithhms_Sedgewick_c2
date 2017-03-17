package com.example;

/**
 * Created by davidyu on 2/21/17.
 */

public class Transaction {


      private String who;
      private Date date;
      private double amount;



    public Transaction(String who, Date date, double amount)
    {

        if(who == null)
        {
            throw new IllegalArgumentException("illegal data");

        }


        this.who = who;
        this.date = date;
        this.amount = amount;


    }


    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "who='" + who + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (Double.compare(that.amount, amount) != 0) return false;
        if (who != null ? !who.equals(that.who) : that.who != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = who != null ? who.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
