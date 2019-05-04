package com.bgr.issuemanagement.service;

import com.bgr.issuemanagement.dto.ProjectDto;
import com.bgr.issuemanagement.entity.Project;
import com.bgr.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(Long id);


    ProjectDto update(Long id, ProjectDto project);
}
