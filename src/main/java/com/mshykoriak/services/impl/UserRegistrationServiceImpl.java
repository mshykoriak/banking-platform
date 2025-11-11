package com.mshykoriak.services.impl;

import com.mshykoriak.model.dto.UserInfo;
import com.mshykoriak.model.User;
import com.mshykoriak.repository.UserRepository;
import com.mshykoriak.services.UserMapper;
import com.mshykoriak.services.UserRegistrationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public User createUser(UserInfo userInfo) {
        return userRepository.save(userMapper.toEntity(userInfo));
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
