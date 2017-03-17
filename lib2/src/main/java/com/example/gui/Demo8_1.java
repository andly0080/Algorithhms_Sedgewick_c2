package com.example.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Created by davidyu on 3/6/17.
 */

public class Demo8_1 extends JFrame{


    public static void main(String[] args)
    {
        Demo8_1  demo = new Demo8_1();



    }


    public Demo8_1()
    {

        JButton button = new JButton("I am button");

        this.add(button);

        this.setTitle("hello world");


        this.setSize(200,200);


        this.setLocation(500,500);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }




}
