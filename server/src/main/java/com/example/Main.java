package com.example;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;


public class Main
{
    public static void main(String[] args)throws IOException 
    {
        System.out.println("Server Avviato!");
        ServerSocket ss = new ServerSocket(3000);
    
        while(true)
        {
            Connesione c = new Connesione(ss.accept());
            c.start();
        }
    }
}