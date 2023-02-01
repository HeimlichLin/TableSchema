package com.doc.common.po.impl; 
 
public class Repcat$InstantiationDdlPo implements IRepcat$InstantiationDdlPo {
 
	public enum COLUMNS {
		REFRESH_TEMPLATE_ID("Primary key of template containing supplementary DDL."), //
		DDL_TEXT("Supplementary DDL string."), //
		DDL_NUM("Column for ordering of supplementary DDL."), //
		PHASE("Phase to execute the DDL string.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal refreshTemplateId;
	private String ddlText;
	private BigDecimal ddlNum;
	private BigDecimal phase;

	@Override
	public BigDecimal getRefreshTemplateId() {
		return this.refreshTemplateId;
	}
 
	@Override
	public void setRefreshTemplateId(final BigDecimal refreshTemplateId) {
		this.refreshTemplateId = refreshTemplateId; 
	}
 
	@Override
	public String getDdlText() {
		return this.ddlText;
	}
 
	@Override
	public void setDdlText(final String ddlText) {
		this.ddlText = ddlText; 
	}
 
	@Override
	public BigDecimal getDdlNum() {
		return this.ddlNum;
	}
 
	@Override
	public void setDdlNum(final BigDecimal ddlNum) {
		this.ddlNum = ddlNum; 
	}
 
	@Override
	public BigDecimal getPhase() {
		return this.phase;
	}
 
	@Override
	public void setPhase(final BigDecimal phase) {
		this.phase = phase; 
	}
 
}
