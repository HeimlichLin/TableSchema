package com.doc.common.bean; 
 
public class QuestSlTempExplain1Do { 
 
	public enum COLUMNS { 
		STATEMENT_ID("null"), 
		PLAN_ID("null"), 
		TIMESTAMP("null"), 
		REMARKS("null"), 
		OPERATION("null"), 
		OPTIONS("null"), 
		OBJECT_NODE("null"), 
		OBJECT_OWNER("null"), 
		OBJECT_NAME("null"), 
		OBJECT_ALIAS("null"), 
		OBJECT_INSTANCE("null"), 
		OBJECT_TYPE("null"), 
		OPTIMIZER("null"), 
		SEARCH_COLUMNS("null"), 
		ID("null"), 
		PARENT_ID("null"), 
		DEPTH("null"), 
		POSITION("null"), 
		COST("null"), 
		CARDINALITY("null"), 
		BYTES("null"), 
		OTHER_TAG("null"), 
		PARTITION_START("null"), 
		PARTITION_STOP("null"), 
		PARTITION_ID("null"), 
		OTHER("null"), 
		DISTRIBUTION("null"), 
		CPU_COST("null"), 
		IO_COST("null"), 
		TEMP_SPACE("null"), 
		ACCESS_PREDICATES("null"), 
		FILTER_PREDICATES("null") 
		; 
		final String name; 
	 
		private COLUMNS(final String name) { 
			this.name = name; 
		} 
	 
		public String getName() { 
			return this.name; 
		} 
	} 
 
	private String statementId; 
	private BigDecimal planId; 
	private java.sql.Timestamp timestamp; 
	private String remarks; 
	private String operation; 
	private String options; 
	private String objectNode; 
	private String objectOwner; 
	private String objectName; 
	private String objectAlias; 
	private BigDecimal objectInstance; 
	private String objectType; 
	private String optimizer; 
	private BigDecimal searchColumns; 
	private BigDecimal id; 
	private BigDecimal parentId; 
	private BigDecimal depth; 
	private BigDecimal position; 
	private BigDecimal cost; 
	private BigDecimal cardinality; 
	private BigDecimal bytes; 
	private String otherTag; 
	private String partitionStart; 
	private String partitionStop; 
	private BigDecimal partitionId; 
	private String other; 
	private String distribution; 
	private BigDecimal cpuCost; 
	private BigDecimal ioCost; 
	private BigDecimal tempSpace; 
	private String accessPredicates; 
	private String filterPredicates; 
	
	public String getStatementId() { 
		return statementId; 
	} 
 
	public void setStatementId(String statementId) { 
		this.statementId = statementId; 
	} 
 
	public BigDecimal getPlanId() { 
		return planId; 
	} 
 
	public void setPlanId(BigDecimal planId) { 
		this.planId = planId; 
	} 
 
	public java.sql.Timestamp getTimestamp() { 
		return timestamp; 
	} 
 
	public void setTimestamp(java.sql.Timestamp timestamp) { 
		this.timestamp = timestamp; 
	} 
 
	public String getRemarks() { 
		return remarks; 
	} 
 
	public void setRemarks(String remarks) { 
		this.remarks = remarks; 
	} 
 
	public String getOperation() { 
		return operation; 
	} 
 
	public void setOperation(String operation) { 
		this.operation = operation; 
	} 
 
	public String getOptions() { 
		return options; 
	} 
 
	public void setOptions(String options) { 
		this.options = options; 
	} 
 
	public String getObjectNode() { 
		return objectNode; 
	} 
 
	public void setObjectNode(String objectNode) { 
		this.objectNode = objectNode; 
	} 
 
	public String getObjectOwner() { 
		return objectOwner; 
	} 
 
	public void setObjectOwner(String objectOwner) { 
		this.objectOwner = objectOwner; 
	} 
 
	public String getObjectName() { 
		return objectName; 
	} 
 
	public void setObjectName(String objectName) { 
		this.objectName = objectName; 
	} 
 
	public String getObjectAlias() { 
		return objectAlias; 
	} 
 
