package com.doc.common.dao.impl; 
 
public class QuestSlTempExplain1DAOImpl extends GeneralDAOImpl<QuestSlTempExplain1Do> implements QuestSlTempExplain1DAOImpl { 
	public static final QuestSlTempExplain1DAOImpl INSTANCE = new QuestSlTempExplain1DAOImpl(); 
	public static final String TABLENAME = "QUEST_SL_TEMP_EXPLAIN1"; 

	public QuestSlTempExplain1DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<QuestSlTempExplain1Do> CONVERTER = new MapConverter<QuestSlTempExplain1Do>() { 
 
		@Override 
		public QuestSlTempExplain1Do convert(final DataObject dataObject) { 
			final QuestSlTempExplain1Do questSlTempExplain1Do = new QuestSlTempExplain1Do(); 
			questSlTempExplain1Do.setStatementId(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.STATEMENT_ID.name())); 
			questSlTempExplain1Do.setPlanId(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.PLAN_ID.name()))); 
			questSlTempExplain1Do.setTimestamp(CommUtils.objConver2Time(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.TIMESTAMP.name()))); 
			questSlTempExplain1Do.setRemarks(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.REMARKS.name())); 
			questSlTempExplain1Do.setOperation(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OPERATION.name())); 
			questSlTempExplain1Do.setOptions(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OPTIONS.name())); 
			questSlTempExplain1Do.setObjectNode(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_NODE.name())); 
			questSlTempExplain1Do.setObjectOwner(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_OWNER.name())); 
			questSlTempExplain1Do.setObjectName(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_NAME.name())); 
			questSlTempExplain1Do.setObjectAlias(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_ALIAS.name())); 
			questSlTempExplain1Do.setObjectInstance(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_INSTANCE.name()))); 
			questSlTempExplain1Do.setObjectType(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OBJECT_TYPE.name())); 
			questSlTempExplain1Do.setOptimizer(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OPTIMIZER.name())); 
			questSlTempExplain1Do.setSearchColumns(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.SEARCH_COLUMNS.name()))); 
			questSlTempExplain1Do.setId(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.ID.name()))); 
			questSlTempExplain1Do.setParentId(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.PARENT_ID.name()))); 
			questSlTempExplain1Do.setDepth(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.DEPTH.name()))); 
			questSlTempExplain1Do.setPosition(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.POSITION.name()))); 
			questSlTempExplain1Do.setCost(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.COST.name()))); 
			questSlTempExplain1Do.setCardinality(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.CARDINALITY.name()))); 
			questSlTempExplain1Do.setBytes(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.BYTES.name()))); 
			questSlTempExplain1Do.setOtherTag(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OTHER_TAG.name())); 
			questSlTempExplain1Do.setPartitionStart(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.PARTITION_START.name())); 
			questSlTempExplain1Do.setPartitionStop(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.PARTITION_STOP.name())); 
			questSlTempExplain1Do.setPartitionId(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.PARTITION_ID.name()))); 
			questSlTempExplain1Do.setOther(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.OTHER.name())); 
			questSlTempExplain1Do.setDistribution(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.DISTRIBUTION.name())); 
			questSlTempExplain1Do.setCpuCost(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.CPU_COST.name()))); 
			questSlTempExplain1Do.setIoCost(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.IO_COST.name()))); 
			questSlTempExplain1Do.setTempSpace(BigDecimalUtils.formObj(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.TEMP_SPACE.name()))); 
			questSlTempExplain1Do.setAccessPredicates(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.ACCESS_PREDICATES.name())); 
			questSlTempExplain1Do.setFilterPredicates(dataObject.getString(QuestSlTempExplain1Do.COLUMNS.FILTER_PREDICATES.name())); 
			return questSlTempExplain1Do; 
		} 
 
		@Override 
		public DataObject toDataObject(final QuestSlTempExplain1Do questSlTempExplain1Do) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.STATEMENT_ID.name(), questSlTempExplain1Do.getStatementId()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.PLAN_ID.name(), questSlTempExplain1Do.getPlanId()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.TIMESTAMP.name(), questSlTempExplain1Do.getTimestamp()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.REMARKS.name(), questSlTempExplain1Do.getRemarks()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OPERATION.name(), questSlTempExplain1Do.getOperation()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OPTIONS.name(), questSlTempExplain1Do.getOptions()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_NODE.name(), questSlTempExplain1Do.getObjectNode()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_OWNER.name(), questSlTempExplain1Do.getObjectOwner()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_NAME.name(), questSlTempExplain1Do.getObjectName()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_ALIAS.name(), questSlTempExplain1Do.getObjectAlias()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_INSTANCE.name(), questSlTempExplain1Do.getObjectInstance()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OBJECT_TYPE.name(), questSlTempExplain1Do.getObjectType()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OPTIMIZER.name(), questSlTempExplain1Do.getOptimizer()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.SEARCH_COLUMNS.name(), questSlTempExplain1Do.getSearchColumns()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.ID.name(), questSlTempExplain1Do.getId()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.PARENT_ID.name(), questSlTempExplain1Do.getParentId()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.DEPTH.name(), questSlTempExplain1Do.getDepth()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.POSITION.name(), questSlTempExplain1Do.getPosition()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.COST.name(), questSlTempExplain1Do.getCost()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.CARDINALITY.name(), questSlTempExplain1Do.getCardinality()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.BYTES.name(), questSlTempExplain1Do.getBytes()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OTHER_TAG.name(), questSlTempExplain1Do.getOtherTag()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.PARTITION_START.name(), questSlTempExplain1Do.getPartitionStart()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.PARTITION_STOP.name(), questSlTempExplain1Do.getPartitionStop()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.PARTITION_ID.name(), questSlTempExplain1Do.getPartitionId()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.OTHER.name(), questSlTempExplain1Do.getOther()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.DISTRIBUTION.name(), questSlTempExplain1Do.getDistribution()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.CPU_COST.name(), questSlTempExplain1Do.getCpuCost()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.IO_COST.name(), questSlTempExplain1Do.getIoCost()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.TEMP_SPACE.name(), questSlTempExplain1Do.getTempSpace()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.ACCESS_PREDICATES.name(), questSlTempExplain1Do.getAccessPredicates()); 
			dataObject.setValue(QuestSlTempExplain1Do.COLUMNS.FILTER_PREDICATES.name(), questSlTempExplain1Do.getFilterPredicates()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<QuestSlTempExplain1Do> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(QuestSlTempExplain1Do po) { 
	} 
 
} 
