package com.doc.common.dao.impl; 
 
public class MessageTmpDAOImpl extends GeneralDAOImpl<MessageTmpPo> implements MessageTmpDAO { 
	public static final MessageTmpDAOImpl INSTANCE = new MessageTmpDAOImpl(); 
	public static final String TABLENAME = "MESSAGE_TMP"; 

	public MessageTmpDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MessageTmpPo> CONVERTER = new MapConverter<MessageTmpPo>() { 
 
		@Override 
		public MessageTmpPo convert(final DataObject dataObject) { 
			final MessageTmpPo messageTmpPo = new MessageTmpPo(); 
			messageTmpPo.setBfNo(dataObject.getString(MessageTmpPo.COLUMNS.BF_NO.name())); 
			messageTmpPo.setControlNo(dataObject.getString(MessageTmpPo.COLUMNS.CONTROL_NO.name())); 
			messageTmpPo.setSerialNo(BigDecimalUtils.formObj(dataObject.getValue(MessageTmpPo.COLUMNS.SERIAL_NO.name()))); 
			messageTmpPo.setTime(TimestampUtils.of(dataObject.getValue(MessageTmpPo.COLUMNS.TIME.name()))); 
			messageTmpPo.setMsgType(dataObject.getString(MessageTmpPo.COLUMNS.MSG_TYPE.name())); 
			messageTmpPo.setStatus(dataObject.getString(MessageTmpPo.COLUMNS.STATUS.name())); 
			messageTmpPo.setDealbeginTime(TimestampUtils.of(dataObject.getValue(MessageTmpPo.COLUMNS.DEALBEGIN_TIME.name()))); 
			messageTmpPo.setDealfinishTime(TimestampUtils.of(dataObject.getValue(MessageTmpPo.COLUMNS.DEALFINISH_TIME.name()))); 
			return messageTmpPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MessageTmpPo messageTmpPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MessageTmpPo.COLUMNS.BF_NO.name(), messageTmpPo.getBfNo()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.CONTROL_NO.name(), messageTmpPo.getControlNo()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.SERIAL_NO.name(), messageTmpPo.getSerialNo()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.TIME.name(), messageTmpPo.getTime()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.MSG_TYPE.name(), messageTmpPo.getMsgType()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.STATUS.name(), messageTmpPo.getStatus()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.DEALBEGIN_TIME.name(), messageTmpPo.getDealbeginTime()); 
			dataObject.setValue(MessageTmpPo.COLUMNS.DEALFINISH_TIME.name(), messageTmpPo.getDealfinishTime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MessageTmpPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MessageTmpPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(MessageTmpPo.COLUMNS.BF_NO.name(), po.getBfNo()); 
		sqlWhere.add(MessageTmpPo.COLUMNS.CONTROL_NO.name(), po.getControlNo()); 
		sqlWhere.add(MessageTmpPo.COLUMNS.SERIAL_NO.name(), po.getSerialNo()); 
		sqlWhere.add(MessageTmpPo.COLUMNS.MSG_TYPE.name(), po.getMsgType()); 
		return sqlWhere; 
	} 
 
} 
