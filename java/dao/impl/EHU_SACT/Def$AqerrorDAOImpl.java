package com.doc.common.dao.impl; 
 
public class Def$AqerrorDAOImpl extends GeneralDAOImpl<Def$AqerrorPo> implements IDef$AqerrorDAO { 
	public static final Def$AqerrorDAOImpl INSTANCE = new Def$AqerrorDAOImpl(); 
	public static final String TABLENAME = "DEF$_AQERROR"; 

	public Def$AqerrorDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Def$AqerrorPo> CONVERTER = new MapConverter<Def$AqerrorPo>() { 
 
		@Override 
		public Def$AqerrorPo convert(final DataObject dataObject) { 
			final Def$AqerrorPo def$AqerrorPo = new Def$AqerrorPo(); 
			def$AqerrorPo.setQName(dataObject.getString(Def$AqerrorPo.COLUMNS.Q_NAME.name())); 
			def$AqerrorPo.setMsgid(); 
			def$AqerrorPo.setCorrid(dataObject.getString(Def$AqerrorPo.COLUMNS.CORRID.name())); 
			def$AqerrorPo.setPriority(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.PRIORITY.name()))); 
			def$AqerrorPo.setState(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.STATE.name()))); 
			def$AqerrorPo.setDelay(); 
			def$AqerrorPo.setExpiration(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.EXPIRATION.name()))); 
			def$AqerrorPo.setTimeManagerInfo(); 
			def$AqerrorPo.setLocalOrderNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.LOCAL_ORDER_NO.name()))); 
			def$AqerrorPo.setChainNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.CHAIN_NO.name()))); 
			def$AqerrorPo.setCscn(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.CSCN.name()))); 
			def$AqerrorPo.setDscn(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.DSCN.name()))); 
			def$AqerrorPo.setEnqTime(); 
			def$AqerrorPo.setEnqUid(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.ENQ_UID.name()))); 
			def$AqerrorPo.setEnqTid(dataObject.getString(Def$AqerrorPo.COLUMNS.ENQ_TID.name())); 
			def$AqerrorPo.setDeqTime(); 
			def$AqerrorPo.setDeqUid(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.DEQ_UID.name()))); 
			def$AqerrorPo.setDeqTid(dataObject.getString(Def$AqerrorPo.COLUMNS.DEQ_TID.name())); 
			def$AqerrorPo.setRetryCount(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.RETRY_COUNT.name()))); 
			def$AqerrorPo.setExceptionQschema(dataObject.getString(Def$AqerrorPo.COLUMNS.EXCEPTION_QSCHEMA.name())); 
			def$AqerrorPo.setExceptionQueue(dataObject.getString(Def$AqerrorPo.COLUMNS.EXCEPTION_QUEUE.name())); 
			def$AqerrorPo.setStepNo(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.STEP_NO.name()))); 
			def$AqerrorPo.setRecipientKey(BigDecimalUtils.formObj(dataObject.getValue(Def$AqerrorPo.COLUMNS.RECIPIENT_KEY.name()))); 
			def$AqerrorPo.setDequeueMsgid(); 
			def$AqerrorPo.setUserData(); 
			return def$AqerrorPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Def$AqerrorPo def$AqerrorPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.Q_NAME.name(), def$AqerrorPo.getQName()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.MSGID.name(), def$AqerrorPo.getMsgid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.CORRID.name(), def$AqerrorPo.getCorrid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.PRIORITY.name(), def$AqerrorPo.getPriority()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.STATE.name(), def$AqerrorPo.getState()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DELAY.name(), def$AqerrorPo.getDelay()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.EXPIRATION.name(), def$AqerrorPo.getExpiration()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.TIME_MANAGER_INFO.name(), def$AqerrorPo.getTimeManagerInfo()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.LOCAL_ORDER_NO.name(), def$AqerrorPo.getLocalOrderNo()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.CHAIN_NO.name(), def$AqerrorPo.getChainNo()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.CSCN.name(), def$AqerrorPo.getCscn()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DSCN.name(), def$AqerrorPo.getDscn()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.ENQ_TIME.name(), def$AqerrorPo.getEnqTime()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.ENQ_UID.name(), def$AqerrorPo.getEnqUid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.ENQ_TID.name(), def$AqerrorPo.getEnqTid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DEQ_TIME.name(), def$AqerrorPo.getDeqTime()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DEQ_UID.name(), def$AqerrorPo.getDeqUid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DEQ_TID.name(), def$AqerrorPo.getDeqTid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.RETRY_COUNT.name(), def$AqerrorPo.getRetryCount()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.EXCEPTION_QSCHEMA.name(), def$AqerrorPo.getExceptionQschema()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.EXCEPTION_QUEUE.name(), def$AqerrorPo.getExceptionQueue()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.STEP_NO.name(), def$AqerrorPo.getStepNo()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.RECIPIENT_KEY.name(), def$AqerrorPo.getRecipientKey()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.DEQUEUE_MSGID.name(), def$AqerrorPo.getDequeueMsgid()); 
			dataObject.setValue(Def$AqerrorPo.COLUMNS.USER_DATA.name(), def$AqerrorPo.getUserData()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Def$AqerrorPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Def$AqerrorPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(Def$AqerrorPo.COLUMNS.ENQ_TID.name(), po.getEnqTid()); 
		sqlWhere.add(Def$AqerrorPo.COLUMNS.STEP_NO.name(), po.getStepNo()); 
		return sqlWhere; 
	} 
 
} 
