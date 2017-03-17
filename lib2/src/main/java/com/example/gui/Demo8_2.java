package com.example.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Created by davidyu on 3/6/17.
 */

public class Demo8_2 extends JFrame{



    public static void main(String[] args)
    {


          new Demo8_2();
    }


    JButton jb1,jb2,jb3,jb4,jb5;

    public Demo8_2()
    {

        jb1= new JButton("middle");
        jb2= new JButton("north");
        jb3= new JButton("east");
        jb4= new JButton("south");
        jb5= new JButton("west");



        this.add(jb1, BorderLayout.CENTER);
        this.add(jb2, BorderLayout.NORTH);
        this.add(jb3, BorderLayout.EAST);
        this.add(jb4, BorderLayout.SOUTH);
        this.add(jb5, BorderLayout.WEST);



        this.setTitle("border layout");
        this.setSize(300,200);
        this.setLocation(200,200);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setVisible(true);
    }


}
