package io.epal.notification;

import io.epal.notification.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

    @Autowired
    private EmailService emailService;

    //Create consumer of events from rabbitmq
    /**
    @Bean
    public Consumer<Message<String>> notificationEventSupplier(){
        return message->{ emailService.sendEmail(message.getPayload());};
    }
  */

}
