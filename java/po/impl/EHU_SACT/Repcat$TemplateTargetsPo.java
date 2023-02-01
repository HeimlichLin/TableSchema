package com.doc.common.po.impl; 
 
public class Repcat$TemplateTargetsPo implements IRepcat$TemplateTargetsPo {
 
	public enum COLUMNS {
		TEMPLATE_TARGET_ID("Internal primary key of the template targets table."), //
		TARGET_DATABASE("Global identifier of the target database."), //
		TARGET_COMMENT("Comment on the target database."), //
		CONNECT_STRING("The connection descriptor used to connect to the target database."), //
		SPARE1("The spare column") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal templateTargetId;
	private String targetDatabase;
	private String targetComment;
	private String connectString;
	private String spare1;

	@Override
	public BigDecimal getTemplateTargetId() {
		return this.templateTargetId;
	}
 
	@Override
	public void setTemplateTargetId(final BigDecimal templateTargetId) {
		this.templateTargetId = templateTargetId; 
	}
 
	@Override
	public String getTargetDatabase() {
		return this.targetDatabase;
	}
 
	@Override
	public void setTargetDatabase(final String targetDatabase) {
		this.targetDatabase = targetDatabase; 
	}
 
	@Override
	public String getTargetComment() {
		return this.targetComment;
	}
 
	@Override
	public void setTargetComment(final String targetComment) {
		this.targetComment = targetComment; 
	}
 
	@Override
	public String getConnectString() {
		return this.connectString;
	}
 
	@Override
	public void setConnectString(final String connectString) {
		this.connectString = connectString; 
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
