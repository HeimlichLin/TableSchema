package com.doc.common.po.impl; 
 
public class Repcat$PriorityGroupPo implements IRepcat$PriorityGroupPo {
 
	public enum COLUMNS {
		SNAME("Name of the replicated object group"), //
		SNAME("Name of the replicated object group"), //
		PRIORITY_GROUP("Name of the priority group"), //
		PRIORITY_GROUP("Name of the priority group"), //
		DATA_TYPE_ID("Datatype of the value in the priority group"), //
		FIXED_DATA_LENGTH("Length of the value in bytes if the datatype is CHAR"), //
		PRIORITY_COMMENT("Description of the priority group") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String sname;
	private String sname;
	private String priorityGroup;
	private String priorityGroup;
	private BigDecimal dataTypeId;
	private BigDecimal fixedDataLength;
	private String priorityComment;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getPriorityGroup() {
		return this.priorityGroup;
	}
 
	@Override
	public void setPriorityGroup(final String priorityGroup) {
		this.priorityGroup = priorityGroup; 
	}
 
	@Override
	public String getPriorityGroup() {
		return this.priorityGroup;
	}
 
	@Override
	public void setPriorityGroup(final String priorityGroup) {
		this.priorityGroup = priorityGroup; 
	}
 
	@Override
	public BigDecimal getDataTypeId() {
		return this.dataTypeId;
	}
 
	@Override
	public void setDataTypeId(final BigDecimal dataTypeId) {
		this.dataTypeId = dataTypeId; 
	}
 
	@Override
	public BigDecimal getFixedDataLength() {
		return this.fixedDataLength;
	}
 
	@Override
	public void setFixedDataLength(final BigDecimal fixedDataLength) {
		this.fixedDataLength = fixedDataLength; 
	}
 
	@Override
	public String getPriorityComment() {
		return this.priorityComment;
	}
 
	@Override
	public void setPriorityComment(final String priorityComment) {
		this.priorityComment = priorityComment; 
	}
 
}
