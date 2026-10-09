package com.Lenoah.florist;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String message) {
        System.out.println(message);
    }
}
