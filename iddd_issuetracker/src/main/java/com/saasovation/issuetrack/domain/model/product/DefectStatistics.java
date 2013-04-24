package com.saasovation.issuetrack.domain.model.product;

import com.saasovation.common.ValueObject;

public final class DefectStatistics extends ValueObject {
	private ProductId productId;

	public DefectStatistics(ProductId productId) {
		setProductId(productId);
	}
	
	private void setProductId(ProductId productId) {
		this.productId = productId;
	}

	public ProductId getProductId() {
		return productId;
	}

}
