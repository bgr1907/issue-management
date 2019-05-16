package com.bgr.issuemanagement.repository;

import com.bgr.issuemanagement.dto.UserDto;
import com.bgr.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername (String username);
}
