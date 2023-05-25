package com.fpoly.component;
import org.springframework.stereotype.Component;

import com.fpoly.model.Speech;

@Component
public class VNSpeech implements Speech {

    @Override
    public String sayThankYou() {
      return "Cảm ơn bạn rất nhiều";
    }
    
}
