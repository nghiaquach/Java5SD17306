package com.fpoly.component;

import org.springframework.stereotype.Component;

import com.fpoly.model.Speech;

@Component
public class ENSpeech implements Speech {

    @Override
    public String sayThankYou() {
      return "Thank you very much";
    }
    
}
