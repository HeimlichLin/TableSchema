package com.doc.common.po.impl; 
 
public class Repcat$TemplateTypesPo implements IRepcat$TemplateTypesPo {
 
	public enum COLUMNS {
		TEMPLATE_TYPE_ID("Internal primary key of the template types table."), //
		TEMPLATE_DESCRIPTION("Description of the template type."), //
		FLAGS("Bitmap flags controlling each type of template."), //
		SPARE1("Reserved for future expansion.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateTypeId;
	private String templateDescription;
	private String flags;
	private String spare1;

	@Override
	public BigDecimal getTemplateTypeId() {
		return this.templateTypeId;
	}
 
	@Override
	public void setTemplateTypeId(final BigDecimal templateTypeId) {
		this.templateTypeId = templateTypeId; 
	}
 
	@Override
	public String getTemplateDescription() {
		return this.templateDescription;
	}
 
	@Override
	public void setTemplateDescription(final String templateDescription) {
		this.templateDescription = templateDescription; 
	}
 
	@Override
	public String getFlags() {
		return this.flags;
	}
 
	@Override
	public void setFlags(final String flags) {
		this.flags = flags; 
	}
 
	@Override
	public String getSpare1() {
		return this.spare1;
	}
 
	@Override
	public void setSpare1(final String spare1) {
		this.spare1 = spare1; 
	}
 
}
