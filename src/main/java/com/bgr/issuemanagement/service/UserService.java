package com.bgr.issuemanagement.service;

import com.bgr.issuemanagement.entity.Issue;
import com.bgr.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUserName (String username);


}
