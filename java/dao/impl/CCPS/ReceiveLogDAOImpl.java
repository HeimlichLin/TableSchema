package com.doc.common.dao.impl; 
 
public class ReceiveLogDAOImpl extends GeneralDAOImpl<ReceiveLogPo> implements ReceiveLogDAO { 
	public static final ReceiveLogDAOImpl INSTANCE = new ReceiveLogDAOImpl(); 
	public static final String TABLENAME = "RECEIVE_LOG"; 

	public ReceiveLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ReceiveLogPo> CONVERTER = new MapConverter<ReceiveLogPo>() { 
 
		@Override 
		public ReceiveLogPo convert(final DataObject dataObject) { 
			final ReceiveLogPo receiveLogPo = new ReceiveLogPo(); 
			receiveLogPo.setTransIdenId(dataObject.getString(ReceiveLogPo.COLUMNS.TRANS_IDEN_ID.name())); 
			receiveLogPo.setSysCode(dataObject.getString(ReceiveLogPo.COLUMNS.SYS_CODE.name())); 
			receiveLogPo.setIp(dataObject.getString(ReceiveLogPo.COLUMNS.IP.name())); 
			receiveLogPo.setFoodRegNum(dataObject.getString(ReceiveLogPo.COLUMNS.FOOD_REG_NUM.name())); 
			receiveLogPo.setUserId(dataObject.getString(ReceiveLogPo.COLUMNS.USER_ID.name())); 
			receiveLogPo.setSrcInfo(dataObject.getString(ReceiveLogPo.COLUMNS.SRC_INFO.name())); 
			receiveLogPo.setRecvMode(dataObject.getString(ReceiveLogPo.COLUMNS.RECV_MODE.name())); 
			receiveLogPo.setRecvTime(TimestampUtils.of(dataObject.getValue(ReceiveLogPo.COLUMNS.RECV_TIME.name()))); 
			receiveLogPo.setStatus(dataObject.getString(ReceiveLogPo.COLUMNS.STATUS.name())); 
			receiveLogPo.setSavePath(dataObject.getString(ReceiveLogPo.COLUMNS.SAVE_PATH.name())); 
			receiveLogPo.setSaveName(dataObject.getString(ReceiveLogPo.COLUMNS.SAVE_NAME.name())); 
			receiveLogPo.setFileName(dataObject.getString(ReceiveLogPo.COLUMNS.FILE_NAME.name())); 
			receiveLogPo.setReason(dataObject.getString(ReceiveLogPo.COLUMNS.REASON.name())); 
			receiveLogPo.setDataProcessNumber(dataObject.getString(ReceiveLogPo.COLUMNS.DATA_PROCESS_NUMBER.name())); 
			receiveLogPo.setBan(dataObject.getString(ReceiveLogPo.COLUMNS.BAN.name())); 
			return receiveLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ReceiveLogPo receiveLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.TRANS_IDEN_ID.name(), receiveLogPo.getTransIdenId()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.SYS_CODE.name(), receiveLogPo.getSysCode()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.IP.name(), receiveLogPo.getIp()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.FOOD_REG_NUM.name(), receiveLogPo.getFoodRegNum()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.USER_ID.name(), receiveLogPo.getUserId()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.SRC_INFO.name(), receiveLogPo.getSrcInfo()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.RECV_MODE.name(), receiveLogPo.getRecvMode()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.RECV_TIME.name(), receiveLogPo.getRecvTime()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.STATUS.name(), receiveLogPo.getStatus()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.SAVE_PATH.name(), receiveLogPo.getSavePath()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.SAVE_NAME.name(), receiveLogPo.getSaveName()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.FILE_NAME.name(), receiveLogPo.getFileName()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.REASON.name(), receiveLogPo.getReason()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.DATA_PROCESS_NUMBER.name(), receiveLogPo.getDataProcessNumber()); 
			dataObject.setValue(ReceiveLogPo.COLUMNS.BAN.name(), receiveLogPo.getBan()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ReceiveLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ReceiveLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
