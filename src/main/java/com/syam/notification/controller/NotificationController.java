package com.syam.notification.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    @PostMapping
    public String sendNotification(@RequestBody String userName) {
        System.out.println("Email sent to " + userName);
        return "Notification sent!";
    }
}
