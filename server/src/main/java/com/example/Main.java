package com.example;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)throws IOException 
    {
        System.out.println("Server Avviato!");

        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();

        System.out.println("Un client si è collegato");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String stringaRicevuta = in.readLine();
        System.out.println("La stringa ricevuta: " + stringaRicevuta);

        String stringaMaiuscola = stringaRicevuta.toUpperCase();
        out.writeBytes(stringaMaiuscola + '\n');

        s.close();
        ss.close();

        System.out.println("Server Terminato..");
    }
}