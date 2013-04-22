package com.saasovation.issuetrack.domain.model;

import java.util.Date;

import com.saasovation.common.domain.model.DomainEvent;

public class ProductCreatedEvent implements DomainEvent {

	@Override
	public int eventVersion() {
		return 0;
	}

	@Override
	public Date occurredOn() {
		return null;
	}

}
