package com.saasovation.issuetrack.domain.model.issue;

import com.saasovation.issuetrack.domain.model.common.Id;

public abstract class Issue {
	private Id<? extends Issue> id;
	private String description;
	private String summary;
	private Initiator initiator;
	
	public Issue(Id<? extends Issue> id, String description, String summary, Initiator initiator) {
		this.initiator = initiator;
		setId(id);
		setDescription(description);
		setSummary(summary);
		setInitiator(initiator);
	}
	
	public Id<? extends Issue> getId() {
		return id;
	}
	public void setId(Id<? extends Issue> id) {
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
	
	
}
