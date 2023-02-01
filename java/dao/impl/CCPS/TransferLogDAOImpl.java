package com.doc.common.dao.impl; 
 
public class TransferLogDAOImpl extends GeneralDAOImpl<TransferLogPo> implements TransferLogDAO { 
	public static final TransferLogDAOImpl INSTANCE = new TransferLogDAOImpl(); 
	public static final String TABLENAME = "TRANSFER_LOG"; 

	public TransferLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TransferLogPo> CONVERTER = new MapConverter<TransferLogPo>() { 
 
		@Override 
		public TransferLogPo convert(final DataObject dataObject) { 
			final TransferLogPo transferLogPo = new TransferLogPo(); 
			transferLogPo.setTransIdenId(dataObject.getString(TransferLogPo.COLUMNS.TRANS_IDEN_ID.name())); 
			transferLogPo.setSysCode(dataObject.getString(TransferLogPo.COLUMNS.SYS_CODE.name())); 
			transferLogPo.setIp(dataObject.getString(TransferLogPo.COLUMNS.IP.name())); 
			transferLogPo.setFoodRegNum(dataObject.getString(TransferLogPo.COLUMNS.FOOD_REG_NUM.name())); 
			transferLogPo.setUserId(dataObject.getString(TransferLogPo.COLUMNS.USER_ID.name())); 
			transferLogPo.setDestInfo(dataObject.getString(TransferLogPo.COLUMNS.DEST_INFO.name())); 
			transferLogPo.setTranMode(dataObject.getString(TransferLogPo.COLUMNS.TRAN_MODE.name())); 
			transferLogPo.setTranTime(TimestampUtils.of(dataObject.getValue(TransferLogPo.COLUMNS.TRAN_TIME.name()))); 
			transferLogPo.setStatus(dataObject.getString(TransferLogPo.COLUMNS.STATUS.name())); 
			transferLogPo.setSavePath(dataObject.getString(TransferLogPo.COLUMNS.SAVE_PATH.name())); 
			transferLogPo.setSaveName(dataObject.getString(TransferLogPo.COLUMNS.SAVE_NAME.name())); 
			transferLogPo.setFileName(dataObject.getString(TransferLogPo.COLUMNS.FILE_NAME.name())); 
			transferLogPo.setReason(dataObject.getString(TransferLogPo.COLUMNS.REASON.name())); 
			transferLogPo.setDataProcessNumber(dataObject.getString(TransferLogPo.COLUMNS.DATA_PROCESS_NUMBER.name())); 
			transferLogPo.setBan(dataObject.getString(TransferLogPo.COLUMNS.BAN.name())); 
			return transferLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TransferLogPo transferLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TransferLogPo.COLUMNS.TRANS_IDEN_ID.name(), transferLogPo.getTransIdenId()); 
			dataObject.setValue(TransferLogPo.COLUMNS.SYS_CODE.name(), transferLogPo.getSysCode()); 
			dataObject.setValue(TransferLogPo.COLUMNS.IP.name(), transferLogPo.getIp()); 
			dataObject.setValue(TransferLogPo.COLUMNS.FOOD_REG_NUM.name(), transferLogPo.getFoodRegNum()); 
			dataObject.setValue(TransferLogPo.COLUMNS.USER_ID.name(), transferLogPo.getUserId()); 
			dataObject.setValue(TransferLogPo.COLUMNS.DEST_INFO.name(), transferLogPo.getDestInfo()); 
			dataObject.setValue(TransferLogPo.COLUMNS.TRAN_MODE.name(), transferLogPo.getTranMode()); 
			dataObject.setValue(TransferLogPo.COLUMNS.TRAN_TIME.name(), transferLogPo.getTranTime()); 
			dataObject.setValue(TransferLogPo.COLUMNS.STATUS.name(), transferLogPo.getStatus()); 
			dataObject.setValue(TransferLogPo.COLUMNS.SAVE_PATH.name(), transferLogPo.getSavePath()); 
			dataObject.setValue(TransferLogPo.COLUMNS.SAVE_NAME.name(), transferLogPo.getSaveName()); 
			dataObject.setValue(TransferLogPo.COLUMNS.FILE_NAME.name(), transferLogPo.getFileName()); 
			dataObject.setValue(TransferLogPo.COLUMNS.REASON.name(), transferLogPo.getReason()); 
			dataObject.setValue(TransferLogPo.COLUMNS.DATA_PROCESS_NUMBER.name(), transferLogPo.getDataProcessNumber()); 
			dataObject.setValue(TransferLogPo.COLUMNS.BAN.name(), transferLogPo.getBan()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TransferLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TransferLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
