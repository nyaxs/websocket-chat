package com.example.messagingstompwebsocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.WebSocketSession;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class SocketManager {
    private static ConcurrentHashMap<Long, WebSocketSession> manager = new ConcurrentHashMap<Long, WebSocketSession>();

    public static void add(Long key, WebSocketSession webSocketSession) {
        log.info("新添加webSocket连接 {} ", key);
        manager.put(key, webSocketSession);
    }

    public static void remove(Long key) {
        log.info("移除webSocket连接 {} ", key);
        manager.remove(key);
    }

    public static WebSocketSession get(Long key) {
        log.info("获取webSocket连接 {}", key);
        return manager.get(key);
    }
}
