package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PublishController {

    @MessageMapping("/sendAll")
    @SendTo("/topic/chatroom")
    public String sendAllUser(Message message){
        return message.getContent();
    }


}
