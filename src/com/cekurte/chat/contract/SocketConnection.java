package com.cekurte.chat.contract;

/**
 * SocketConnection
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public interface SocketConnection extends Connection {

    /**
     * Get the port number.
     * 
     * @return the port number.
     */
    public int getPort();
}
