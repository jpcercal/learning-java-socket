package com.cekurte.chat.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Map;

import com.cekurte.chat.contract.ServerConnection;
import com.cekurte.chat.message.Processor;

/**
 * Server
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public class Server implements ServerConnection {
    private int port;
    private List<String> nicknames;

    public Server(int port) 
    {
        this.port = port;
    }
    
    @Override
    public int getPort()
    {
        return this.port;
    }
    
    @Override
    public void start() {
        try {
            ServerSocket server = new ServerSocket(this.getPort());
            System.out.println("SocketServer is running at port " + this.getPort() + ".");
            
            while (true) {
                Socket socket = server.accept();
                System.out.println("A new client is connected with the IP address " + socket.getInetAddress());
                
                System.out.println("\nReading the sent data...");
                
                Processor processor = new Processor(socket.getInputStream(), System.out);
                (new Thread(processor)).start();
            }
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }
}
