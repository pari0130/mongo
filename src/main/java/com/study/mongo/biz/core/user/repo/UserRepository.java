package com.study.mongo.biz.core.user.repo;

import com.study.mongo.biz.core.user.dto.UserDto;
import com.study.mongo.biz.core.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserRepository {

    /**
     * @Purpose : 사용자 회원 가입
     * @Method Name : insertUser
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param userDto : 가입정보 dto
     * @Return : User
     * @Description
     */
    User insertUser(UserDto.Signin userDto);

    /**
     * @Purpose : 사용자 이메일 정보로 상세 조회
     * @Method Name : getUserByUid
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param email : 사용자 이메일 정보
     * @Return : String
     * @Description
     */
    User getUserByUid(String email);

    /**
     * @Purpose : 스프링 시큐리티 user name 조회
     * @Method Name : getUserByUserNo
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @param userNo : 조회 하는 사용자 번호
     * @Return : UserDetails
     * @Description
     */
    Optional<User> getUserByUserNo(Long userNo);

    /**
     * @Purpose : 저장된 모든 사용자 정보 조회
     * @Method Name : selectUsers
     * @Author : 조동휘
     * @Date : 2021-04-03
     * @Return : Page<UserDto.Res>
     * @Description
     */
    Page<UserDto.Res> selectUsers(Pageable pageable);
}
