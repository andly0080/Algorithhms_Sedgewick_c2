package com.example.serviceStock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by davidyu on 3/15/17.
 */

public class Service1 {




    public static void main(String[] args)
    {
        new Service1();
    }



    public Service1()
    {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);


            System.out.println("I am service , and waitting ");


            Socket socket = serverSocket.accept();



           //read
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            String info = bufferedReader.readLine();

            System.out.println("I am service and received "+ info);



            //write

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
            printWriter.println("hi Client, do you recived , ");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
