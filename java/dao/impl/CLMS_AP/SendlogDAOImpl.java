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
			sendlogPo.setBondno(dataObject.getString(SendlogPo.COLUMNS.BONDNO.name())); 
			sendlogPo.setDeclno(dataObject.getString(SendlogPo.COLUMNS.DECLNO.name())); 
			sendlogPo.setStrtype(dataObject.getString(SendlogPo.COLUMNS.STRTYPE.name())); 
			sendlogPo.setSendflag(dataObject.getString(SendlogPo.COLUMNS.SENDFLAG.name())); 
			sendlogPo.setControlno(dataObject.getString(SendlogPo.COLUMNS.CONTROLNO.name())); 
			sendlogPo.setSendtime(TimestampUtils.of(dataObject.getValue(SendlogPo.COLUMNS.SENDTIME.name()))); 
			sendlogPo.setMsgfun(dataObject.getString(SendlogPo.COLUMNS.MSGFUN.name())); 
			sendlogPo.setMsgtype(dataObject.getString(SendlogPo.COLUMNS.MSGTYPE.name())); 
			sendlogPo.setAstype(dataObject.getString(SendlogPo.COLUMNS.ASTYPE.name())); 
			return sendlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SendlogPo sendlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SendlogPo.COLUMNS.BONDNO.name(), sendlogPo.getBondno()); 
			dataObject.setValue(SendlogPo.COLUMNS.DECLNO.name(), sendlogPo.getDeclno()); 
			dataObject.setValue(SendlogPo.COLUMNS.STRTYPE.name(), sendlogPo.getStrtype()); 
			dataObject.setValue(SendlogPo.COLUMNS.SENDFLAG.name(), sendlogPo.getSendflag()); 
			dataObject.setValue(SendlogPo.COLUMNS.CONTROLNO.name(), sendlogPo.getControlno()); 
			dataObject.setValue(SendlogPo.COLUMNS.SENDTIME.name(), sendlogPo.getSendtime()); 
			dataObject.setValue(SendlogPo.COLUMNS.MSGFUN.name(), sendlogPo.getMsgfun()); 
			dataObject.setValue(SendlogPo.COLUMNS.MSGTYPE.name(), sendlogPo.getMsgtype()); 
			dataObject.setValue(SendlogPo.COLUMNS.ASTYPE.name(), sendlogPo.getAstype()); 
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
