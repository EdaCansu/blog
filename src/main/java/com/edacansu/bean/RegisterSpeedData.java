package com.edacansu.bean;

import com.edacansu.business.dto.RegisterDto;
import com.edacansu.business.services.IRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@RequiredArgsConstructor

@Configuration
public class RegisterSpeedData {
    private final PasswordEncoderBean passwordEncoderBean;

    @Bean
    CommandLineRunner createRegister(IRegisterService iRegisterService){
        return (args) -> {
            for (int i = 0; i < 5; i++) {
                RegisterDto registerDto = RegisterDto.builder()
                        .email(UUID.randomUUID().toString().concat("@gmail.com"))
                        .passwd(passwordEncoderBean.passwordEncoderMethod().encode("root"))
                        .username("Eda " + i)
                        .build();
                //iRegisterService.createRegister(registerDto);
            }
        };
    }
}
