package com.saasovation.issuetrack.domain.model.productmanager;

import com.saasovation.common.ValueObject;

public class ProductManager extends ValueObject {
	
	private ProductManagerId productManagerId;

	public ProductManager(ProductManagerId productManagerId) {
		setProductManagerId(productManagerId);
	}

	public ProductManagerId getProductManagerId() {
		return productManagerId;
	}

	private void setProductManagerId(ProductManagerId productManagerId) {
		this.productManagerId = productManagerId;
	}
	
	

}
