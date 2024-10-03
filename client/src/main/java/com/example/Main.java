package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        System.out.println("Client partito!");

        Socket s = new Socket("localhost", 3000);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String stringaInviata = "ciao";
        out.writeBytes(stringaInviata + '\n');

        String stringaRicevuta = in.readLine();

        System.out.println(stringaRicevuta);

        System.out.println("Client Terminato..");
    }
}