package com.saasovation.issuetrack.domain.model.product;

import java.util.List;

import com.saasovation.issuetrack.domain.model.tenant.TenantId;

public class ProductStatisticsService {
	
	public DefectStatistics determineMostDefectiveProduct(TenantId tenantId) {
		return allProductsOf(tenantId).iterator().next(); 
	}

	private List<DefectStatistics> allProductsOf(TenantId tenantId) {
		return null;
	}
	

}
