package com.doc.common.po.impl; 
 
public class Mview$AdvPlanPo implements IMview$AdvPlanPo {
 
	public enum COLUMNS {
		STATEMENT_ID("null"), //
		TIMESTAMP("null"), //
		REMARKS("null"), //
		OPERATION("null"), //
		OPTIONS("null"), //
		OBJECT_NODE("null"), //
		OBJECT_OWNER("null"), //
		OBJECT_NAME("null"), //
		OBJECT_INSTANCE("null"), //
		OBJECT_TYPE("null"), //
		OPTIMIZER("null"), //
		SEARCH_COLUMNS("null"), //
		ID("null"), //
		PARENT_ID("null"), //
		POSITION("null"), //
		COST("null"), //
		CARDINALITY("null"), //
		BYTES("null"), //
		OTHER_TAG("null"), //
		PARTITION_START("null"), //
		PARTITION_STOP("null"), //
		PARTITION_ID("null"), //
		OTHER("null"), //
		DISTRIBUTION("null"), //
		CPU_COST("null"), //
		IO_COST("null"), //
		TEMP_SPACE("null") //
		;
		private final String comment;

		private COLUMNS(final String comment) {
			this.comment = comment;
		}

		public String getComment() {
			return this.comment;
		}
	}
 
	private String statementId;
	private java.sql.Timestamp timestamp;
	private String remarks;
	private String operation;
	private String options;
	private String objectNode;
	private String objectOwner;
	private String objectName;
	private BigDecimal objectInstance;
	private String objectType;
	private String optimizer;
	private BigDecimal searchColumns;
	private BigDecimal id;
	private BigDecimal parentId;
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

	@Override
	public String getStatementId() {
		return this.statementId;
	}
 
	@Override
	public void setStatementId(final String statementId) {
		this.statementId = statementId; 
	}
 
	@Override
	public java.sql.Timestamp getTimestamp() {
		return this.timestamp;
	}
 
	@Override
	public void setTimestamp(final java.sql.Timestamp timestamp) {
		this.timestamp = timestamp; 
	}
 
	@Override
	public String getRemarks() {
		return this.remarks;
	}
 
	@Override
	public void setRemarks(final String remarks) {
		this.remarks = remarks; 
	}
 
	@Override
	public String getOperation() {
		return this.operation;
	}
 
	@Override
	public void setOperation(final String operation) {
		this.operation = operation; 
	}
 
	@Override
	public String getOptions() {
		return this.options;
	}
 
	@Override
	public void setOptions(final String options) {
		this.options = options; 
	}
 
	@Override
	public String getObjectNode() {
		return this.objectNode;
	}
 
	@Override
	public void setObjectNode(final String objectNode) {
		this.objectNode = objectNode; 
	}
 
	@Override
	public String getObjectOwner() {
		return this.objectOwner;
	}
 
	@Override
	public void setObjectOwner(final String objectOwner) {
		this.objectOwner = objectOwner; 
	}
 
	@Override
	public String getObjectName() {
		return this.objectName;
	}
 
	@Override
	public void setObjectName(final String objectName) {
		this.objectName = objectName; 
	}
 
	@Override
	public BigDecimal getObjectInstance() {
		return this.objectInstance;
	}
 
	@Override
	public void setObjectInstance(final BigDecimal objectInstance) {
		this.objectInstance = objectInstance; 
	}
 
	@Override
	public String getObjectType() {
		return this.objectType;
	}
 
	@Override
	public void setObjectType(final String objectType) {
		this.objectType = objectType; 
	}
 
	@Override
	public String getOptimizer() {
		return this.optimizer;
	}
 
	@Override
	public void setOptimizer(final String optimizer) {
		this.optimizer = optimizer; 
	}
 
	@Override
	public BigDecimal getSearchColumns() {
		return this.searchColumns;
	}
 
	@Override
	public void setSearchColumns(final BigDecimal searchColumns) {
		this.searchColumns = searchColumns; 
	}
 
	@Override
	public BigDecimal getId() {
		return this.id;
	}
 
	@Override
	public void setId(final BigDecimal id) {
		this.id = id; 
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
	public BigDecimal getPosition() {
		return this.position;
	}
 
	@Override
	public void setPosition(final BigDecimal position) {
		this.position = position; 
	}
 
	@Override
	public BigDecimal getCost() {
		return this.cost;
	}
 
	@Override
	public void setCost(final BigDecimal cost) {
		this.cost = cost; 
	}
 
	@Override
	public BigDecimal getCardinality() {
		return this.cardinality;
	}
 
	@Override
	public void setCardinality(final BigDecimal cardinality) {
		this.cardinality = cardinality; 
	}
 
	@Override
	public BigDecimal getBytes() {
		return this.bytes;
	}
 
	@Override
	public void setBytes(final BigDecimal bytes) {
		this.bytes = bytes; 
	}
 
	@Override
	public String getOtherTag() {
		return this.otherTag;
	}
 
	@Override
	public void setOtherTag(final String otherTag) {
		this.otherTag = otherTag; 
	}
 
	@Override
	public String getPartitionStart() {
		return this.partitionStart;
	}
 
	@Override
	public void setPartitionStart(final String partitionStart) {
		this.partitionStart = partitionStart; 
	}
 
	@Override
	public String getPartitionStop() {
		return this.partitionStop;
	}
 
	@Override
	public void setPartitionStop(final String partitionStop) {
		this.partitionStop = partitionStop; 
	}
 
	@Override
	public BigDecimal getPartitionId() {
		return this.partitionId;
	}
 
	@Override
	public void setPartitionId(final BigDecimal partitionId) {
		this.partitionId = partitionId; 
	}
 
	@Override
	public String getOther() {
		return this.other;
	}
 
	@Override
	public void setOther(final String other) {
		this.other = other; 
	}
 
	@Override
	public String getDistribution() {
		return this.distribution;
	}
 
	@Override
	public void setDistribution(final String distribution) {
		this.distribution = distribution; 
	}
 
	@Override
	public BigDecimal getCpuCost() {
		return this.cpuCost;
	}
 
	@Override
	public void setCpuCost(final BigDecimal cpuCost) {
		this.cpuCost = cpuCost; 
	}
 
	@Override
	public BigDecimal getIoCost() {
		return this.ioCost;
	}
 
	@Override
	public void setIoCost(final BigDecimal ioCost) {
		this.ioCost = ioCost; 
	}
 
	@Override
	public BigDecimal getTempSpace() {
		return this.tempSpace;
	}
 
	@Override
	public void setTempSpace(final BigDecimal tempSpace) {
		this.tempSpace = tempSpace; 
	}
 
}
