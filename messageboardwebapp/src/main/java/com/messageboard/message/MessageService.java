package com.messageboard.message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageService {

    private static List<String> messages = new ArrayList();

    public List<String> retrieveMessages() {
        return messages;
    }

    public void addMessage(String message){
        messages.add(message);
    }
}

