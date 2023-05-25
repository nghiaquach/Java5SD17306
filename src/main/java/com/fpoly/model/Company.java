package com.fpoly.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Company {
    String name = "FPT Polytechnic";
    String logo = "https://www.fpt.edu.vn/wp-content/uploads/2019/07/logo-fpt-polytechnic.png";

    @Bean
    public String getName() {
        return name;
    }

    @Bean @Primary
    public String getName2() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    
}
