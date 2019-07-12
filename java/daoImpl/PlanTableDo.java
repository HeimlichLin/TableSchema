package com.doc.common.dao.impl; 
 
public class PlanTableDAO extends GeneralDAOImpl<PlanTableDo> implements PlanTableDAO { 
	public static final PlanTableDAOImpl INSTANCE = new PlanTableDAOImpl(); 
	public static final String TABLENAME = "PLAN_TABLE"; 

	public PlanTableDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<PlanTableDo> CONVERTER = new MapConverter<PlanTableDo>() { 
 
		@Override 
		public PlanTableDo convert(final DataObject dataObject) { 
			final PlanTableDo planTableDo = new PlanTableDo(); 
			planTableDo.setStatementId(dataObject.getString(PlanTableDo.COLUMNS.STATEMENT_ID.name())); 
			planTableDo.setTimestamp(CommUtils.objConver2Time(dataObject.getString(PlanTableDo.COLUMNS.TIMESTAMP.name()))); 
			planTableDo.setRemarks(dataObject.getString(PlanTableDo.COLUMNS.REMARKS.name())); 
			planTableDo.setOperation(dataObject.getString(PlanTableDo.COLUMNS.OPERATION.name())); 
			planTableDo.setOptions(dataObject.getString(PlanTableDo.COLUMNS.OPTIONS.name())); 
			planTableDo.setObjectNode(dataObject.getString(PlanTableDo.COLUMNS.OBJECT_NODE.name())); 
			planTableDo.setObjectOwner(dataObject.getString(PlanTableDo.COLUMNS.OBJECT_OWNER.name())); 
			planTableDo.setObjectName(dataObject.getString(PlanTableDo.COLUMNS.OBJECT_NAME.name())); 
			planTableDo.setObjectInstance(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.OBJECT_INSTANCE.name()))); 
			planTableDo.setObjectType(dataObject.getString(PlanTableDo.COLUMNS.OBJECT_TYPE.name())); 
			planTableDo.setOptimizer(dataObject.getString(PlanTableDo.COLUMNS.OPTIMIZER.name())); 
			planTableDo.setSearchColumns(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.SEARCH_COLUMNS.name()))); 
			planTableDo.setId(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.ID.name()))); 
			planTableDo.setParentId(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.PARENT_ID.name()))); 
			planTableDo.setPosition(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.POSITION.name()))); 
			planTableDo.setCost(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.COST.name()))); 
			planTableDo.setCardinality(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.CARDINALITY.name()))); 
			planTableDo.setBytes(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.BYTES.name()))); 
			planTableDo.setOtherTag(dataObject.getString(PlanTableDo.COLUMNS.OTHER_TAG.name())); 
			planTableDo.setPartitionStart(dataObject.getString(PlanTableDo.COLUMNS.PARTITION_START.name())); 
			planTableDo.setPartitionStop(dataObject.getString(PlanTableDo.COLUMNS.PARTITION_STOP.name())); 
			planTableDo.setPartitionId(BigDecimalUtils.formObj(dataObject.getString(PlanTableDo.COLUMNS.PARTITION_ID.name()))); 
			planTableDo.setOther(dataObject.getString(PlanTableDo.COLUMNS.OTHER.name())); 
			planTableDo.setDistribution(dataObject.getString(PlanTableDo.COLUMNS.DISTRIBUTION.name())); 
			return planTableDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PlanTableDo planTableDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PlanTableDo.COLUMNS.STATEMENT_ID.name(), planTableDo.getStatementId()); 
			dataObject.setValue(PlanTableDo.COLUMNS.TIMESTAMP.name(), planTableDo.getTimestamp()); 
			dataObject.setValue(PlanTableDo.COLUMNS.REMARKS.name(), planTableDo.getRemarks()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OPERATION.name(), planTableDo.getOperation()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OPTIONS.name(), planTableDo.getOptions()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OBJECT_NODE.name(), planTableDo.getObjectNode()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OBJECT_OWNER.name(), planTableDo.getObjectOwner()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OBJECT_NAME.name(), planTableDo.getObjectName()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OBJECT_INSTANCE.name(), planTableDo.getObjectInstance()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OBJECT_TYPE.name(), planTableDo.getObjectType()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OPTIMIZER.name(), planTableDo.getOptimizer()); 
			dataObject.setValue(PlanTableDo.COLUMNS.SEARCH_COLUMNS.name(), planTableDo.getSearchColumns()); 
			dataObject.setValue(PlanTableDo.COLUMNS.ID.name(), planTableDo.getId()); 
			dataObject.setValue(PlanTableDo.COLUMNS.PARENT_ID.name(), planTableDo.getParentId()); 
			dataObject.setValue(PlanTableDo.COLUMNS.POSITION.name(), planTableDo.getPosition()); 
			dataObject.setValue(PlanTableDo.COLUMNS.COST.name(), planTableDo.getCost()); 
			dataObject.setValue(PlanTableDo.COLUMNS.CARDINALITY.name(), planTableDo.getCardinality()); 
			dataObject.setValue(PlanTableDo.COLUMNS.BYTES.name(), planTableDo.getBytes()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OTHER_TAG.name(), planTableDo.getOtherTag()); 
			dataObject.setValue(PlanTableDo.COLUMNS.PARTITION_START.name(), planTableDo.getPartitionStart()); 
			dataObject.setValue(PlanTableDo.COLUMNS.PARTITION_STOP.name(), planTableDo.getPartitionStop()); 
			dataObject.setValue(PlanTableDo.COLUMNS.PARTITION_ID.name(), planTableDo.getPartitionId()); 
			dataObject.setValue(PlanTableDo.COLUMNS.OTHER.name(), planTableDo.getOther()); 
			dataObject.setValue(PlanTableDo.COLUMNS.DISTRIBUTION.name(), planTableDo.getDistribution()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PlanTableDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PlanTableDo po) { 
		sqlWhere.add(PlanTableDo.COLUMNS.STATEMENT_ID.name(), po.getStatementId()); 
		sqlWhere.add(PlanTableDo.COLUMNS.TIMESTAMP.name(), po.getTimestamp()); 
		sqlWhere.add(PlanTableDo.COLUMNS.REMARKS.name(), po.getRemarks()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OPERATION.name(), po.getOperation()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OPTIONS.name(), po.getOptions()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OBJECT_NODE.name(), po.getObjectNode()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OBJECT_OWNER.name(), po.getObjectOwner()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OBJECT_NAME.name(), po.getObjectName()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OBJECT_INSTANCE.name(), po.getObjectInstance()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OBJECT_TYPE.name(), po.getObjectType()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OPTIMIZER.name(), po.getOptimizer()); 
		sqlWhere.add(PlanTableDo.COLUMNS.SEARCH_COLUMNS.name(), po.getSearchColumns()); 
		sqlWhere.add(PlanTableDo.COLUMNS.ID.name(), po.getId()); 
		sqlWhere.add(PlanTableDo.COLUMNS.PARENT_ID.name(), po.getParentId()); 
		sqlWhere.add(PlanTableDo.COLUMNS.POSITION.name(), po.getPosition()); 
		sqlWhere.add(PlanTableDo.COLUMNS.COST.name(), po.getCost()); 
		sqlWhere.add(PlanTableDo.COLUMNS.CARDINALITY.name(), po.getCardinality()); 
		sqlWhere.add(PlanTableDo.COLUMNS.BYTES.name(), po.getBytes()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OTHER_TAG.name(), po.getOtherTag()); 
		sqlWhere.add(PlanTableDo.COLUMNS.PARTITION_START.name(), po.getPartitionStart()); 
		sqlWhere.add(PlanTableDo.COLUMNS.PARTITION_STOP.name(), po.getPartitionStop()); 
		sqlWhere.add(PlanTableDo.COLUMNS.PARTITION_ID.name(), po.getPartitionId()); 
		sqlWhere.add(PlanTableDo.COLUMNS.OTHER.name(), po.getOther()); 
		sqlWhere.add(PlanTableDo.COLUMNS.DISTRIBUTION.name(), po.getDistribution()); 
	} 
 
} 
