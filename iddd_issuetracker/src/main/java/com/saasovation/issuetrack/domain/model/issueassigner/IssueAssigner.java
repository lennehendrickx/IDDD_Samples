package com.saasovation.issuetrack.domain.model.issueassigner;

import com.saasovation.common.ValueObject;

public class IssueAssigner extends ValueObject {

	private IssueAssignerId issueAssignerId;

	public IssueAssigner(IssueAssignerId issueAssignerId) {
		setIssueAssignerId(issueAssignerId);
	}

	public IssueAssignerId getIssueAssignerId() {
		return issueAssignerId;
	}

	private void setIssueAssignerId(IssueAssignerId issueAssignerId) {
		this.issueAssignerId = issueAssignerId;
	}
}
