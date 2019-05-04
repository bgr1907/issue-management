package com.bgr.issuemanagement.repository;

import com.bgr.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {

    List<IssueHistory> getByIssueIdOrderById(Long id);

}
