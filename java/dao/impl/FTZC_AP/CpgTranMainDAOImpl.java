package com.doc.common.dao.impl; 
 
public class CpgTranMainDAOImpl extends GeneralDAOImpl<CpgTranMainPo> implements CpgTranMainDAO { 
	public static final CpgTranMainDAOImpl INSTANCE = new CpgTranMainDAOImpl(); 
	public static final String TABLENAME = "CPG_TRAN_MAIN"; 

	public CpgTranMainDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgTranMainPo> CONVERTER = new MapConverter<CpgTranMainPo>() { 
 
		@Override 
		public CpgTranMainPo convert(final DataObject dataObject) { 
			final CpgTranMainPo cpgTranMainPo = new CpgTranMainPo(); 
			cpgTranMainPo.setFilename(dataObject.getString(CpgTranMainPo.COLUMNS.FILENAME.name())); 
			cpgTranMainPo.setSendflag(dataObject.getString(CpgTranMainPo.COLUMNS.SENDFLAG.name())); 
			cpgTranMainPo.setSendTime(dataObject.getString(CpgTranMainPo.COLUMNS.SEND_TIME.name())); 
			cpgTranMainPo.setMsgfunccode(dataObject.getString(CpgTranMainPo.COLUMNS.MSGFUNCCODE.name())); 
			cpgTranMainPo.setPostspecialaccount(dataObject.getString(CpgTranMainPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			cpgTranMainPo.setMessagetype(dataObject.getString(CpgTranMainPo.COLUMNS.MESSAGETYPE.name())); 
			return cpgTranMainPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgTranMainPo cpgTranMainPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.FILENAME.name(), cpgTranMainPo.getFilename()); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.SENDFLAG.name(), cpgTranMainPo.getSendflag()); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.SEND_TIME.name(), cpgTranMainPo.getSendTime()); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.MSGFUNCCODE.name(), cpgTranMainPo.getMsgfunccode()); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.POSTSPECIALACCOUNT.name(), cpgTranMainPo.getPostspecialaccount()); 
			dataObject.setValue(CpgTranMainPo.COLUMNS.MESSAGETYPE.name(), cpgTranMainPo.getMessagetype()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgTranMainPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgTranMainPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CpgTranMainPo.COLUMNS.FILENAME.name(), po.getFilename()); 
		return sqlWhere; 
	} 
 
} 
