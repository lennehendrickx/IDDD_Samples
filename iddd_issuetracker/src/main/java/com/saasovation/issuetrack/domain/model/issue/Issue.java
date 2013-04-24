package com.saasovation.issuetrack.domain.model.issue;

public class Issue {

	public enum Type {
		DEFECT, FEATURE
	}

	private IssueId id;
	private String description;
	private String summary;
	private Initiator initiator;
	private Type issueType;

	public Issue(IssueId id, Type issueType, String description,
			String summary, Initiator initiator) {
		setId(id);
		this.issueType = issueType;
		this.initiator = initiator;
		setDescription(description);
		setSummary(summary);
		setInitiator(initiator);
	}

	public IssueId getId() {
		return id;
	}

	public void setId(IssueId id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Initiator getInitiator() {
		return initiator;
	}

	public void setInitiator(Initiator initiator) {
		this.initiator = initiator;
	}

	public Type getIssueType() {
		return issueType;
	}

}
