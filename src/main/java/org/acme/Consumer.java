package org.acme;

import org.acme.avro.Example;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;

@ApplicationScoped
public class Consumer {

    @Incoming("message-stream")
    public void receiveMessage(final Example message) throws IOException {
//        Example.fromByteBuffer(message.toByteBuffer());
        System.out.println("Received message");
    }
}
