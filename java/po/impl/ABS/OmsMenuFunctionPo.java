package com.doc.common.po.impl; 
 
public class OmsMenuFunctionPo implements IOmsMenuFunctionPo {
 
	public enum COLUMNS {
		PROGRAM_ID("null"), //
		PARENT_ID("null"), //
		SORT("null"), //
		NAME("null"), //
		PATH_PROGRAM("null"), //
		CREATION_DATE("null"), //
		CREATED_BY("null"), //
		LAST_UPDATE_DATE("null"), //
		LAST_UPDATED_BY("null"), //
		LEGAL_ENTITY("null"), //
		PROGRAM_ALIAS("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private BigDecimal programId;
	private BigDecimal parentId;
	private BigDecimal sort;
	private String name;
	private String pathProgram;
	private java.sql.Timestamp creationDate;
	private String createdBy;
	private java.sql.Timestamp lastUpdateDate;
	private String lastUpdatedBy;
	private String legalEntity;
	private String programAlias;

	@Override
	public BigDecimal getProgramId() {
		return this.programId;
	}
 
	@Override
	public void setProgramId(final BigDecimal programId) {
		this.programId = programId; 
	}
 
	@Override
	public BigDecimal getParentId() {
		return this.parentId;
	}
 
	@Override
	public void setParentId(final BigDecimal parentId) {
		this.parentId = parentId; 
	}
 
	@Override
	public BigDecimal getSort() {
		return this.sort;
	}
 
	@Override
	public void setSort(final BigDecimal sort) {
		this.sort = sort; 
	}
 
	@Override
	public String getName() {
		return this.name;
	}
 
	@Override
	public void setName(final String name) {
		this.name = name; 
	}
 
	@Override
	public String getPathProgram() {
		return this.pathProgram;
	}
 
	@Override
	public void setPathProgram(final String pathProgram) {
		this.pathProgram = pathProgram; 
	}
 
	@Override
	public java.sql.Timestamp getCreationDate() {
		return this.creationDate;
	}
 
	@Override
	public void setCreationDate(final java.sql.Timestamp creationDate) {
		this.creationDate = creationDate; 
	}
 
	@Override
	public String getCreatedBy() {
		return this.createdBy;
	}
 
	@Override
	public void setCreatedBy(final String createdBy) {
		this.createdBy = createdBy; 
	}
 
	@Override
	public java.sql.Timestamp getLastUpdateDate() {
		return this.lastUpdateDate;
	}
 
	@Override
	public void setLastUpdateDate(final java.sql.Timestamp lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate; 
	}
 
	@Override
	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}
 
	@Override
	public void setLastUpdatedBy(final String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy; 
	}
 
	@Override
	public String getLegalEntity() {
		return this.legalEntity;
	}
 
	@Override
	public void setLegalEntity(final String legalEntity) {
		this.legalEntity = legalEntity; 
	}
 
	@Override
	public String getProgramAlias() {
		return this.programAlias;
	}
 
	@Override
	public void setProgramAlias(final String programAlias) {
		this.programAlias = programAlias; 
	}
 
}
