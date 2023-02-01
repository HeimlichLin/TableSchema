package com.doc.common.po.impl; 
 
public class Repcat$UserAuthorizationsPo implements IRepcat$UserAuthorizationsPo {
 
	public enum COLUMNS {
		USER_AUTHORIZATION_ID("Internal primary key of the REPCAT$_USER_AUTHORIZATIONS table."), //
		USER_ID("Database user id."), //
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table."), //
		REFRESH_TEMPLATE_ID("Internal primary key of the REPCAT$_REFRESH_TEMPLATES table.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal userAuthorizationId;
	private BigDecimal userId;
	private BigDecimal refreshTemplateId;
	private BigDecimal refreshTemplateId;

	@Override
	public BigDecimal getUserAuthorizationId() {
		return this.userAuthorizationId;
	}
 
	@Override
	public void setUserAuthorizationId(final BigDecimal userAuthorizationId) {
		this.userAuthorizationId = userAuthorizationId; 
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
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
}
