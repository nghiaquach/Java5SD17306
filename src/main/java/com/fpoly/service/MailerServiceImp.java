package com.fpoly.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fpoly.model.MailModel;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailerServiceImp implements MailService {
    @Autowired
    JavaMailSender sender;
    List<MailModel> list = new ArrayList<>();

    public void send(MailModel mail) throws Exception {
        // Tạo message
        MimeMessage message = sender.createMimeMessage();
        // Sử dụng Helper để thiết lập các thông tin cần thiết cho message
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
        helper.setFrom(mail.getFrom());
        helper.setTo(mail.getTo());
        helper.setSubject(mail.getSubject());
        helper.setText(mail.getBody(), true);
        List<String> ccList = mail.getCc();

        for (String string : ccList) {
            helper.setCc(string);
        }

        // Gửi message đến SMTP server
        sender.send(message);
    }

    @Scheduled(fixedRate = 1000)
    public void run() {
        while (!list.isEmpty()) {
            MailModel mail = list.remove(0);
            try {
                this.send(mail);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void queue(MailModel mail) {
        list.add(mail);
    }

    @Override
    public void queue(String to, String subject, String body) {
        MailModel mail = new MailModel(to, subject, body);
        this.queue(mail);
    }
}
