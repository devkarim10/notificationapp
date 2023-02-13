package com.example.emailsender.service;

import com.example.emailsender.model.Message;

public interface MessageService {

    public void SendMessage(String to , String subject, String message);
}
