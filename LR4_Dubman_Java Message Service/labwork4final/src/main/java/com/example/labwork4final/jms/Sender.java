package com.example.labwork4final.jms;

import com.example.labwork4final.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;
    private final String dbChangeDestination = "dbChange";

    public void sendInsert(BaseEntity entity) {
        jmsTemplate.convertAndSend(dbChangeDestination, new DbChange(DbChange.Type.INSERT, null, entity));
    }

    public void sendUpdate(BaseEntity oldEntity, BaseEntity newEntity) {
        jmsTemplate.convertAndSend(dbChangeDestination, new DbChange(DbChange.Type.UPDATE, oldEntity, newEntity));
    }

    public void sendDelete(BaseEntity entity) {
        jmsTemplate.convertAndSend(dbChangeDestination, new DbChange(DbChange.Type.DELETE, entity, null));
    }
}




