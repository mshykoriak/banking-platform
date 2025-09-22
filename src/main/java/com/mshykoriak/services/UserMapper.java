package com.mshykoriak.services;

import com.mshykoriak.dto.UserInfo;
import com.mshykoriak.entity.User;

public interface UserMapper {

    User toEntity(UserInfo userInfo);
}
