package com.doc.common.dao.impl; 
 
public class SendlogDAO extends GeneralDAOImpl<SendlogDo> implements SendlogDAO { 
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
		sqlWhere.add(SendlogDo.COLUMNS.BONDNO.name(), po.getBondno()); 
		sqlWhere.add(SendlogDo.COLUMNS.DECLNO.name(), po.getDeclno()); 
		sqlWhere.add(SendlogDo.COLUMNS.STRTYPE.name(), po.getStrtype()); 
		sqlWhere.add(SendlogDo.COLUMNS.SENDFLAG.name(), po.getSendflag()); 
		sqlWhere.add(SendlogDo.COLUMNS.CONTROLNO.name(), po.getControlno()); 
		sqlWhere.add(SendlogDo.COLUMNS.SENDTIME.name(), po.getSendtime()); 
		sqlWhere.add(SendlogDo.COLUMNS.MSGFUN.name(), po.getMsgfun()); 
		sqlWhere.add(SendlogDo.COLUMNS.MSGTYPE.name(), po.getMsgtype()); 
		sqlWhere.add(SendlogDo.COLUMNS.ASTYPE.name(), po.getAstype()); 
	} 
 
} 
