package com.cekurte.chat.contract;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * MessageProcessor
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public interface MessageProcessor {

    /**
     * Process a input stream lines and put them in a output stream.
     * 
     * @param input  a InputStream that will be used to read the information.
     * @param output a OutputStream that will be used to write an output.
     */
    public void process(InputStream input, OutputStream output);
}
