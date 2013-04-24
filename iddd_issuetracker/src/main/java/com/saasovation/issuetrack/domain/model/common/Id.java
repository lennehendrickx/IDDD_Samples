package com.saasovation.issuetrack.domain.model.common;

import java.util.UUID;

import com.saasovation.common.ValueObject;

public class Id<T> extends ValueObject {
	private String id;

	public Id() {
		this(UUID.randomUUID().toString());
    }	
	
    public Id(String anId) {
        this.setId(anId);
    }

	public Id(Id<T> aId) {
        this(aId.id());
    }

    public String id() {
        return this.id;
    }

    @SuppressWarnings("unchecked")
	@Override
    public boolean equals(Object anObject) {
        boolean equalObjects = false;

        if (anObject != null && this.getClass() == anObject.getClass()) {
            Id<T> typedObject = (Id<T>) anObject;
            equalObjects = this.id().equals(typedObject.id());
        }

        return equalObjects;
    }

    @Override
    public int hashCode() {
        int hashCodeValue =
            + (2785 * 5)
            + this.id().hashCode();

        return hashCodeValue;
    }

    @Override
    public String toString() {
        return "[id=" + id + "]";
    }

    private void setId(String anId) {
        this.assertArgumentNotEmpty(anId, "The identity is required.");
        this.assertArgumentLength(anId, 36, "The identity must be 36 characters or less.");

        this.id = anId;
    }
}
