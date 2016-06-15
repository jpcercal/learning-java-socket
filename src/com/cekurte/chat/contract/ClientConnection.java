package com.cekurte.chat.contract;

/**
 * ClientConnection
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public interface ClientConnection extends SocketConnection {

    /**
     * Get the IP address.
     * 
     * @return the IP adress.
     */
    public String getIpAddress();
}
