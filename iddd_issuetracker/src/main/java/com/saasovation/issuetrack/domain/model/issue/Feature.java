package com.saasovation.issuetrack.domain.model.issue;


public class Feature extends Issue {

	public Feature(FeatureId id, String description, String summary, Initiator initiator) {
		super(id, description, summary, initiator);
	}
}
