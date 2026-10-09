package com.Lenoah.florist;

public class OrderService {
    private EmailService emailService;

    public OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void checkout() {
        emailService.sendEmail("Thank you for your order!");
    }

}
