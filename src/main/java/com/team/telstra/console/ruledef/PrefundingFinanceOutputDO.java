package com.team.telstra.console.ruledef;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PrefundingFinanceOutputDO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Finance output json")
	private java.lang.String financeOutputJson;

	public PrefundingFinanceOutputDO() {
	}

	public java.lang.String getFinanceOutputJson() {
		return this.financeOutputJson;
	}

	public void setFinanceOutputJson(java.lang.String financeOutputJson) {
		this.financeOutputJson = financeOutputJson;
	}

	public PrefundingFinanceOutputDO(java.lang.String financeOutputJson) {
		this.financeOutputJson = financeOutputJson;
	}

}