package com.doc.common.po.impl; 
 
public class Repcat$AuditColumnPo implements IRepcat$AuditColumnPo {
 
	public enum COLUMNS {
		SNAME("Owner of the shadow table"), //
		ONAME("Name of the shadow table"), //
		COLUMN_NAME("Name of the column in the shadow table"), //
		BASE_SNAME("Owner of replicated table"), //
		BASE_ONAME("Name of the replicated table"), //
		BASE_CONFLICT_TYPE_ID("Type of conflict"), //
		BASE_REFERENCE_NAME("Table name, unique constraint name, or column group name"), //
		ATTRIBUTE("Description of the attribute") //
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
	private String columnName;
	private String baseSname;
	private String baseOname;
	private BigDecimal baseConflictTypeId;
	private String baseReferenceName;
	private String attribute;

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
	public String getColumnName() {
		return this.columnName;
	}
 
	@Override
	public void setColumnName(final String columnName) {
		this.columnName = columnName; 
	}
 
	@Override
	public String getBaseSname() {
		return this.baseSname;
	}
 
	@Override
	public void setBaseSname(final String baseSname) {
		this.baseSname = baseSname; 
	}
 
	@Override
	public String getBaseOname() {
		return this.baseOname;
	}
 
	@Override
	public void setBaseOname(final String baseOname) {
		this.baseOname = baseOname; 
	}
 
	@Override
	public BigDecimal getBaseConflictTypeId() {
		return this.baseConflictTypeId;
	}
 
	@Override
	public void setBaseConflictTypeId(final BigDecimal baseConflictTypeId) {
		this.baseConflictTypeId = baseConflictTypeId; 
	}
 
	@Override
	public String getBaseReferenceName() {
		return this.baseReferenceName;
	}
 
	@Override
	public void setBaseReferenceName(final String baseReferenceName) {
		this.baseReferenceName = baseReferenceName; 
	}
 
	@Override
	public String getAttribute() {
		return this.attribute;
	}
 
	@Override
	public void setAttribute(final String attribute) {
		this.attribute = attribute; 
	}
 
}
