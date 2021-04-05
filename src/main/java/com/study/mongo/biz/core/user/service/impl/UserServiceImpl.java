package com.study.mongo.biz.core.user.service.impl;

import com.study.mongo.biz.comm.exception.BaseException;
import com.study.mongo.biz.comm.message.MulLangMessage;
import com.study.mongo.biz.core.user.dto.UserDto;
import com.study.mongo.biz.core.user.entity.User;
import com.study.mongo.biz.core.user.repo.UserRepository;
import com.study.mongo.biz.core.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final MulLangMessage lang;

    @Override
    public User insertUser(UserDto.Signin userDto) {
        return userRepository.insertUser(userDto);
    }

    @Override
    public User getUserByUid(String email) {

        User user = userRepository.getUserByUid(email);

        if(user == null){
            throw new BaseException(lang.getMessage("user.notFound.msg"));
        }

        return user;
    }

    @Override
    public User getUserByUserNo(String userNo) {
        return userRepository.getUserByUserNo(Long.valueOf(userNo)).orElseThrow(() -> new BaseException(lang.getMessage("user.notFound.msg")));
    }

    @Override
    public Page<UserDto.Res> selectUsers(Pageable pageable) {
        return userRepository.selectUsers(pageable);
    }

    @Override
    public UserDetails loadUserByUsername(String userNo) {
        return userRepository.getUserByUserNo(Long.valueOf(userNo)).orElseThrow(() -> new BaseException(lang.getMessage("user.notFound.msg")));
    }
}
