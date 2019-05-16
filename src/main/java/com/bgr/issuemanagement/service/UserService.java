package com.bgr.issuemanagement.service;

import com.bgr.issuemanagement.dto.UserDto;
import com.bgr.issuemanagement.entity.Issue;
import com.bgr.issuemanagement.entity.User;
import com.bgr.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUserName (String username);


}
