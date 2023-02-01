package com.doc.common.dao.impl; 
 
public class SysMsgDAOImpl extends GeneralDAOImpl<SysMsgPo> implements SysMsgDAO { 
	public static final SysMsgDAOImpl INSTANCE = new SysMsgDAOImpl(); 
	public static final String TABLENAME = "SYS_MSG"; 

	public SysMsgDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<SysMsgPo> CONVERTER = new MapConverter<SysMsgPo>() { 
 
		@Override 
		public SysMsgPo convert(final DataObject dataObject) { 
			final SysMsgPo sysMsgPo = new SysMsgPo(); 
			sysMsgPo.setMsgId(dataObject.getString(SysMsgPo.COLUMNS.MSG_ID.name())); 
			sysMsgPo.setMsgType(dataObject.getString(SysMsgPo.COLUMNS.MSG_TYPE.name())); 
			sysMsgPo.setDevToken(dataObject.getString(SysMsgPo.COLUMNS.DEV_TOKEN.name())); 
			sysMsgPo.setMsgTitle(dataObject.getString(SysMsgPo.COLUMNS.MSG_TITLE.name())); 
			sysMsgPo.setMsgContent(dataObject.getString(SysMsgPo.COLUMNS.MSG_CONTENT.name())); 
			sysMsgPo.setSendFlag(dataObject.getString(SysMsgPo.COLUMNS.SEND_FLAG.name())); 
			return sysMsgPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final SysMsgPo sysMsgPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(SysMsgPo.COLUMNS.MSG_ID.name(), sysMsgPo.getMsgId()); 
			dataObject.setValue(SysMsgPo.COLUMNS.MSG_TYPE.name(), sysMsgPo.getMsgType()); 
			dataObject.setValue(SysMsgPo.COLUMNS.DEV_TOKEN.name(), sysMsgPo.getDevToken()); 
			dataObject.setValue(SysMsgPo.COLUMNS.MSG_TITLE.name(), sysMsgPo.getMsgTitle()); 
			dataObject.setValue(SysMsgPo.COLUMNS.MSG_CONTENT.name(), sysMsgPo.getMsgContent()); 
			dataObject.setValue(SysMsgPo.COLUMNS.SEND_FLAG.name(), sysMsgPo.getSendFlag()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<SysMsgPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(SysMsgPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
