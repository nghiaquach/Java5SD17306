package com.fpoly.service;

import com.fpoly.model.MailModel;

public interface MailService {
    void queue(MailModel mail);
    void queue(String to, String subject, String body);
}
