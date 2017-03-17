package com.example;

/**
 * Created by davidyu on 2/14/17.
 */




/**
 * MyStack(int size )
 * boolean isStackEmpty();
 * boolean is StackFull();
 * void clearStack();
 * int stackLength();
 * void push(Char element)
 * void pop(char && elem)
 * void stackTraverse();
 */


public  class MyStack<E>  {

    int mMaxSize;

    public  Object[] array;

    int topIndex; //number of stack

    MyStack(int size) {
        mMaxSize = size;
        array = new Object[size];
        topIndex = 0;
    }

    public boolean isStackEmpty() {
        if (topIndex == 0) {

            return true;
        } else {

            return false;
        }

    }


    public boolean isStackFull() {
        if (topIndex == mMaxSize) {
            return true;

        } else {

            return false;
        }

    }

    public void clearStack() {

       topIndex = 0 ;
    }


    public int stackLength(){


        return topIndex;
    }


    boolean push(E element)
    {
        if(isStackFull())
        {

            return false;
        }

        array[topIndex] = element;
        topIndex++;
        return true;
    }


    E pop()
    {

        if(isStackEmpty())
        {
            throw new RuntimeException("can't pop");
        }
        topIndex--;
        E c = (E) array[topIndex];
        return c;

    }

    void stackTraverse(boolean isFromBottom){
       if(isFromBottom)
       {
           for (int i = 0; i <topIndex ; i++) {
               System.out.println(array[i].toString()+ " ");
           }
       }else
       {
           for (int i = topIndex-1; i >= 0 ; i--) {
               System.out.println(array[i].toString()+ " ");
           }

       }


    }
    
    
    public static void main(String[] args)
    {
        //  (1+(2 * ((3+5)/2)))

//        String[] a = new String[]{"(","1","+","(","(","2","+","3",")","*","(","4","*","5",")",")",")"};
        String[] a = new String[]{"(","1","+","(","2","*","(","(","3","+","5",")","/","2",")",")",")"};



        Double result = calcuate(a);

        System.out.println(result);

    }
    
    
    
    
    public static Double calcuate(String[] s)
    {

        //push operands onto the operand stack;
        // push operators onto the operator stack;
        // ignore left parentheses.
        //on ecoutering a right parenthesis, pop an operator, pop the requisite number of operands, and push onto the operand stack the result of
        // the applying that operator to those opeands.

        MyStack<String> ops = new MyStack<>(100);
        MyStack<Double> vals = new MyStack<>(100);





        for (int i = 0; i < s.length; i++) {

          if(s[i].equals("(")) ;
          else if(s[i].equals("+"))  ops.push(s[i]);
          else if(s[i].equals("-")) ops.push(s[i]);
          else if(s[i].equals("*"))  ops.push(s[i]);
          else if(s[i].equals("/"))  ops.push(s[i]);

          else if(s[i].equals(")"))
          {
              //Pop, evalue , and push result if token is ")"

              String pop = ops.pop();
              Double value = vals.pop();

              if(pop.equals("+")) value = vals.pop() + value;
              if(pop.equals("-")) value = vals.pop() - value;
              if(pop.equals("*")) value = vals.pop() * value;
              if(pop.equals("/")) value = vals.pop() / value;

              vals.push(value);

          }
          else
              vals.push(Double.parseDouble(s[i]));
        }

        return vals.pop();
        


    }
    
    
}
