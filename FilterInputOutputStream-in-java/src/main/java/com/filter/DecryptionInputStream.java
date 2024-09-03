package com.filter;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecryptionInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected DecryptionInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        return (b == -1 ? b : b - 1);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);

        if (bytesRead != -1) {
            for (int i = off; i < off + bytesRead; i++) {
                b[i] -= 1;
            }
        }

        return bytesRead;
    }
}
