package com.notes.notes;

import com.notes.notes.controllers.AuthenticationController;
import com.notes.notes.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthenticationFilter implements HandlerInterceptor {

    @Autowired
    UserRepo userRepo;

    @Autowired
    AuthenticationController authenticationController;

}
