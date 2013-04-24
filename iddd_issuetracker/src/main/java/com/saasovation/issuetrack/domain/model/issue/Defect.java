package com.saasovation.issuetrack.domain.model.issue;


public class Defect extends Issue {

	public Defect(DefectId id, String description, String summary, Initiator initiator) {
		super(id, description, summary, initiator);
	}
}
