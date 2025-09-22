package com.mshykoriak.controller;

import com.mshykoriak.dto.UserInfo;
import com.mshykoriak.entity.AccountStatus;
import com.mshykoriak.entity.CheckingAccount;
import com.mshykoriak.services.UserRegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private static final String REGISTER_USER_PAGE = "register-user";
    private static final String REGISTER_USER_SUCCESS = "register-success";
    private UserRegistrationService userRegistrationService;

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") UserInfo user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return REGISTER_USER_PAGE;
        }
        userRegistrationService.createUser(user);
        return REGISTER_USER_SUCCESS;
    }

    @Autowired
    public void setUserRegistrationService(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }
}
