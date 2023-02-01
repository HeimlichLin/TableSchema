package com.doc.common.dao.impl; 
 
public class Def$DestinationDAOImpl extends GeneralDAOImpl<Def$DestinationPo> implements IDef$DestinationDAO { 
	public static final Def$DestinationDAOImpl INSTANCE = new Def$DestinationDAOImpl(); 
	public static final String TABLENAME = "DEF$_DESTINATION"; 

	public Def$DestinationDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$DestinationPo> CONVERTER = new MapConverter<Def$DestinationPo>() { 
 
		@Override 
		public Def$DestinationPo convert(final DataObject dataObject) { 
			final Def$DestinationPo def$DestinationPo = new Def$DestinationPo(); 
			def$DestinationPo.setDblink(dataObject.getString(Def$DestinationPo.COLUMNS.DBLINK.name())); 
			def$DestinationPo.setLastDelivered(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.LAST_DELIVERED.name()))); 
			def$DestinationPo.setLastEnqTid(dataObject.getString(Def$DestinationPo.COLUMNS.LAST_ENQ_TID.name())); 
			def$DestinationPo.setLastSeq(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.LAST_SEQ.name()))); 
			def$DestinationPo.setDisabled(dataObject.getString(Def$DestinationPo.COLUMNS.DISABLED.name())); 
			def$DestinationPo.setJob(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.JOB.name()))); 
			def$DestinationPo.setLastTxnCount(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.LAST_TXN_COUNT.name()))); 
			def$DestinationPo.setLastErrorNumber(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.LAST_ERROR_NUMBER.name()))); 
			def$DestinationPo.setLastErrorMessage(dataObject.getString(Def$DestinationPo.COLUMNS.LAST_ERROR_MESSAGE.name())); 
			def$DestinationPo.setApplyInit(dataObject.getString(Def$DestinationPo.COLUMNS.APPLY_INIT.name())); 
			def$DestinationPo.setCatchup(); 
			def$DestinationPo.setAlternate(dataObject.getString(Def$DestinationPo.COLUMNS.ALTERNATE.name())); 
			def$DestinationPo.setTotalTxnCount(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.TOTAL_TXN_COUNT.name()))); 
			def$DestinationPo.setTotalPropTimeThroughput(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.TOTAL_PROP_TIME_THROUGHPUT.name()))); 
			def$DestinationPo.setTotalPropTimeLatency(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.TOTAL_PROP_TIME_LATENCY.name()))); 
			def$DestinationPo.setToCommunicationSize(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.TO_COMMUNICATION_SIZE.name()))); 
			def$DestinationPo.setFromCommunicationSize(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.FROM_COMMUNICATION_SIZE.name()))); 
			def$DestinationPo.setFlag(); 
			def$DestinationPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.SPARE1.name()))); 
			def$DestinationPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.SPARE2.name()))); 
			def$DestinationPo.setSpare3(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.SPARE3.name()))); 
			def$DestinationPo.setSpare4(BigDecimalUtils.formObj(dataObject.getValue(Def$DestinationPo.COLUMNS.SPARE4.name()))); 
			return def$DestinationPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$DestinationPo def$DestinationPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.DBLINK.name(), def$DestinationPo.getDblink()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_DELIVERED.name(), def$DestinationPo.getLastDelivered()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_ENQ_TID.name(), def$DestinationPo.getLastEnqTid()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_SEQ.name(), def$DestinationPo.getLastSeq()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.DISABLED.name(), def$DestinationPo.getDisabled()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.JOB.name(), def$DestinationPo.getJob()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_TXN_COUNT.name(), def$DestinationPo.getLastTxnCount()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_ERROR_NUMBER.name(), def$DestinationPo.getLastErrorNumber()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.LAST_ERROR_MESSAGE.name(), def$DestinationPo.getLastErrorMessage()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.APPLY_INIT.name(), def$DestinationPo.getApplyInit()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.CATCHUP.name(), def$DestinationPo.getCatchup()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.ALTERNATE.name(), def$DestinationPo.getAlternate()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.TOTAL_TXN_COUNT.name(), def$DestinationPo.getTotalTxnCount()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.TOTAL_PROP_TIME_THROUGHPUT.name(), def$DestinationPo.getTotalPropTimeThroughput()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.TOTAL_PROP_TIME_LATENCY.name(), def$DestinationPo.getTotalPropTimeLatency()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.TO_COMMUNICATION_SIZE.name(), def$DestinationPo.getToCommunicationSize()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.FROM_COMMUNICATION_SIZE.name(), def$DestinationPo.getFromCommunicationSize()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.FLAG.name(), def$DestinationPo.getFlag()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.SPARE1.name(), def$DestinationPo.getSpare1()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.SPARE2.name(), def$DestinationPo.getSpare2()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.SPARE3.name(), def$DestinationPo.getSpare3()); 
			dataObject.setValue(Def$DestinationPo.COLUMNS.SPARE4.name(), def$DestinationPo.getSpare4()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$DestinationPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$DestinationPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$DestinationPo.COLUMNS.DBLINK.name(), po.getDblink()); 
		sqlWhere.add(Def$DestinationPo.COLUMNS.CATCHUP.name(), po.getCatchup()); 
		return sqlWhere; 
	} 
 
} 
