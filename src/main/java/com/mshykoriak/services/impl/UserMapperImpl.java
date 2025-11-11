package com.mshykoriak.services.impl;

import com.mshykoriak.model.dto.UserInfo;
import com.mshykoriak.model.User;
import com.mshykoriak.services.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserInfo userInfo) {
        User entity = new User();
        entity.setName(userInfo.getName());
        entity.setSurname(userInfo.getSurname());
        entity.setEmail(userInfo.getEmail());
        entity.setAccounts(null);

        return entity;
    }
}
