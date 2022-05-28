package io.epal.notification.service;

import io.epal.notification.api.AbstractEmail;
import io.epal.notification.exception.EmailException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GmailServiceImpl implements EmailService{
    @Override
    public void sendEmail(AbstractEmail abstractEmail) throws EmailException {
     log.debug("Called {} "+getClass());
    }
}
