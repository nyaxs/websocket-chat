package com.example.messagingstompwebsocket;

import lombok.Data;

@Data
public class Message {
    private String content;
    private String roomId;
}
