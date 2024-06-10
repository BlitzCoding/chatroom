package com.yonghun.chatroom.dto;
import java.util.UUID;

public class ChatRoom {
    private String roomId;
    private String name;

    public static ChatRoom create(String name)
    {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.roomId = UUID.randomUUID().toString();
        chatRoom.name = name;
        return chatRoom;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }
}
