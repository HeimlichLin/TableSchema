package com.doc.common.po.impl; 
 
public class Repcat$PriorityPo implements IRepcat$PriorityPo {
 
	public enum COLUMNS {
		SNAME("Name of the replicated object group"), //
		SNAME("Name of the replicated object group"), //
		PRIORITY_GROUP("Name of the priority group"), //
		PRIORITY_GROUP("Name of the priority group"), //
		PRIORITY("Priority of the value"), //
		RAW_VALUE("Raw value"), //
		CHAR_VALUE("Blank-padded character string"), //
		NUMBER_VALUE("Numeric value"), //
		DATE_VALUE("Date value"), //
		VARCHAR2_VALUE("Character string"), //
		NCHAR_VALUE("NCHAR string"), //
		NVARCHAR2_VALUE("NVARCHAR2 string"), //
		LARGE_CHAR_VALUE("Blank-padded character string over 255 characters") //
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
	private BigDecimal priority;
	private String rawValue;
	private String charValue;
	private BigDecimal numberValue;
	private java.sql.Timestamp dateValue;
	private String varchar2Value;
	private String ncharValue;
	private String nvarchar2Value;
	private String largeCharValue;

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
	public BigDecimal getPriority() {
		return this.priority;
	}
 
	@Override
	public void setPriority(final BigDecimal priority) {
		this.priority = priority; 
	}
 
	@Override
	public String getRawValue() {
		return this.rawValue;
	}
 
	@Override
	public void setRawValue(final String rawValue) {
		this.rawValue = rawValue; 
	}
 
	@Override
	public String getCharValue() {
		return this.charValue;
	}
 
	@Override
	public void setCharValue(final String charValue) {
		this.charValue = charValue; 
	}
 
	@Override
	public BigDecimal getNumberValue() {
		return this.numberValue;
	}
 
	@Override
	public void setNumberValue(final BigDecimal numberValue) {
		this.numberValue = numberValue; 
	}
 
	@Override
	public java.sql.Timestamp getDateValue() {
		return this.dateValue;
	}
 
	@Override
	public void setDateValue(final java.sql.Timestamp dateValue) {
		this.dateValue = dateValue; 
	}
 
	@Override
	public String getVarchar2Value() {
		return this.varchar2Value;
	}
 
	@Override
	public void setVarchar2Value(final String varchar2Value) {
		this.varchar2Value = varchar2Value; 
	}
 
	@Override
	public String getNcharValue() {
		return this.ncharValue;
	}
 
	@Override
	public void setNcharValue(final String ncharValue) {
		this.ncharValue = ncharValue; 
	}
 
	@Override
	public String getNvarchar2Value() {
		return this.nvarchar2Value;
	}
 
	@Override
	public void setNvarchar2Value(final String nvarchar2Value) {
		this.nvarchar2Value = nvarchar2Value; 
	}
 
	@Override
	public String getLargeCharValue() {
		return this.largeCharValue;
	}
 
	@Override
	public void setLargeCharValue(final String largeCharValue) {
		this.largeCharValue = largeCharValue; 
	}
 
}
