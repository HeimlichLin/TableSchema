package com.doc.common.dao.impl; 
 
public class MessageTmpDAOImpl extends GeneralDAOImpl<MessageTmpDo> implements MessageTmpDAOImpl { 
	public static final MessageTmpDAOImpl INSTANCE = new MessageTmpDAOImpl(); 
	public static final String TABLENAME = "MESSAGE_TMP"; 

	public MessageTmpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<MessageTmpDo> CONVERTER = new MapConverter<MessageTmpDo>() { 
 
		@Override 
		public MessageTmpDo convert(final DataObject dataObject) { 
			final MessageTmpDo messageTmpDo = new MessageTmpDo(); 
			messageTmpDo.setBfNo(dataObject.getString(MessageTmpDo.COLUMNS.BF_NO.name())); 
			messageTmpDo.setControlNo(dataObject.getString(MessageTmpDo.COLUMNS.CONTROL_NO.name())); 
			messageTmpDo.setSerialNo(BigDecimalUtils.formObj(dataObject.getString(MessageTmpDo.COLUMNS.SERIAL_NO.name()))); 
			messageTmpDo.setTime(CommUtils.objConver2Time(dataObject.getString(MessageTmpDo.COLUMNS.TIME.name()))); 
			messageTmpDo.setMsgType(dataObject.getString(MessageTmpDo.COLUMNS.MSG_TYPE.name())); 
			messageTmpDo.setStatus(dataObject.getString(MessageTmpDo.COLUMNS.STATUS.name())); 
			messageTmpDo.setDealfinishTime(CommUtils.objConver2Time(dataObject.getString(MessageTmpDo.COLUMNS.DEALFINISH_TIME.name()))); 
			return messageTmpDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MessageTmpDo messageTmpDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MessageTmpDo.COLUMNS.BF_NO.name(), messageTmpDo.getBfNo()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.CONTROL_NO.name(), messageTmpDo.getControlNo()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.SERIAL_NO.name(), messageTmpDo.getSerialNo()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.TIME.name(), messageTmpDo.getTime()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.MSG_TYPE.name(), messageTmpDo.getMsgType()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.STATUS.name(), messageTmpDo.getStatus()); 
			dataObject.setValue(MessageTmpDo.COLUMNS.DEALFINISH_TIME.name(), messageTmpDo.getDealfinishTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MessageTmpDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MessageTmpDo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		return sqlWhere; 
	} 
 
} 
