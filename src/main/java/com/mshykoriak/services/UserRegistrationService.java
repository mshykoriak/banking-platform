package com.mshykoriak.services;

import com.mshykoriak.model.dto.UserInfo;
import com.mshykoriak.model.User;

public interface UserRegistrationService {

    User createUser(UserInfo userInfo);
}
