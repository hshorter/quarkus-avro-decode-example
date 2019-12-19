package org.acme;

import org.acme.avro.Example;

import java.io.IOException;
import java.nio.ByteBuffer;

public class Decoder {

    public Example decode (byte[] message) throws IOException {
        return Example.fromByteBuffer(ByteBuffer.wrap(message));
    }

}
