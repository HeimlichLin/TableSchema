package com.doc.common.po.impl; 
 
public class Repcat$ParameterColumnPo implements IRepcat$ParameterColumnPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		CONFLICT_TYPE_ID("Type of conflict"), //
		REFERENCE_NAME("Table name, unique constraint name, or column group name"), //
		SEQUENCE_NO("Ordering on resolution"), //
		PARAMETER_TABLE_NAME("Name of the table to which the parameter column belongs"), //
		PARAMETER_COLUMN_NAME("Name of the parameter column used for resolving the conflict"), //
		PARAMETER_SEQUENCE_NO("Ordering on parameter column"), //
		COLUMN_POS("Column position of an attribute or a column"), //
		ATTRIBUTE_SEQUENCE_NO("Sequence number for an attribute of an ADT/pkREF column or a scalar column") //
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
	private String oname;
	private BigDecimal conflictTypeId;
	private String referenceName;
	private BigDecimal sequenceNo;
	private String parameterTableName;
	private String parameterColumnName;
	private BigDecimal parameterSequenceNo;
	private BigDecimal columnPos;
	private BigDecimal attributeSequenceNo;

	@Override
	public String getSname() {
		return this.sname;
	}
 
	@Override
	public void setSname(final String sname) {
		this.sname = sname; 
	}
 
	@Override
	public String getOname() {
		return this.oname;
	}
 
	@Override
	public void setOname(final String oname) {
		this.oname = oname; 
	}
 
	@Override
	public BigDecimal getConflictTypeId() {
		return this.conflictTypeId;
	}
 
	@Override
	public void setConflictTypeId(final BigDecimal conflictTypeId) {
		this.conflictTypeId = conflictTypeId; 
	}
 
	@Override
	public String getReferenceName() {
		return this.referenceName;
	}
 
	@Override
	public void setReferenceName(final String referenceName) {
		this.referenceName = referenceName; 
	}
 
	@Override
	public BigDecimal getSequenceNo() {
		return this.sequenceNo;
	}
 
	@Override
	public void setSequenceNo(final BigDecimal sequenceNo) {
		this.sequenceNo = sequenceNo; 
	}
 
	@Override
	public String getParameterTableName() {
		return this.parameterTableName;
	}
 
	@Override
	public void setParameterTableName(final String parameterTableName) {
		this.parameterTableName = parameterTableName; 
	}
 
	@Override
	public String getParameterColumnName() {
		return this.parameterColumnName;
	}
 
	@Override
	public void setParameterColumnName(final String parameterColumnName) {
		this.parameterColumnName = parameterColumnName; 
	}
 
	@Override
	public BigDecimal getParameterSequenceNo() {
		return this.parameterSequenceNo;
	}
 
	@Override
	public void setParameterSequenceNo(final BigDecimal parameterSequenceNo) {
		this.parameterSequenceNo = parameterSequenceNo; 
	}
 
	@Override
	public BigDecimal getColumnPos() {
		return this.columnPos;
	}
 
	@Override
	public void setColumnPos(final BigDecimal columnPos) {
		this.columnPos = columnPos; 
	}
 
	@Override
	public BigDecimal getAttributeSequenceNo() {
		return this.attributeSequenceNo;
	}
 
	@Override
	public void setAttributeSequenceNo(final BigDecimal attributeSequenceNo) {
		this.attributeSequenceNo = attributeSequenceNo; 
	}
 
}
