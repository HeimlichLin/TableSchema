package com.doc.common.po.impl; 
 
public class Repcat$ObjectParmsPo implements IRepcat$ObjectParmsPo {
 
	public enum COLUMNS {
		TEMPLATE_PARAMETER_ID("Primary key of template parameter."), //
		TEMPLATE_OBJECT_ID("Primary key of object using the paramter."), //
		TEMPLATE_OBJECT_ID("Primary key of object using the paramter.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateParameterId;
	private BigDecimal templateObjectId;
	private BigDecimal templateObjectId;

	@Override
	public BigDecimal getTemplateParameterId() {
		return this.templateParameterId;
	}
 
	@Override
	public void setTemplateParameterId(final BigDecimal templateParameterId) {
		this.templateParameterId = templateParameterId; 
	}
 
	@Override
	public BigDecimal getTemplateObjectId() {
		return this.templateObjectId;
	}
 
	@Override
	public void setTemplateObjectId(final BigDecimal templateObjectId) {
		this.templateObjectId = templateObjectId; 
	}
 
	@Override
	public BigDecimal getTemplateObjectId() {
		return this.templateObjectId;
	}
 
	@Override
	public void setTemplateObjectId(final BigDecimal templateObjectId) {
		this.templateObjectId = templateObjectId; 
	}
 
}
