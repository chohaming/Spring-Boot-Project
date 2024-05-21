package com.web.ddajait.model.dto;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    
    private Long userId;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String nickname;

    @NotBlank
    private String password;

    private int age;

    private String gender;

    private Boolean isLogin;

    private String interest;

    private String job;

    @URL
    private String profileImage;

    @Positive
    private int tier = 1;
    
    private String qualifiedCertificate;
    
    private String role;

}