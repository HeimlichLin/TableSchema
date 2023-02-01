package com.doc.common.dao.impl; 
 
public class Def$AqcallDAOImpl extends GeneralDAOImpl<Def$AqcallPo> implements IDef$AqcallDAO { 
	public static final Def$AqcallDAOImpl INSTANCE = new Def$AqcallDAOImpl(); 
	public static final String TABLENAME = "DEF$_AQCALL"; 

	public Def$AqcallDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$AqcallPo> CONVERTER = new MapConverter<Def$AqcallPo>() { 
 
		@Override 
		public Def$AqcallPo convert(final DataObject dataObject) { 
			final Def$AqcallPo def$AqcallPo = new Def$AqcallPo(); 
			def$AqcallPo.setQName(dataObject.getString(Def$AqcallPo.COLUMNS.Q_NAME.name())); 
			def$AqcallPo.setMsgid(); 
			def$AqcallPo.setCorrid(dataObject.getString(Def$AqcallPo.COLUMNS.CORRID.name())); 
			def$AqcallPo.setPriority(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.PRIORITY.name()))); 
			def$AqcallPo.setState(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.STATE.name()))); 
			def$AqcallPo.setDelay(); 
			def$AqcallPo.setExpiration(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.EXPIRATION.name()))); 
			def$AqcallPo.setTimeManagerInfo(); 
			def$AqcallPo.setLocalOrderNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.LOCAL_ORDER_NO.name()))); 
			def$AqcallPo.setChainNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.CHAIN_NO.name()))); 
			def$AqcallPo.setCscn(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.CSCN.name()))); 
			def$AqcallPo.setDscn(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.DSCN.name()))); 
			def$AqcallPo.setEnqTime(); 
			def$AqcallPo.setEnqUid(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.ENQ_UID.name()))); 
			def$AqcallPo.setEnqTid(dataObject.getString(Def$AqcallPo.COLUMNS.ENQ_TID.name())); 
			def$AqcallPo.setDeqTime(); 
			def$AqcallPo.setDeqUid(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.DEQ_UID.name()))); 
			def$AqcallPo.setDeqTid(dataObject.getString(Def$AqcallPo.COLUMNS.DEQ_TID.name())); 
			def$AqcallPo.setRetryCount(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.RETRY_COUNT.name()))); 
			def$AqcallPo.setExceptionQschema(dataObject.getString(Def$AqcallPo.COLUMNS.EXCEPTION_QSCHEMA.name())); 
			def$AqcallPo.setExceptionQueue(dataObject.getString(Def$AqcallPo.COLUMNS.EXCEPTION_QUEUE.name())); 
			def$AqcallPo.setStepNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.STEP_NO.name()))); 
			def$AqcallPo.setRecipientKey(BigDecimalUtils.formObj(dataObject.getValue(Def$AqcallPo.COLUMNS.RECIPIENT_KEY.name()))); 
			def$AqcallPo.setDequeueMsgid(); 
			def$AqcallPo.setUserData(); 
			return def$AqcallPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$AqcallPo def$AqcallPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.Q_NAME.name(), def$AqcallPo.getQName()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.MSGID.name(), def$AqcallPo.getMsgid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.CORRID.name(), def$AqcallPo.getCorrid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.PRIORITY.name(), def$AqcallPo.getPriority()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.STATE.name(), def$AqcallPo.getState()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DELAY.name(), def$AqcallPo.getDelay()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.EXPIRATION.name(), def$AqcallPo.getExpiration()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.TIME_MANAGER_INFO.name(), def$AqcallPo.getTimeManagerInfo()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.LOCAL_ORDER_NO.name(), def$AqcallPo.getLocalOrderNo()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.CHAIN_NO.name(), def$AqcallPo.getChainNo()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.CSCN.name(), def$AqcallPo.getCscn()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DSCN.name(), def$AqcallPo.getDscn()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.ENQ_TIME.name(), def$AqcallPo.getEnqTime()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.ENQ_UID.name(), def$AqcallPo.getEnqUid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.ENQ_TID.name(), def$AqcallPo.getEnqTid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DEQ_TIME.name(), def$AqcallPo.getDeqTime()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DEQ_UID.name(), def$AqcallPo.getDeqUid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DEQ_TID.name(), def$AqcallPo.getDeqTid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.RETRY_COUNT.name(), def$AqcallPo.getRetryCount()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.EXCEPTION_QSCHEMA.name(), def$AqcallPo.getExceptionQschema()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.EXCEPTION_QUEUE.name(), def$AqcallPo.getExceptionQueue()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.STEP_NO.name(), def$AqcallPo.getStepNo()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.RECIPIENT_KEY.name(), def$AqcallPo.getRecipientKey()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.DEQUEUE_MSGID.name(), def$AqcallPo.getDequeueMsgid()); 
			dataObject.setValue(Def$AqcallPo.COLUMNS.USER_DATA.name(), def$AqcallPo.getUserData()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$AqcallPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$AqcallPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$AqcallPo.COLUMNS.ENQ_TID.name(), po.getEnqTid()); 
		sqlWhere.add(Def$AqcallPo.COLUMNS.STEP_NO.name(), po.getStepNo()); 
		return sqlWhere; 
	} 
 
} 
