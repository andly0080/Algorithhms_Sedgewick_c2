package com.example.com.example.youtube;

/**
 * Created by davidyu on 3/3/17.
 */


import com.example.StdIn;
import com.example.StdOut;

import java.util.LinkedList;

/**
 *  value: push onto the value stack
 *  operator: push onto the operator stack
 *  left parenthesis: ignore
 *  right parenthesis: pop operator and two value; push the result of applying that operator to those values onto
 *  the operand stack.
 *
 */




public class DijkstraTwoStack {


    public static void main(String[] args)
    {
        LinkedStack<String> ops = new LinkedStack();
        LinkedStack<Double> vals = new LinkedStack();



        // (1+2)



        while(!StdIn.isEmpty())
        {

            String s = StdIn.readString();

            if(s.equals("-")) break;

            if(s.equals("("))   ;

            else if(s.equals("+")) ops.push(s);
            else if(s.equals("*")) ops.push(s);

            else if(s.equals(")"))
            {
                String op = ops.pop();
                if(op.equals("+")) vals.push(vals.pop()+vals.pop());
                else if(op.equals("*")) vals.push(vals.pop()* vals.pop());

            }
            else vals.push(Double.parseDouble(s));




        }


        StdOut.print(vals.pop());


    }

}
