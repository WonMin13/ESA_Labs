package com.example.labwork4final.jms;

import com.example.labwork4final.model.DbChange;
import com.example.labwork4final.model.Notification;
import com.example.labwork4final.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import com.example.labwork4final.model.*;

import javax.persistence.Column;

@Component
public class Receiver {

    @Autowired
    private ChangeService changeService;

    @Autowired
    private EmailSenderService emailSenderService;


   @Value("${spring.mail.emailAddress}")
    private String emailAddress;


    @Autowired
    private NotificationService notificationService;


    @JmsListener(destination = "dbChange", containerFactory = "myFactory")
    public void receiveMessageSendEmails(DbChange dbChange) {
        // send emails
        String subject = "DB change";
        String text = createEmailText(dbChange);
       emailSenderService.sendEmail(emailAddress, subject, text);


    }

    @JmsListener(destination = "dbChange", containerFactory = "myFactory")
    public void receiveMessageSaveChange(DbChange dbChange) {
        // insert into db
        changeService.save(dbChange);
    }

    private String createEmailText(DbChange dbChange) {
        StringBuilder text = new StringBuilder()
                .append("Change type: ").append(dbChange.getType()).append("\n")
                .append("Entity name: ").append(dbChange.getEntitySimpleName()).append("\n")
                .append("Entity ID: ").append(dbChange.getEntityId()).append("\n");
        if (dbChange.getOldEntityString() != null)
            text.append("Old entity data: ").append(dbChange.getOldEntityString()).append("\n");
        if (dbChange.getNewEntityString() != null)
            text.append("New entity data: ").append(dbChange.getNewEntityString()).append("\n");
        return text.toString();
    }

}
