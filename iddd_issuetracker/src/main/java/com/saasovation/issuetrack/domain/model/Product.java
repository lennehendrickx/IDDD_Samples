package com.saasovation.issuetrack.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.saasovation.common.domain.model.Entity;

public class Product extends Entity {
	private static final long serialVersionUID = 1L;

	private List<Issue> issues = new ArrayList<Issue>();
	
	public void registerNewIssue(Issue issue) {
		issues.add(issue);
	}
}
