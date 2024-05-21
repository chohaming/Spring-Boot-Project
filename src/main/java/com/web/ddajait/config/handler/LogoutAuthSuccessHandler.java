package com.web.ddajait.config.handler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.web.ddajait.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LogoutAuthSuccessHandler implements LogoutSuccessHandler {

    @Autowired
    @Lazy
    private UserService userService;

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        // UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        // userService.updateIsLoginByEmail(userDetails.getUsername(), false);

        // 로그아웃 -> index로 이동
        response.sendRedirect("/index");

    }

}