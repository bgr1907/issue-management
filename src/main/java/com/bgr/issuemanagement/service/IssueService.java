package com.bgr.issuemanagement.service;

import com.bgr.issuemanagement.dto.IssueDto;
import com.bgr.issuemanagement.entity.Issue;
import com.bgr.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById (Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete (IssueDto issue);


}
