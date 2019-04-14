package com.headfirst.patterns.decoratorPattern.custom;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by adarshbhattarai on 4/6/19.
 */
public class LowerCaseInputStream extends FilterInputStream {


    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c =super.read();
        return c==-1?c : Character.toLowerCase(c);
    }

    public int read(byte b[], int offset, int length) throws IOException {

        int ret = super.read(b, offset, length);
        for(int i=offset;i<offset+length;i++){
            b[i] = (byte)(Character.toLowerCase((char)b[i]));
        }
        return  ret;
    }
}
