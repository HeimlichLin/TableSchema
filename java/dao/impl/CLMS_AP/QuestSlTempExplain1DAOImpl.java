package com.doc.common.dao.impl; 
 
public class QuestSlTempExplain1DAOImpl extends GeneralDAOImpl<QuestSlTempExplain1Po> implements QuestSlTempExplain1DAO { 
	public static final QuestSlTempExplain1DAOImpl INSTANCE = new QuestSlTempExplain1DAOImpl(); 
	public static final String TABLENAME = "QUEST_SL_TEMP_EXPLAIN1"; 

	public QuestSlTempExplain1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<QuestSlTempExplain1Po> CONVERTER = new MapConverter<QuestSlTempExplain1Po>() { 
 
		@Override 
		public QuestSlTempExplain1Po convert(final DataObject dataObject) { 
			final QuestSlTempExplain1Po questSlTempExplain1Po = new QuestSlTempExplain1Po(); 
			questSlTempExplain1Po.setStatementId(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.STATEMENT_ID.name())); 
			questSlTempExplain1Po.setPlanId(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.PLAN_ID.name()))); 
			questSlTempExplain1Po.setTimestamp(TimestampUtils.of(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.TIMESTAMP.name()))); 
			questSlTempExplain1Po.setRemarks(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.REMARKS.name())); 
			questSlTempExplain1Po.setOperation(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OPERATION.name())); 
			questSlTempExplain1Po.setOptions(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OPTIONS.name())); 
			questSlTempExplain1Po.setObjectNode(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OBJECT_NODE.name())); 
			questSlTempExplain1Po.setObjectOwner(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OBJECT_OWNER.name())); 
			questSlTempExplain1Po.setObjectName(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OBJECT_NAME.name())); 
			questSlTempExplain1Po.setObjectAlias(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OBJECT_ALIAS.name())); 
			questSlTempExplain1Po.setObjectInstance(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_INSTANCE.name()))); 
			questSlTempExplain1Po.setObjectType(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OBJECT_TYPE.name())); 
			questSlTempExplain1Po.setOptimizer(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OPTIMIZER.name())); 
			questSlTempExplain1Po.setSearchColumns(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.SEARCH_COLUMNS.name()))); 
			questSlTempExplain1Po.setId(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.ID.name()))); 
			questSlTempExplain1Po.setParentId(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.PARENT_ID.name()))); 
			questSlTempExplain1Po.setDepth(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.DEPTH.name()))); 
			questSlTempExplain1Po.setPosition(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.POSITION.name()))); 
			questSlTempExplain1Po.setCost(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.COST.name()))); 
			questSlTempExplain1Po.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.CARDINALITY.name()))); 
			questSlTempExplain1Po.setBytes(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.BYTES.name()))); 
			questSlTempExplain1Po.setOtherTag(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.OTHER_TAG.name())); 
			questSlTempExplain1Po.setPartitionStart(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.PARTITION_START.name())); 
			questSlTempExplain1Po.setPartitionStop(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.PARTITION_STOP.name())); 
			questSlTempExplain1Po.setPartitionId(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.PARTITION_ID.name()))); 
			questSlTempExplain1Po.setOther(); 
			questSlTempExplain1Po.setDistribution(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.DISTRIBUTION.name())); 
			questSlTempExplain1Po.setCpuCost(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.CPU_COST.name()))); 
			questSlTempExplain1Po.setIoCost(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.IO_COST.name()))); 
			questSlTempExplain1Po.setTempSpace(BigDecimalUtils.formObj(dataObject.getValue(QuestSlTempExplain1Po.COLUMNS.TEMP_SPACE.name()))); 
			questSlTempExplain1Po.setAccessPredicates(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.ACCESS_PREDICATES.name())); 
			questSlTempExplain1Po.setFilterPredicates(dataObject.getString(QuestSlTempExplain1Po.COLUMNS.FILTER_PREDICATES.name())); 
			return questSlTempExplain1Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final QuestSlTempExplain1Po questSlTempExplain1Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.STATEMENT_ID.name(), questSlTempExplain1Po.getStatementId()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.PLAN_ID.name(), questSlTempExplain1Po.getPlanId()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.TIMESTAMP.name(), questSlTempExplain1Po.getTimestamp()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.REMARKS.name(), questSlTempExplain1Po.getRemarks()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OPERATION.name(), questSlTempExplain1Po.getOperation()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OPTIONS.name(), questSlTempExplain1Po.getOptions()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_NODE.name(), questSlTempExplain1Po.getObjectNode()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_OWNER.name(), questSlTempExplain1Po.getObjectOwner()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_NAME.name(), questSlTempExplain1Po.getObjectName()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_ALIAS.name(), questSlTempExplain1Po.getObjectAlias()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_INSTANCE.name(), questSlTempExplain1Po.getObjectInstance()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OBJECT_TYPE.name(), questSlTempExplain1Po.getObjectType()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OPTIMIZER.name(), questSlTempExplain1Po.getOptimizer()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.SEARCH_COLUMNS.name(), questSlTempExplain1Po.getSearchColumns()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.ID.name(), questSlTempExplain1Po.getId()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.PARENT_ID.name(), questSlTempExplain1Po.getParentId()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.DEPTH.name(), questSlTempExplain1Po.getDepth()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.POSITION.name(), questSlTempExplain1Po.getPosition()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.COST.name(), questSlTempExplain1Po.getCost()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.CARDINALITY.name(), questSlTempExplain1Po.getCardinality()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.BYTES.name(), questSlTempExplain1Po.getBytes()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OTHER_TAG.name(), questSlTempExplain1Po.getOtherTag()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.PARTITION_START.name(), questSlTempExplain1Po.getPartitionStart()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.PARTITION_STOP.name(), questSlTempExplain1Po.getPartitionStop()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.PARTITION_ID.name(), questSlTempExplain1Po.getPartitionId()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.OTHER.name(), questSlTempExplain1Po.getOther()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.DISTRIBUTION.name(), questSlTempExplain1Po.getDistribution()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.CPU_COST.name(), questSlTempExplain1Po.getCpuCost()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.IO_COST.name(), questSlTempExplain1Po.getIoCost()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.TEMP_SPACE.name(), questSlTempExplain1Po.getTempSpace()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.ACCESS_PREDICATES.name(), questSlTempExplain1Po.getAccessPredicates()); 
			dataObject.setValue(QuestSlTempExplain1Po.COLUMNS.FILTER_PREDICATES.name(), questSlTempExplain1Po.getFilterPredicates()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<QuestSlTempExplain1Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(QuestSlTempExplain1Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
