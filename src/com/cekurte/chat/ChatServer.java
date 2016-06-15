package com.cekurte.chat;

import com.cekurte.chat.socket.Server;

/**
 * ChatServer
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public class ChatServer {

    /**
     * Main method, that initialize the server.
     * 
     * @param args a String arguments.
     */
    public static void main(String[] args) {
        (new Server(12345)).start();
    }
}
