package com.saasovation.issuetrack.domain.model.product;

import java.util.HashSet;
import java.util.Set;

import com.saasovation.common.domain.model.Entity;
import com.saasovation.issuetrack.domain.model.issue.Initiator;
import com.saasovation.issuetrack.domain.model.issue.Issue;
import com.saasovation.issuetrack.domain.model.issue.IssueId;
import com.saasovation.issuetrack.domain.model.issueassigner.IssueAssigner;
import com.saasovation.issuetrack.domain.model.productmanager.ProductManager;
import com.saasovation.issuetrack.domain.model.tenant.TenantId;

public class Product extends Entity {
	private static final long serialVersionUID = 1L;

	private TenantId tenantId;
	private ProductId productId;
	private String name;
	private String description;
	private ProductManager productManager;
	private IssueAssigner issueAssigner;
	private Set<Issue> issues;

	public Product(TenantId tenantId, ProductId productId, String name,
			String description, ProductManager productManager, 
			IssueAssigner issueAssigner) {
		setTenantId(tenantId);
		setProductId(productId);
		setName(name);
		setDescription(description);
		setProductManager(productManager);
		setIssueAssigner(issueAssigner);
		issues = new HashSet<Issue>();
	}
	
	public Issue reportDefect(Initiator initiator, String description, String summary) {
		Issue issue = new Issue(new IssueId(), Issue.Type.DEFECT, description, summary, initiator);
		addIssue(issue);
		return issue;
	}
	
	public Issue requestFeature(Initiator initiator, String description, String summary) {
		Issue issue = new Issue(new IssueId(), Issue.Type.FEATURE, description, summary, initiator);
		addIssue(issue);
		return issue;
	}

	public TenantId getTenantId() {
		return tenantId;
	}

	public ProductId getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public ProductManager getProductManager() {
		return productManager;
	}

	public IssueAssigner getIssueAssigner() {
		return issueAssigner;
	}

	private void setDescription(String aDescription) {
		this.assertArgumentNotEmpty(aDescription, "The description must be provided.");
		this.assertArgumentLength(aDescription, 500, "Description must be 500 characters or less.");
		this.description = aDescription;
	}

	private void setName(String aName) {
		this.assertArgumentNotEmpty(aName, "The name must be provided.");
		this.assertArgumentLength(aName, 100, "The name must be 100 characters or less.");

		this.name = aName;
	}

	private void setProductId(ProductId aProductId) {
		this.assertArgumentNotNull(aProductId, "The productId must be provided.");

		this.productId = aProductId;
	}

	private void setTenantId(TenantId aTenantId) {
		this.assertArgumentNotNull(aTenantId, "The tenantId must be provided.");

		this.tenantId = aTenantId;
	}
	
	public void setProductManager(ProductManager productManager) {
		this.assertArgumentNotNull(productManager, "The productManager must be provided.");
		
		this.productManager = productManager;
	}
	
	public void setIssueAssigner(IssueAssigner issueAssigner) {
		this.assertArgumentNotNull(issueAssigner, "The issueAssigner must be provided.");
		
		this.issueAssigner = issueAssigner;
	}

	private void addIssue(Issue issue) {
		issues.add(issue);
	}

}
