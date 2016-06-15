package com.cekurte.chat;

import com.cekurte.chat.socket.Client;

/**
 * ChatClient
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public class ChatClient {

    /**
     * Main method, that initialize the client.
     * 
     * @param args a String arguments.
     */
    public static void main(String[] args) {
        (new Client("127.0.0.1", 12345)).start();
    }
}
