package com.doc.common.po; 
 
public interface IOmsMenuFunctionPo {
 
	BigDecimal getProgramId();
 
	void setProgramId(final BigDecimal programId);
 
	BigDecimal getParentId();
 
	void setParentId(final BigDecimal parentId);
 
	BigDecimal getSort();
 
	void setSort(final BigDecimal sort);
 
	String getName();
 
	void setName(final String name);
 
	String getPathProgram();
 
	void setPathProgram(final String pathProgram);
 
	java.sql.Timestamp getCreationDate();
 
	void setCreationDate(final java.sql.Timestamp creationDate);
 
	String getCreatedBy();
 
	void setCreatedBy(final String createdBy);
 
	java.sql.Timestamp getLastUpdateDate();
 
	void setLastUpdateDate(final java.sql.Timestamp lastUpdateDate);
 
	String getLastUpdatedBy();
 
	void setLastUpdatedBy(final String lastUpdatedBy);
 
	String getLegalEntity();
 
	void setLegalEntity(final String legalEntity);
 
	String getProgramAlias();
 
	void setProgramAlias(final String programAlias);
 
}
