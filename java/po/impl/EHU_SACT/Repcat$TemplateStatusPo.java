package com.doc.common.po.impl; 
 
public class Repcat$TemplateStatusPo implements IRepcat$TemplateStatusPo {
 
	public enum COLUMNS {
		TEMPLATE_STATUS_ID("Internal primary key for the template status table."), //
		STATUS_TYPE_NAME("User friendly name for the template status.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateStatusId;
	private String statusTypeName;

	@Override
	public BigDecimal getTemplateStatusId() {
		return this.templateStatusId;
	}
 
	@Override
	public void setTemplateStatusId(final BigDecimal templateStatusId) {
		this.templateStatusId = templateStatusId; 
	}
 
	@Override
	public String getStatusTypeName() {
		return this.statusTypeName;
	}
 
	@Override
	public void setStatusTypeName(final String statusTypeName) {
		this.statusTypeName = statusTypeName; 
	}
 
}
