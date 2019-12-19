package org.acme;

import io.quarkus.scheduler.Scheduled;
import org.acme.avro.Example;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;

@ApplicationScoped
public class Producer {

    @Outgoing("message-stream")
    public Example produceMessage() throws InterruptedException, IOException {
        System.out.println("Sending message");
        new Decoder().decode("kjsncisdjnvckdjfnv".getBytes());
        Thread.sleep(1000);
        return new Example();
    }
}
