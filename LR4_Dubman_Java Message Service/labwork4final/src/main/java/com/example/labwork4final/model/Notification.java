package com.example.labwork4final.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
@Entity
//@Table(name = "notification", schema = "public")
public class Notification {

    @Id
    private Long id;
    @Value("${spring.mail.emailAddress}")
    private String emailAddress;

    private NotificationCondition notificationCondition;

    public Notification() {
    }


    public Notification(String emailAddress, NotificationCondition notificationCondition) {
        this.emailAddress = emailAddress;
       this.notificationCondition = notificationCondition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public NotificationCondition getCondition() {
        return notificationCondition;
    }

    public void setCondition(NotificationCondition notificationCondition) {
        this.notificationCondition = notificationCondition;
    }
}
