package com.example.emailsender.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {

    String to;
    String subject;
    String message;

}
