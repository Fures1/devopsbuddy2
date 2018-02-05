package com.devopsbuddy2.config;


import com.devopsbuddy2.backend.service.EmailService;
import com.devopsbuddy2.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/Workspace/dev/.properties/application-dev.properties")
public class DevelopmentConfig {



    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }

}
