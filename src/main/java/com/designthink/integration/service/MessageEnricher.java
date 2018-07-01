package com.designthink.integration.service;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

public class MessageEnricher {

    public Message<String> enrichMessage(Message<String> message){

        System.out.println("The Header of the Message" + message.getHeaders());

        System.out.println("The Payload of the Message" + message.getPayload());

        return MessageBuilder.withPayload("This OutPut Messsage : ")
                .setHeader("output Header Name","output Header Value").build();
    }
}


