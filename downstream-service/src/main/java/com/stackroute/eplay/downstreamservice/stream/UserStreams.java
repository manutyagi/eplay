package com.stackroute.eplay.downstreamservice.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface UserStreams {
	String INPUT = "user-in";
    @Input(INPUT)
    SubscribableChannel inboundUser();
    
    String OUTPUT = "user-out";
    @Output(OUTPUT)
    MessageChannel outboundUser();

}
