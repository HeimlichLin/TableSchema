package com.doc.common.po; 
 
public interface IToadPlanTablePo {
 
	String getStatementId();
 
	void setStatementId(final String statementId);
 
	BigDecimal getPlanId();
 
	void setPlanId(final BigDecimal planId);
 
	java.sql.Timestamp getTimestamp();
 
	void setTimestamp(final java.sql.Timestamp timestamp);
 
	String getRemarks();
 
	void setRemarks(final String remarks);
 
	String getOperation();
 
	void setOperation(final String operation);
 
	String getOptions();
 
	void setOptions(final String options);
 
	String getObjectNode();
 
	void setObjectNode(final String objectNode);
 
	String getObjectOwner();
 
	void setObjectOwner(final String objectOwner);
 
	String getObjectName();
 
	void setObjectName(final String objectName);
 
	String getObjectAlias();
 
	void setObjectAlias(final String objectAlias);
 
	BigDecimal getObjectInstance();
 
	void setObjectInstance(final BigDecimal objectInstance);
 
	String getObjectType();
 
	void setObjectType(final String objectType);
 
	String getOptimizer();
 
	void setOptimizer(final String optimizer);
 
	BigDecimal getSearchColumns();
 
	void setSearchColumns(final BigDecimal searchColumns);
 
	BigDecimal getId();
 
	void setId(final BigDecimal id);
 
	BigDecimal getParentId();
 
	void setParentId(final BigDecimal parentId);
 
	BigDecimal getDepth();
 
	void setDepth(final BigDecimal depth);
 
	BigDecimal getPosition();
 
	void setPosition(final BigDecimal position);
 
	BigDecimal getCost();
 
	void setCost(final BigDecimal cost);
 
	BigDecimal getCardinality();
 
	void setCardinality(final BigDecimal cardinality);
 
	BigDecimal getBytes();
 
	void setBytes(final BigDecimal bytes);
 
	String getOtherTag();
 
	void setOtherTag(final String otherTag);
 
	String getPartitionStart();
 
	void setPartitionStart(final String partitionStart);
 
	String getPartitionStop();
 
	void setPartitionStop(final String partitionStop);
 
	BigDecimal getPartitionId();
 
	void setPartitionId(final BigDecimal partitionId);
 
	String getOther();
 
	void setOther(final String other);
 
	String getDistribution();
 
	void setDistribution(final String distribution);
 
	BigDecimal getCpuCost();
 
	void setCpuCost(final BigDecimal cpuCost);
 
	BigDecimal getIoCost();
 
	void setIoCost(final BigDecimal ioCost);
 
	BigDecimal getTempSpace();
 
	void setTempSpace(final BigDecimal tempSpace);
 
	String getAccessPredicates();
 
	void setAccessPredicates(final String accessPredicates);
 
	String getFilterPredicates();
 
	void setFilterPredicates(final String filterPredicates);
 
	String getProjection();
 
	void setProjection(final String projection);
 
	BigDecimal getTime();
 
	void setTime(final BigDecimal time);
 
	String getQblockName();
 
	void setQblockName(final String qblockName);
 
	String getOtherXml();
 
	void setOtherXml(final String otherXml);
 
}
