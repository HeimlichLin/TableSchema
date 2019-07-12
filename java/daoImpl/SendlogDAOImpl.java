package com.doc.common.dao.impl; 
 
public class SendlogDAOImpl extends GeneralDAOImpl<SendlogDo> implements SendlogDAOImpl { 
	public static final SendlogDAOImpl INSTANCE = new SendlogDAOImpl(); 
	public static final String TABLENAME = "SENDLOG"; 

	public SendlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<SendlogDo> CONVERTER = new MapConverter<SendlogDo>() { 
 
		@Override 
		public SendlogDo convert(final DataObject dataObject) { 
			final SendlogDo sendlogDo = new SendlogDo(); 
			sendlogDo.setBondno(dataObject.getString(SendlogDo.COLUMNS.BONDNO.name())); 
			sendlogDo.setDeclno(dataObject.getString(SendlogDo.COLUMNS.DECLNO.name())); 
			sendlogDo.setStrtype(dataObject.getString(SendlogDo.COLUMNS.STRTYPE.name())); 
			sendlogDo.setSendflag(dataObject.getString(SendlogDo.COLUMNS.SENDFLAG.name())); 
			sendlogDo.setControlno(dataObject.getString(SendlogDo.COLUMNS.CONTROLNO.name())); 
			sendlogDo.setSendtime(CommUtils.objConver2Time(dataObject.getString(SendlogDo.COLUMNS.SENDTIME.name()))); 
			sendlogDo.setMsgfun(dataObject.getString(SendlogDo.COLUMNS.MSGFUN.name())); 
			sendlogDo.setMsgtype(dataObject.getString(SendlogDo.COLUMNS.MSGTYPE.name())); 
			sendlogDo.setAstype(dataObject.getString(SendlogDo.COLUMNS.ASTYPE.name())); 
			return sendlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SendlogDo sendlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SendlogDo.COLUMNS.BONDNO.name(), sendlogDo.getBondno()); 
			dataObject.setValue(SendlogDo.COLUMNS.DECLNO.name(), sendlogDo.getDeclno()); 
			dataObject.setValue(SendlogDo.COLUMNS.STRTYPE.name(), sendlogDo.getStrtype()); 
			dataObject.setValue(SendlogDo.COLUMNS.SENDFLAG.name(), sendlogDo.getSendflag()); 
			dataObject.setValue(SendlogDo.COLUMNS.CONTROLNO.name(), sendlogDo.getControlno()); 
			dataObject.setValue(SendlogDo.COLUMNS.SENDTIME.name(), sendlogDo.getSendtime()); 
			dataObject.setValue(SendlogDo.COLUMNS.MSGFUN.name(), sendlogDo.getMsgfun()); 
			dataObject.setValue(SendlogDo.COLUMNS.MSGTYPE.name(), sendlogDo.getMsgtype()); 
			dataObject.setValue(SendlogDo.COLUMNS.ASTYPE.name(), sendlogDo.getAstype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SendlogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SendlogDo po) { 
	} 
 
} 
