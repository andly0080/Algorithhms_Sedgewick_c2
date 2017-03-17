package com.example.serviceStock;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Created by davidyu on 3/16/17.
 */

public class Client2 extends JFrame implements ActionListener {


    JTextArea jTextArea;

    JTextField jTextField;
    JButton jButton;
    JPanel jPanel;
     PrintWriter pw;

    public static void main(String[] args) {

        Client2 client2 = new Client2();

    }


    public Client2() {


        jTextArea = new JTextArea();


        jTextField = new JTextField(10);
        jButton = new JButton("send");
        jButton.addActionListener(this);
        jPanel = new JPanel();

        jPanel.add(jTextField);
        jPanel.add(jButton);

        this.add(jTextArea, BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.SOUTH);


        this.setTitle("this is client side ");

        this.setSize(400, 300);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        try {
            Socket socket = new Socket("127.0.0.1",9988);


            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(isr);
            pw = new PrintWriter(socket.getOutputStream(),true);

           while(true){
               String s = bufferedReader.readLine();

               jTextArea.append(s+"\r\n");


           }




        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if(actionEvent.getSource() ==jButton )
        {

            String messageToSend = jTextField.getText();


             jTextArea.append("Client to Service : "+ messageToSend+ "\r\n");
            pw.println("Client to Service : "+ messageToSend);

            jTextField.setText("");

        }
    }
}
