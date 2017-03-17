package com.example;

/**
 * Created by davidyu on 2/22/17.
 */

public class excercse1_3_11 {


//    *  % java infixToPostfix
//    *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
//            *  [Ctrl-d]
//            *  2 3 4 + 5 6 * * +
//            *
//            *  % java infixToPostfix | java EvaluatePostfix
//    *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
//            *  [Ctrl-d]
//            *  212
//            *
//


    public static void main(String[] args) {

        String s = "(2+((3+4)*(5*6)))";

//        String s = "(3*(4+5))";
       // String s = "345+*";

        String s1 = infixToPostfix(s);

        System.out.println(s1);


         evaluatePostfix(s1);


    }


    public static String infixToPostfix(String s) {
        StackImpl<Character> stack = new StackImpl<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '+' || c == '*') {
                stack.push(c);

            } else if (c == '(') {
//                System.out.print("");

            } else if (c == ')') {
//                System.out.print(stack.pop() + " ");
                sb.append(stack.pop());
            } else {
//                System.out.print(c+" ");
                sb.append(c);
            }


        }

        return sb.toString();

    }


    public static void evaluatePostfix(String s) {

//        *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
////            *  [Ctrl-d]
////            *  212

        //    *  ( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )
//            *  [Ctrl-d]
//            *  2 3 4 + 5 6 * * +


//        *  % java EvaluatePostfix
//        *  3 4 5 + *
//        *  [Ctrl-d]
//        *  27


        StackImpl<Integer> stack = new StackImpl<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if (c == '+') {
                int result =  stack.pop()  +  stack.pop();
                stack.push( result);
            }
            else if (c == '*') {
                int result =  stack.pop() *  stack.pop();
                stack.push( result);

            } else {
                stack.push(Character.getNumericValue(c));

            }


        }


        System.out.println(stack.pop());


    }
}
