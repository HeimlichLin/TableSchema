package com.doc.common.dao.impl; 
 
public class PlanTableDAOImpl extends GeneralDAOImpl<PlanTablePo> implements PlanTableDAO { 
	public static final PlanTableDAOImpl INSTANCE = new PlanTableDAOImpl(); 
	public static final String TABLENAME = "PLAN_TABLE"; 

	public PlanTableDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<PlanTablePo> CONVERTER = new MapConverter<PlanTablePo>() { 
 
		@Override 
		public PlanTablePo convert(final DataObject dataObject) { 
			final PlanTablePo planTablePo = new PlanTablePo(); 
			planTablePo.setStatementId(dataObject.getString(PlanTablePo.COLUMNS.STATEMENT_ID.name())); 
			planTablePo.setTimestamp(TimestampUtils.of(dataObject.getValue(PlanTablePo.COLUMNS.TIMESTAMP.name()))); 
			planTablePo.setRemarks(dataObject.getString(PlanTablePo.COLUMNS.REMARKS.name())); 
			planTablePo.setOperation(dataObject.getString(PlanTablePo.COLUMNS.OPERATION.name())); 
			planTablePo.setOptions(dataObject.getString(PlanTablePo.COLUMNS.OPTIONS.name())); 
			planTablePo.setObjectNode(dataObject.getString(PlanTablePo.COLUMNS.OBJECT_NODE.name())); 
			planTablePo.setObjectOwner(dataObject.getString(PlanTablePo.COLUMNS.OBJECT_OWNER.name())); 
			planTablePo.setObjectName(dataObject.getString(PlanTablePo.COLUMNS.OBJECT_NAME.name())); 
			planTablePo.setObjectInstance(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.OBJECT_INSTANCE.name()))); 
			planTablePo.setObjectType(dataObject.getString(PlanTablePo.COLUMNS.OBJECT_TYPE.name())); 
			planTablePo.setOptimizer(dataObject.getString(PlanTablePo.COLUMNS.OPTIMIZER.name())); 
			planTablePo.setSearchColumns(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.SEARCH_COLUMNS.name()))); 
			planTablePo.setId(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.ID.name()))); 
			planTablePo.setParentId(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.PARENT_ID.name()))); 
			planTablePo.setPosition(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.POSITION.name()))); 
			planTablePo.setCost(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.COST.name()))); 
			planTablePo.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.CARDINALITY.name()))); 
			planTablePo.setBytes(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.BYTES.name()))); 
			planTablePo.setOtherTag(dataObject.getString(PlanTablePo.COLUMNS.OTHER_TAG.name())); 
			planTablePo.setPartitionStart(dataObject.getString(PlanTablePo.COLUMNS.PARTITION_START.name())); 
			planTablePo.setPartitionStop(dataObject.getString(PlanTablePo.COLUMNS.PARTITION_STOP.name())); 
			planTablePo.setPartitionId(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.PARTITION_ID.name()))); 
			planTablePo.setOther(); 
			planTablePo.setDistribution(dataObject.getString(PlanTablePo.COLUMNS.DISTRIBUTION.name())); 
			planTablePo.setCpuCost(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.CPU_COST.name()))); 
			planTablePo.setIoCost(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.IO_COST.name()))); 
			planTablePo.setTempSpace(BigDecimalUtils.formObj(dataObject.getValue(PlanTablePo.COLUMNS.TEMP_SPACE.name()))); 
			return planTablePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final PlanTablePo planTablePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(PlanTablePo.COLUMNS.STATEMENT_ID.name(), planTablePo.getStatementId()); 
			dataObject.setValue(PlanTablePo.COLUMNS.TIMESTAMP.name(), planTablePo.getTimestamp()); 
			dataObject.setValue(PlanTablePo.COLUMNS.REMARKS.name(), planTablePo.getRemarks()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OPERATION.name(), planTablePo.getOperation()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OPTIONS.name(), planTablePo.getOptions()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OBJECT_NODE.name(), planTablePo.getObjectNode()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OBJECT_OWNER.name(), planTablePo.getObjectOwner()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OBJECT_NAME.name(), planTablePo.getObjectName()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OBJECT_INSTANCE.name(), planTablePo.getObjectInstance()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OBJECT_TYPE.name(), planTablePo.getObjectType()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OPTIMIZER.name(), planTablePo.getOptimizer()); 
			dataObject.setValue(PlanTablePo.COLUMNS.SEARCH_COLUMNS.name(), planTablePo.getSearchColumns()); 
			dataObject.setValue(PlanTablePo.COLUMNS.ID.name(), planTablePo.getId()); 
			dataObject.setValue(PlanTablePo.COLUMNS.PARENT_ID.name(), planTablePo.getParentId()); 
			dataObject.setValue(PlanTablePo.COLUMNS.POSITION.name(), planTablePo.getPosition()); 
			dataObject.setValue(PlanTablePo.COLUMNS.COST.name(), planTablePo.getCost()); 
			dataObject.setValue(PlanTablePo.COLUMNS.CARDINALITY.name(), planTablePo.getCardinality()); 
			dataObject.setValue(PlanTablePo.COLUMNS.BYTES.name(), planTablePo.getBytes()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OTHER_TAG.name(), planTablePo.getOtherTag()); 
			dataObject.setValue(PlanTablePo.COLUMNS.PARTITION_START.name(), planTablePo.getPartitionStart()); 
			dataObject.setValue(PlanTablePo.COLUMNS.PARTITION_STOP.name(), planTablePo.getPartitionStop()); 
			dataObject.setValue(PlanTablePo.COLUMNS.PARTITION_ID.name(), planTablePo.getPartitionId()); 
			dataObject.setValue(PlanTablePo.COLUMNS.OTHER.name(), planTablePo.getOther()); 
			dataObject.setValue(PlanTablePo.COLUMNS.DISTRIBUTION.name(), planTablePo.getDistribution()); 
			dataObject.setValue(PlanTablePo.COLUMNS.CPU_COST.name(), planTablePo.getCpuCost()); 
			dataObject.setValue(PlanTablePo.COLUMNS.IO_COST.name(), planTablePo.getIoCost()); 
			dataObject.setValue(PlanTablePo.COLUMNS.TEMP_SPACE.name(), planTablePo.getTempSpace()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<PlanTablePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(PlanTablePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
