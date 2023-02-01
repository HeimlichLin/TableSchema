package com.doc.common.po.impl; 
 
public class Repcat$UserParmValuesPo implements IRepcat$UserParmValuesPo {
 
	public enum COLUMNS {
		USER_PARAMETER_ID("Internal primary key of the REPCAT$_USER_PARM_VALUES table."), //
		TEMPLATE_PARAMETER_ID("Internal primary key of the REPCAT$_TEMPLATE_PARMS table."), //
		USER_ID("Database user id."), //
		PARM_VALUE("Value of the parameter for this user.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal userParameterId;
	private BigDecimal templateParameterId;
	private BigDecimal userId;
	private String parmValue;

	@Override
	public BigDecimal getUserParameterId() {
		return this.userParameterId;
	}
 
	@Override
	public void setUserParameterId(final BigDecimal userParameterId) {
		this.userParameterId = userParameterId; 
	}
 
	@Override
	public BigDecimal getTemplateParameterId() {
		return this.templateParameterId;
	}
 
	@Override
	public void setTemplateParameterId(final BigDecimal templateParameterId) {
		this.templateParameterId = templateParameterId; 
	}
 
	@Override
	public BigDecimal getUserId() {
		return this.userId;
	}
 
	@Override
	public void setUserId(final BigDecimal userId) {
		this.userId = userId; 
	}
 
	@Override
	public String getParmValue() {
		return this.parmValue;
	}
 
	@Override
	public void setParmValue(final String parmValue) {
		this.parmValue = parmValue; 
	}
 
}
