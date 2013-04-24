package com.saasovation.issuetrack.domain.model.issue;

public class Initiator {
	private String email;
	private InitiatorId initiatorId;

	public Initiator(InitiatorId initiatorId, String email) {
		setInitiatorId(initiatorId);
		setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InitiatorId getInitiatorId() {
		return initiatorId;
	}

	public void setInitiatorId(InitiatorId initiatorId) {
		this.initiatorId = initiatorId;
	}
	
	
}
