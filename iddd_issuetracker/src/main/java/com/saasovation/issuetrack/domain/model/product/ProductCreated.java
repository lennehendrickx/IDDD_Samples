package com.saasovation.issuetrack.domain.model.product;

import java.util.Date;

import com.saasovation.common.domain.model.DomainEvent;

public class ProductCreated implements DomainEvent {

	@Override
	public int eventVersion() {
		return 0;
	}

	@Override
	public Date occurredOn() {
		return null;
	}

}
