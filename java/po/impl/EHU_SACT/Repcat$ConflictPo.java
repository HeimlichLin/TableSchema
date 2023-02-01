package com.doc.common.po.impl; 
 
public class Repcat$ConflictPo implements IRepcat$ConflictPo {
 
	public enum COLUMNS {
		SNAME("Owner of replicated object"), //
		ONAME("Name of the replicated object"), //
		CONFLICT_TYPE_ID("Type of conflict"), //
		REFERENCE_NAME("Table name, unique constraint name, or column group name") //
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
 
}
