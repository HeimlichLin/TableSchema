package com.doc.common.po.impl; 
 
public class Repcat$ObjectTypesPo implements IRepcat$ObjectTypesPo {
 
	public enum COLUMNS {
		OBJECT_TYPE_ID("Internal primary key of the template object types table."), //
		OBJECT_TYPE_NAME("Descriptive name for the object type."), //
		FLAGS("Internal flags for object type processing."), //
		SPARE1("Reserved for future use.") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal objectTypeId;
	private String objectTypeName;
	private String flags;
	private String spare1;

	@Override
	public BigDecimal getObjectTypeId() {
		return this.objectTypeId;
	}
 
	@Override
	public void setObjectTypeId(final BigDecimal objectTypeId) {
		this.objectTypeId = objectTypeId; 
	}
 
	@Override
	public String getObjectTypeName() {
		return this.objectTypeName;
	}
 
	@Override
	public void setObjectTypeName(final String objectTypeName) {
		this.objectTypeName = objectTypeName; 
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
