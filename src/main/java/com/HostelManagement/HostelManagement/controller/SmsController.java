package com.HostelManagement.HostelManagement.controller;

import com.HostelManagement.HostelManagement.entity.SMSSender;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Value("${TWILIO_ACCOUNT_SID}")
    String ACCOUNT_SID;
    @Value("${TWILIO_AUTH_TOKEN}")
    String AUTH_TOKEN;
    @Value("${TWILIO_OUTGOING_SMS_NUMBER}")
    String OUTGOING_SMS_NUMBER;

    @PostConstruct
    private void setup(){
        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
    }

    @PostMapping("/student/sendSms")
    public String sendSms(@RequestBody SMSSender smsSender){
        Message message = Message.creator(
                new PhoneNumber(smsSender.getDestination()),
                new PhoneNumber(OUTGOING_SMS_NUMBER),smsSender.getSms()
        ).create();

        return message.getStatus().toString();
    }

}
