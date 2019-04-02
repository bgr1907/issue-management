package com.bgr.issuemanagement.service;

import com.bgr.issuemanagement.entity.Project;
import com.bgr.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project>  getByProjectCode (String projectCode);

    List<Project> getByProjectCodeContains (String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete (Project project);



}
