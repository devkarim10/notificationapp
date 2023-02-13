package com.example.emailsender.controller;

import com.example.emailsender.model.Message;
import com.example.emailsender.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    public MessageServiceImpl messageService;

    @PostMapping("/send-message")
    public ResponseEntity sendMessageByEmail(@RequestBody Message message){

        this.messageService.SendMessage(message.getTo(), message.getSubject(), message.getMessage());
        return ResponseEntity.ok("Success");
    }
}
