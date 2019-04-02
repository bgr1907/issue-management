package com.bgr.issuemanagement.dto;

import com.bgr.issuemanagement.entity.IssueStatus;
import com.bgr.issuemanagement.entity.User;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}
