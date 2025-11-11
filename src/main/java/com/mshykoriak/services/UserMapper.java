package com.mshykoriak.services;

import com.mshykoriak.model.dto.UserInfo;
import com.mshykoriak.model.User;

public interface UserMapper {

    User toEntity(UserInfo userInfo);
}
