package com.doc.common.dao.impl; 
 
public class ToadPlanTableDAOImpl extends GeneralDAOImpl<ToadPlanTablePo> implements ToadPlanTableDAO { 
	public static final ToadPlanTableDAOImpl INSTANCE = new ToadPlanTableDAOImpl(); 
	public static final String TABLENAME = "TOAD_PLAN_TABLE"; 

	public ToadPlanTableDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ToadPlanTablePo> CONVERTER = new MapConverter<ToadPlanTablePo>() { 
 
		@Override 
		public ToadPlanTablePo convert(final DataObject dataObject) { 
			final ToadPlanTablePo toadPlanTablePo = new ToadPlanTablePo(); 
			toadPlanTablePo.setStatementId(dataObject.getString(ToadPlanTablePo.COLUMNS.STATEMENT_ID.name())); 
			toadPlanTablePo.setPlanId(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.PLAN_ID.name()))); 
			toadPlanTablePo.setTimestamp(TimestampUtils.of(dataObject.getValue(ToadPlanTablePo.COLUMNS.TIMESTAMP.name()))); 
			toadPlanTablePo.setRemarks(dataObject.getString(ToadPlanTablePo.COLUMNS.REMARKS.name())); 
			toadPlanTablePo.setOperation(dataObject.getString(ToadPlanTablePo.COLUMNS.OPERATION.name())); 
			toadPlanTablePo.setOptions(dataObject.getString(ToadPlanTablePo.COLUMNS.OPTIONS.name())); 
			toadPlanTablePo.setObjectNode(dataObject.getString(ToadPlanTablePo.COLUMNS.OBJECT_NODE.name())); 
			toadPlanTablePo.setObjectOwner(dataObject.getString(ToadPlanTablePo.COLUMNS.OBJECT_OWNER.name())); 
			toadPlanTablePo.setObjectName(dataObject.getString(ToadPlanTablePo.COLUMNS.OBJECT_NAME.name())); 
			toadPlanTablePo.setObjectAlias(dataObject.getString(ToadPlanTablePo.COLUMNS.OBJECT_ALIAS.name())); 
			toadPlanTablePo.setObjectInstance(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.OBJECT_INSTANCE.name()))); 
			toadPlanTablePo.setObjectType(dataObject.getString(ToadPlanTablePo.COLUMNS.OBJECT_TYPE.name())); 
			toadPlanTablePo.setOptimizer(dataObject.getString(ToadPlanTablePo.COLUMNS.OPTIMIZER.name())); 
			toadPlanTablePo.setSearchColumns(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.SEARCH_COLUMNS.name()))); 
			toadPlanTablePo.setId(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.ID.name()))); 
			toadPlanTablePo.setParentId(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.PARENT_ID.name()))); 
			toadPlanTablePo.setDepth(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.DEPTH.name()))); 
			toadPlanTablePo.setPosition(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.POSITION.name()))); 
			toadPlanTablePo.setCost(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.COST.name()))); 
			toadPlanTablePo.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.CARDINALITY.name()))); 
			toadPlanTablePo.setBytes(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.BYTES.name()))); 
			toadPlanTablePo.setOtherTag(dataObject.getString(ToadPlanTablePo.COLUMNS.OTHER_TAG.name())); 
			toadPlanTablePo.setPartitionStart(dataObject.getString(ToadPlanTablePo.COLUMNS.PARTITION_START.name())); 
			toadPlanTablePo.setPartitionStop(dataObject.getString(ToadPlanTablePo.COLUMNS.PARTITION_STOP.name())); 
			toadPlanTablePo.setPartitionId(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.PARTITION_ID.name()))); 
			toadPlanTablePo.setOther(); 
			toadPlanTablePo.setDistribution(dataObject.getString(ToadPlanTablePo.COLUMNS.DISTRIBUTION.name())); 
			toadPlanTablePo.setCpuCost(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.CPU_COST.name()))); 
			toadPlanTablePo.setIoCost(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.IO_COST.name()))); 
			toadPlanTablePo.setTempSpace(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.TEMP_SPACE.name()))); 
			toadPlanTablePo.setAccessPredicates(dataObject.getString(ToadPlanTablePo.COLUMNS.ACCESS_PREDICATES.name())); 
			toadPlanTablePo.setFilterPredicates(dataObject.getString(ToadPlanTablePo.COLUMNS.FILTER_PREDICATES.name())); 
			toadPlanTablePo.setProjection(dataObject.getString(ToadPlanTablePo.COLUMNS.PROJECTION.name())); 
			toadPlanTablePo.setTime(BigDecimalUtils.formObj(dataObject.getValue(ToadPlanTablePo.COLUMNS.TIME.name()))); 
			toadPlanTablePo.setQblockName(dataObject.getString(ToadPlanTablePo.COLUMNS.QBLOCK_NAME.name())); 
			toadPlanTablePo.setOtherXml(); 
			return toadPlanTablePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ToadPlanTablePo toadPlanTablePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.STATEMENT_ID.name(), toadPlanTablePo.getStatementId()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PLAN_ID.name(), toadPlanTablePo.getPlanId()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.TIMESTAMP.name(), toadPlanTablePo.getTimestamp()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.REMARKS.name(), toadPlanTablePo.getRemarks()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OPERATION.name(), toadPlanTablePo.getOperation()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OPTIONS.name(), toadPlanTablePo.getOptions()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_NODE.name(), toadPlanTablePo.getObjectNode()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_OWNER.name(), toadPlanTablePo.getObjectOwner()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_NAME.name(), toadPlanTablePo.getObjectName()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_ALIAS.name(), toadPlanTablePo.getObjectAlias()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_INSTANCE.name(), toadPlanTablePo.getObjectInstance()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OBJECT_TYPE.name(), toadPlanTablePo.getObjectType()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OPTIMIZER.name(), toadPlanTablePo.getOptimizer()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.SEARCH_COLUMNS.name(), toadPlanTablePo.getSearchColumns()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.ID.name(), toadPlanTablePo.getId()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PARENT_ID.name(), toadPlanTablePo.getParentId()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.DEPTH.name(), toadPlanTablePo.getDepth()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.POSITION.name(), toadPlanTablePo.getPosition()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.COST.name(), toadPlanTablePo.getCost()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.CARDINALITY.name(), toadPlanTablePo.getCardinality()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.BYTES.name(), toadPlanTablePo.getBytes()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OTHER_TAG.name(), toadPlanTablePo.getOtherTag()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PARTITION_START.name(), toadPlanTablePo.getPartitionStart()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PARTITION_STOP.name(), toadPlanTablePo.getPartitionStop()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PARTITION_ID.name(), toadPlanTablePo.getPartitionId()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OTHER.name(), toadPlanTablePo.getOther()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.DISTRIBUTION.name(), toadPlanTablePo.getDistribution()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.CPU_COST.name(), toadPlanTablePo.getCpuCost()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.IO_COST.name(), toadPlanTablePo.getIoCost()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.TEMP_SPACE.name(), toadPlanTablePo.getTempSpace()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.ACCESS_PREDICATES.name(), toadPlanTablePo.getAccessPredicates()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.FILTER_PREDICATES.name(), toadPlanTablePo.getFilterPredicates()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.PROJECTION.name(), toadPlanTablePo.getProjection()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.TIME.name(), toadPlanTablePo.getTime()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.QBLOCK_NAME.name(), toadPlanTablePo.getQblockName()); 
			dataObject.setValue(ToadPlanTablePo.COLUMNS.OTHER_XML.name(), toadPlanTablePo.getOtherXml()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ToadPlanTablePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ToadPlanTablePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
