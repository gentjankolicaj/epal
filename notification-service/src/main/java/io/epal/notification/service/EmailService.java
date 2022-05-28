package io.epal.notification.service;


import io.epal.notification.api.AbstractEmail;
import io.epal.notification.exception.EmailException;

public interface EmailService {

    public void sendEmail(AbstractEmail abstractEmail) throws EmailException;

}
