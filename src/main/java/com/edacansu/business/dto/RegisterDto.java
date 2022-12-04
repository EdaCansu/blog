package com.edacansu.business.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Date;


//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
//@SneakyThrows
public class RegisterDto {

    private Long id;


    @NotNull(message = "{register.username.validation.constraints.NutNull.message}")
    private String username;

    @NotNull(message = "{register.email.validation.constraints.NutNull.message}")
    @Email
    @Size(max = 200)
    //my special annotation will be created
    private String email;

    @NotNull(message = "{register.passwd.validation.constraints.NutNull.message}")
    @Size(min = 6, max = 20)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).*$", message = "{register.password.validation.constraints.pattern.regex.NutNull.message}")
    private String passwd;

    private Date createdDate;

}
