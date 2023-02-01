package com.doc.common.dao.impl; 
 
public class SendlogDAOImpl extends GeneralDAOImpl<SendlogPo> implements SendlogDAO { 
	public static final SendlogDAOImpl INSTANCE = new SendlogDAOImpl(); 
	public static final String TABLENAME = "SENDLOG"; 

	public SendlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SendlogPo> CONVERTER = new MapConverter<SendlogPo>() { 
 
		@Override 
		public SendlogPo convert(final DataObject dataObject) { 
			final SendlogPo sendlogPo = new SendlogPo(); 
			sendlogPo.setBfNo(dataObject.getString(SendlogPo.COLUMNS.BF_NO.name())); 
			sendlogPo.setDeclNo(dataObject.getString(SendlogPo.COLUMNS.DECL_NO.name())); 
			sendlogPo.setStrType(dataObject.getString(SendlogPo.COLUMNS.STR_TYPE.name())); 
			sendlogPo.setSendFlag(dataObject.getString(SendlogPo.COLUMNS.SEND_FLAG.name())); 
			sendlogPo.setControlNo(dataObject.getString(SendlogPo.COLUMNS.CONTROL_NO.name())); 
			sendlogPo.setSendTime(dataObject.getString(SendlogPo.COLUMNS.SEND_TIME.name())); 
			sendlogPo.setMsgFun(dataObject.getString(SendlogPo.COLUMNS.MSG_FUN.name())); 
			sendlogPo.setMsgType(dataObject.getString(SendlogPo.COLUMNS.MSG_TYPE.name())); 
			sendlogPo.setAsType(dataObject.getString(SendlogPo.COLUMNS.AS_TYPE.name())); 
			sendlogPo.setIoType(dataObject.getString(SendlogPo.COLUMNS.IO_TYPE.name())); 
			sendlogPo.setDeclSeqNo(BigDecimalUtils.formObj(dataObject.getValue(SendlogPo.COLUMNS.DECL_SEQ_NO.name()))); 
			sendlogPo.setMawbNo(dataObject.getString(SendlogPo.COLUMNS.MAWB_NO.name())); 
			sendlogPo.setHawbNo(dataObject.getString(SendlogPo.COLUMNS.HAWB_NO.name())); 
			return sendlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SendlogPo sendlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SendlogPo.COLUMNS.BF_NO.name(), sendlogPo.getBfNo()); 
			dataObject.setValue(SendlogPo.COLUMNS.DECL_NO.name(), sendlogPo.getDeclNo()); 
			dataObject.setValue(SendlogPo.COLUMNS.STR_TYPE.name(), sendlogPo.getStrType()); 
			dataObject.setValue(SendlogPo.COLUMNS.SEND_FLAG.name(), sendlogPo.getSendFlag()); 
			dataObject.setValue(SendlogPo.COLUMNS.CONTROL_NO.name(), sendlogPo.getControlNo()); 
			dataObject.setValue(SendlogPo.COLUMNS.SEND_TIME.name(), sendlogPo.getSendTime()); 
			dataObject.setValue(SendlogPo.COLUMNS.MSG_FUN.name(), sendlogPo.getMsgFun()); 
			dataObject.setValue(SendlogPo.COLUMNS.MSG_TYPE.name(), sendlogPo.getMsgType()); 
			dataObject.setValue(SendlogPo.COLUMNS.AS_TYPE.name(), sendlogPo.getAsType()); 
			dataObject.setValue(SendlogPo.COLUMNS.IO_TYPE.name(), sendlogPo.getIoType()); 
			dataObject.setValue(SendlogPo.COLUMNS.DECL_SEQ_NO.name(), sendlogPo.getDeclSeqNo()); 
			dataObject.setValue(SendlogPo.COLUMNS.MAWB_NO.name(), sendlogPo.getMawbNo()); 
			dataObject.setValue(SendlogPo.COLUMNS.HAWB_NO.name(), sendlogPo.getHawbNo()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SendlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SendlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
