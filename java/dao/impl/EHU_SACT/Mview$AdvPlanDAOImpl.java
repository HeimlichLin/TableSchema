package com.doc.common.dao.impl; 
 
public class Mview$AdvPlanDAOImpl extends GeneralDAOImpl<Mview$AdvPlanPo> implements IMview$AdvPlanDAO { 
	public static final Mview$AdvPlanDAOImpl INSTANCE = new Mview$AdvPlanDAOImpl(); 
	public static final String TABLENAME = "MVIEW$_ADV_PLAN"; 

	public Mview$AdvPlanDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Mview$AdvPlanPo> CONVERTER = new MapConverter<Mview$AdvPlanPo>() { 
 
		@Override 
		public Mview$AdvPlanPo convert(final DataObject dataObject) { 
			final Mview$AdvPlanPo mview$AdvPlanPo = new Mview$AdvPlanPo(); 
			mview$AdvPlanPo.setStatementId(dataObject.getString(Mview$AdvPlanPo.COLUMNS.STATEMENT_ID.name())); 
			mview$AdvPlanPo.setTimestamp(TimestampUtils.of(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.TIMESTAMP.name()))); 
			mview$AdvPlanPo.setRemarks(dataObject.getString(Mview$AdvPlanPo.COLUMNS.REMARKS.name())); 
			mview$AdvPlanPo.setOperation(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OPERATION.name())); 
			mview$AdvPlanPo.setOptions(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OPTIONS.name())); 
			mview$AdvPlanPo.setObjectNode(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OBJECT_NODE.name())); 
			mview$AdvPlanPo.setObjectOwner(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OBJECT_OWNER.name())); 
			mview$AdvPlanPo.setObjectName(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OBJECT_NAME.name())); 
			mview$AdvPlanPo.setObjectInstance(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.OBJECT_INSTANCE.name()))); 
			mview$AdvPlanPo.setObjectType(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OBJECT_TYPE.name())); 
			mview$AdvPlanPo.setOptimizer(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OPTIMIZER.name())); 
			mview$AdvPlanPo.setSearchColumns(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.SEARCH_COLUMNS.name()))); 
			mview$AdvPlanPo.setId(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.ID.name()))); 
			mview$AdvPlanPo.setParentId(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.PARENT_ID.name()))); 
			mview$AdvPlanPo.setPosition(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.POSITION.name()))); 
			mview$AdvPlanPo.setCost(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.COST.name()))); 
			mview$AdvPlanPo.setCardinality(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.CARDINALITY.name()))); 
			mview$AdvPlanPo.setBytes(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.BYTES.name()))); 
			mview$AdvPlanPo.setOtherTag(dataObject.getString(Mview$AdvPlanPo.COLUMNS.OTHER_TAG.name())); 
			mview$AdvPlanPo.setPartitionStart(dataObject.getString(Mview$AdvPlanPo.COLUMNS.PARTITION_START.name())); 
			mview$AdvPlanPo.setPartitionStop(dataObject.getString(Mview$AdvPlanPo.COLUMNS.PARTITION_STOP.name())); 
			mview$AdvPlanPo.setPartitionId(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.PARTITION_ID.name()))); 
			mview$AdvPlanPo.setOther(); 
			mview$AdvPlanPo.setDistribution(dataObject.getString(Mview$AdvPlanPo.COLUMNS.DISTRIBUTION.name())); 
			mview$AdvPlanPo.setCpuCost(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.CPU_COST.name()))); 
			mview$AdvPlanPo.setIoCost(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.IO_COST.name()))); 
			mview$AdvPlanPo.setTempSpace(BigDecimalUtils.formObj(dataObject.getValue(Mview$AdvPlanPo.COLUMNS.TEMP_SPACE.name()))); 
			return mview$AdvPlanPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Mview$AdvPlanPo mview$AdvPlanPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.STATEMENT_ID.name(), mview$AdvPlanPo.getStatementId()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.TIMESTAMP.name(), mview$AdvPlanPo.getTimestamp()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.REMARKS.name(), mview$AdvPlanPo.getRemarks()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OPERATION.name(), mview$AdvPlanPo.getOperation()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OPTIONS.name(), mview$AdvPlanPo.getOptions()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OBJECT_NODE.name(), mview$AdvPlanPo.getObjectNode()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OBJECT_OWNER.name(), mview$AdvPlanPo.getObjectOwner()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OBJECT_NAME.name(), mview$AdvPlanPo.getObjectName()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OBJECT_INSTANCE.name(), mview$AdvPlanPo.getObjectInstance()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OBJECT_TYPE.name(), mview$AdvPlanPo.getObjectType()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OPTIMIZER.name(), mview$AdvPlanPo.getOptimizer()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.SEARCH_COLUMNS.name(), mview$AdvPlanPo.getSearchColumns()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.ID.name(), mview$AdvPlanPo.getId()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.PARENT_ID.name(), mview$AdvPlanPo.getParentId()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.POSITION.name(), mview$AdvPlanPo.getPosition()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.COST.name(), mview$AdvPlanPo.getCost()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.CARDINALITY.name(), mview$AdvPlanPo.getCardinality()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.BYTES.name(), mview$AdvPlanPo.getBytes()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OTHER_TAG.name(), mview$AdvPlanPo.getOtherTag()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.PARTITION_START.name(), mview$AdvPlanPo.getPartitionStart()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.PARTITION_STOP.name(), mview$AdvPlanPo.getPartitionStop()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.PARTITION_ID.name(), mview$AdvPlanPo.getPartitionId()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.OTHER.name(), mview$AdvPlanPo.getOther()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.DISTRIBUTION.name(), mview$AdvPlanPo.getDistribution()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.CPU_COST.name(), mview$AdvPlanPo.getCpuCost()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.IO_COST.name(), mview$AdvPlanPo.getIoCost()); 
			dataObject.setValue(Mview$AdvPlanPo.COLUMNS.TEMP_SPACE.name(), mview$AdvPlanPo.getTempSpace()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Mview$AdvPlanPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Mview$AdvPlanPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
