package com.yonghun.chatroom.controller;

import com.yonghun.chatroom.dto.ChatRoom;
import com.yonghun.chatroom.service.ChatService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/chat")
    public ChatRoom createRoom(@RequestParam(value="name") String name) {
        return chatService.createRoom(name);
    }

    @GetMapping("/chat")
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
}
