package com.bgr.issuemanagement.repository;

import com.bgr.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    Project getByProjectCode (String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Project getByProjectCodeAndIdNot(String projectCode, Long id);

    Page<Project> findAll (Pageable pageable);

    List<Project> findAll (Sort sort);



}
