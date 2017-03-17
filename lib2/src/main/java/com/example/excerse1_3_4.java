package com.example;

/**
 * Created by davidyu on 2/22/17.
 */

public class excerse1_3_4 {



    public static void main(String[] args)
    {

//      String s = "[(]{}{[()()]}";
//
//        System.out.println("value is "+ lookForParentheses(s));



//              int N = 50;
//        StackImpl<Integer> stack = new StackImpl<>();
//
//        while(N > 0 )
//        {
//
//            stack.push(N%2);
//            N = N /2;
//
//
//        }
//
//       while(!stack.isEmpty())
//       {
//           System.out.print(stack.pop());
//       }



//        1 + 2 ) * 3 - 4 ) * 5- 6 ) ) )
//        ( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )


        String s =  "1+2)*3-4)*5-6)))";

        StackImpl<String> opStack = new StackImpl<>();
        StackImpl<String> valStack = new StackImpl<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);


            if(c == '+' || c== '-' || c =='*' || c=='/')
            {
                opStack.push(Character.toString(c));
            }

            else if(c ==')')
            {

                String tempValue = "";
                //do something about it
                String val1 = valStack.pop();
                String op   = opStack.pop();

                tempValue = String.format("( %s %s %s )",valStack.pop(),op,val1 );
                valStack.push(tempValue);
            }
            else {

                    valStack.push(Character.toString(c));

            }




        }

        String result = valStack.pop();

        System.out.println(result);


    }




    public static final char LEFT_PAREN = '(';
    public static final char RIGHT_PAREN = ')';
    public static final char LEFT_BRACE= '{';
    public static final char RIGHT_BRACE= '}';
    public static final char LEFT_BRACKET= '[';
    public static final char RIGHT_BRACKET= ']';




    public static boolean lookForParentheses(String s)
    {


        StackImpl<Character> stack = new StackImpl<>();
        // ""   [()]{}{[()()]}

        for (int i = 0; i <s.length() ; i++) {


            char c = s.charAt(i);

            if(c ==LEFT_PAREN)
            {
                stack.push(LEFT_PAREN);
            }else if (c ==LEFT_BRACE)
            {
                stack.push(LEFT_BRACE);
            }else if(c == LEFT_BRACKET)
            {
                stack.push(LEFT_BRACKET);
            }


            if(c == RIGHT_PAREN)
            {

                if(stack.isEmpty()) return false;

                if(stack.pop() != LEFT_PAREN)
                {
                    return false;
                }
            }
            else if(c == RIGHT_BRACE)
            {
                if(stack.isEmpty()) return false;
                if(stack.pop() != LEFT_BRACE)
                {
                    return false;
                }
            }
            else if(c == RIGHT_BRACKET)
            {
                if(stack.isEmpty()) return false;
                if(stack.pop() != LEFT_BRACKET)
                {
                    return false;
                }
            }


        }


        return stack.isEmpty();


    }

}
