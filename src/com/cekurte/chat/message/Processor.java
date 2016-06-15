package com.cekurte.chat.message;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import com.cekurte.chat.contract.MessageProcessor;

/**
 * Processor
 * 
 * @author  João Paulo Cercal
 * @version 1.0
 */
public class Processor implements MessageProcessor, Runnable {
    private InputStream in;
    private OutputStream out;

    public Processor(InputStream in, OutputStream out) {
        this.in  = in;
        this.out = out;
    }

    @Override
    public void run() {
        this.process(this.in, this.out);
    }

    @Override
    public void process(InputStream in, OutputStream out) {
        Scanner input = new Scanner(in);
        
        PrintStream output = new PrintStream(out);
        
        while (input.hasNextLine()) {
            output.println(input.nextLine());
        }
        
        input.close();
        output.close();
    }
}