	public void setObjectAlias(String objectAlias) { 
		this.objectAlias = objectAlias; 
	} 
 
	public BigDecimal getObjectInstance() { 
		return objectInstance; 
	} 
 
	public void setObjectInstance(BigDecimal objectInstance) { 
		this.objectInstance = objectInstance; 
	} 
 
	public String getObjectType() { 
		return objectType; 
	} 
 
	public void setObjectType(String objectType) { 
		this.objectType = objectType; 
	} 
 
	public String getOptimizer() { 
		return optimizer; 
	} 
 
	public void setOptimizer(String optimizer) { 
		this.optimizer = optimizer; 
	} 
 
	public BigDecimal getSearchColumns() { 
		return searchColumns; 
	} 
 
	public void setSearchColumns(BigDecimal searchColumns) { 
		this.searchColumns = searchColumns; 
	} 
 
	public BigDecimal getId() { 
		return id; 
	} 
 
	public void setId(BigDecimal id) { 
		this.id = id; 
	} 
 
	public BigDecimal getParentId() { 
		return parentId; 
	} 
 
	public void setParentId(BigDecimal parentId) { 
		this.parentId = parentId; 
	} 
 
	public BigDecimal getDepth() { 
		return depth; 
	} 
 
	public void setDepth(BigDecimal depth) { 
		this.depth = depth; 
	} 
 
	public BigDecimal getPosition() { 
		return position; 
	} 
 
	public void setPosition(BigDecimal position) { 
		this.position = position; 
	} 
 
	public BigDecimal getCost() { 
		return cost; 
	} 
 
	public void setCost(BigDecimal cost) { 
		this.cost = cost; 
	} 
 
	public BigDecimal getCardinality() { 
		return cardinality; 
	} 
 
	public void setCardinality(BigDecimal cardinality) { 
		this.cardinality = cardinality; 
	} 
 
	public BigDecimal getBytes() { 
		return bytes; 
	} 
 
	public void setBytes(BigDecimal bytes) { 
		this.bytes = bytes; 
	} 
 
	public String getOtherTag() { 
		return otherTag; 
	} 
 
	public void setOtherTag(String otherTag) { 
		this.otherTag = otherTag; 
	} 
 
	public String getPartitionStart() { 
		return partitionStart; 
	} 
 
	public void setPartitionStart(String partitionStart) { 
		this.partitionStart = partitionStart; 
	} 
 
	public String getPartitionStop() { 
		return partitionStop; 
	} 
 
	public void setPartitionStop(String partitionStop) { 
		this.partitionStop = partitionStop; 
	} 
 
	public BigDecimal getPartitionId() { 
		return partitionId; 
	} 
 
	public void setPartitionId(BigDecimal partitionId) { 
		this.partitionId = partitionId; 
	} 
 
	public String getOther() { 
		return other; 
	} 
 
	public void setOther(String other) { 
		this.other = other; 
	} 
 
	public String getDistribution() { 
		return distribution; 
	} 
 
	public void setDistribution(String distribution) { 
		this.distribution = distribution; 
	} 
 
	public BigDecimal getCpuCost() { 
		return cpuCost; 
	} 
 
	public void setCpuCost(BigDecimal cpuCost) { 
		this.cpuCost = cpuCost; 
	} 
 
	public BigDecimal getIoCost() { 
		return ioCost; 
	} 
 
	public void setIoCost(BigDecimal ioCost) { 
		this.ioCost = ioCost; 
	} 
 
	public BigDecimal getTempSpace() { 
		return tempSpace; 
	} 
 
	public void setTempSpace(BigDecimal tempSpace) { 
		this.tempSpace = tempSpace; 
	} 
 
	public String getAccessPredicates() { 
		return accessPredicates; 
	} 
 
	public void setAccessPredicates(String accessPredicates) { 
		this.accessPredicates = accessPredicates; 
	} 
 
	public String getFilterPredicates() { 
		return filterPredicates; 
	} 
 
	public void setFilterPredicates(String filterPredicates) { 
		this.filterPredicates = filterPredicates; 
	} 
 
} 
