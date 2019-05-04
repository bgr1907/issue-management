package com.bgr.issuemanagement.dto;

import com.bgr.issuemanagement.entity.IssueStatus;
import com.bgr.issuemanagement.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Issue Data Transfer Object")
public class IssueDto {
    @ApiModelProperty(required = true, value = "Name of Issue")
    private Long id;
    @ApiModelProperty(value = "Description of Issue")
    private String description;
    @ApiModelProperty(value = "Details of Issue")
    private String details;
    @ApiModelProperty(value = "Date of Issue")
    private Date date;
    @ApiModelProperty(value = "Issue Status of Issue")
    private IssueStatus issueStatus;
    @ApiModelProperty(value = "Assignee of Issue")
    private UserDto assignee;
    @ApiModelProperty(value = "Project of Issue")
    private ProjectDto project;
}
