package com.cekurte.chat.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.cekurte.chat.contract.ClientConnection;
import com.cekurte.chat.message.Processor;

/**
 * Client
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public class Client implements ClientConnection {
    private String ip;
    
    private int port;

    public Client(String ip, int port) 
    {
        this.ip   = ip;
        this.port = port;
    }
    
    @Override
    public String getIpAddress()
    {
        return this.ip;
    }
    
    @Override
    public int getPort()
    {
        return this.port;
    }
    
    @Override
    public void start() {
        System.out.println("Trying connect to the Server " + this.getIpAddress() + ":" + this.getPort() + ".");
        
        try {
            Socket client = new Socket(this.getIpAddress(), this.getPort());
            System.out.println("Connected to the Server!");
            
            System.out.println("\nPut the message and press ENTER to send to the server...");
            
            Processor processor = new Processor(System.in, client.getOutputStream());
            (new Thread(processor)).start();
        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
