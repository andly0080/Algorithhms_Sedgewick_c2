package com.example;

import java.util.*;
import java.util.Iterator;

/**
 * Created by davidyu on 2/21/17.
 */
public class StackImpl<Item> implements Stack<Item>,Iterable {



//编写一个可迭代的Stack用例，它含有一个静态的copy方法，接受一个字符串的栈作为参数并返回该栈的一个副本。


    private Node firstNode;
    private int N;


    public StackImpl(){



    }


    @Override
    public void push(Item item) {


       Node oldFirstNode =  firstNode;

       firstNode = new Node();
        firstNode.item =   item;
        firstNode.next  = oldFirstNode;


        N =N +1 ;
    }

    @Override
    public Item pop() {



       if(isEmpty()) throw  new NoSuchElementException("Stack underflow");


        Item item = (Item) firstNode.item;

        firstNode =firstNode.next;
        N--;

        return (Item) item;
    }


    public Item peek()
    {

        if(isEmpty()) throw new NoSuchElementException("Stack underflow");
        return (Item)firstNode.item;

    }

    @Override
    public boolean isEmpty() {
        return N ==0 ;
    }

    @Override
    public int size() {
        return N;
    }



   public StackImpl<Item> copyStack(StackImpl<Item> stack)
   {


       StackImpl<Item>  resultStack = new StackImpl<>();

       Iterator iterator = stack.iterator();

       while(iterator.hasNext())
       {

           Item item = (Item) iterator.next();

           resultStack.push(item);
       }

       return resultStack;

   }



    public static void main(String[] args)
    {

        StackImpl<String>  stack = new StackImpl<>();


        stack.push("david");
        stack.push("gwen");
        stack.push("feng");
        stack.push("xing");


        StackImpl<String> newStack = stack.copyStack(stack);


        Iterator<String> iterator = newStack.iterator();

        while(iterator.hasNext())
        {

            System.out.println(""+ iterator.next());
        }


//
//        Scanner scanner = new Scanner(System.in);
//
//
//        while (scanner.hasNext())
//        {
//
//
//            String item = scanner.nextLine();
//
//            if(!item.equals("-"))
//            {
//
//                stack.push(item);
//            }else
//            {
//                System.out.println(stack.pop() + " popping");
//            }
//
//            System.out.println( stack.size() + " left on stack");
//
//        }



//        stack.push("ok");
//        stack.push("bb");
//        stack.push("cc");
//
//
//        stack.pop();
//        stack.pop();
//
//        stack.travel();


    }


    @Override
    public Iterator<Item> iterator() {

        return new Iterator() {

            Node current = firstNode;
            @Override
            public boolean hasNext() {
                return current !=null;
            }

            @Override
            public Item next() {

                if(!hasNext())
                    throw new NoSuchElementException("Stack under flow");
                Item item = (Item) current.item;
                current = current.next;
                return item;
            }

            @Override
            public void remove() {

            }
        };
    }
}
