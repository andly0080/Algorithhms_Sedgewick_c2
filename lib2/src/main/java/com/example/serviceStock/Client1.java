package com.example.serviceStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by davidyu on 3/15/17.
 */

public class Client1 {


    public static void main(String[] args)
    {
        new Client1();

    }


    public Client1()
    {

        try {
            Socket socket = new Socket("127.0.0.1",9999);

            //write
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);

            pw.println("hello service!!");

            //read
            //read
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String info = bufferedReader.readLine();
            System.out.println("I am client received message : "+ info);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
