package com.doc.common.dao.impl; 
 
public class CpgSettingDAOImpl extends GeneralDAOImpl<CpgSettingPo> implements CpgSettingDAO { 
	public static final CpgSettingDAOImpl INSTANCE = new CpgSettingDAOImpl(); 
	public static final String TABLENAME = "CPG_SETTING"; 

	public CpgSettingDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<CpgSettingPo> CONVERTER = new MapConverter<CpgSettingPo>() { 
 
		@Override 
		public CpgSettingPo convert(final DataObject dataObject) { 
			final CpgSettingPo cpgSettingPo = new CpgSettingPo(); 
			cpgSettingPo.setPostspecialaccount(dataObject.getString(CpgSettingPo.COLUMNS.POSTSPECIALACCOUNT.name())); 
			cpgSettingPo.setHost(dataObject.getString(CpgSettingPo.COLUMNS.HOST.name())); 
			cpgSettingPo.setUserid(dataObject.getString(CpgSettingPo.COLUMNS.USERID.name())); 
			cpgSettingPo.setPwd(dataObject.getString(CpgSettingPo.COLUMNS.PWD.name())); 
			cpgSettingPo.setPort(dataObject.getString(CpgSettingPo.COLUMNS.PORT.name())); 
			cpgSettingPo.setRcvId(dataObject.getString(CpgSettingPo.COLUMNS.RCV_ID.name())); 
			cpgSettingPo.setBfNo(dataObject.getString(CpgSettingPo.COLUMNS.BF_NO.name())); 
			cpgSettingPo.setMessagetype(dataObject.getString(CpgSettingPo.COLUMNS.MESSAGETYPE.name())); 
			cpgSettingPo.setSendFtpPath(dataObject.getString(CpgSettingPo.COLUMNS.SEND_FTP_PATH.name())); 
			cpgSettingPo.setGetFtpPath(dataObject.getString(CpgSettingPo.COLUMNS.GET_FTP_PATH.name())); 
			return cpgSettingPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final CpgSettingPo cpgSettingPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(CpgSettingPo.COLUMNS.POSTSPECIALACCOUNT.name(), cpgSettingPo.getPostspecialaccount()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.HOST.name(), cpgSettingPo.getHost()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.USERID.name(), cpgSettingPo.getUserid()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.PWD.name(), cpgSettingPo.getPwd()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.PORT.name(), cpgSettingPo.getPort()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.RCV_ID.name(), cpgSettingPo.getRcvId()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.BF_NO.name(), cpgSettingPo.getBfNo()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.MESSAGETYPE.name(), cpgSettingPo.getMessagetype()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.SEND_FTP_PATH.name(), cpgSettingPo.getSendFtpPath()); 
			dataObject.setValue(CpgSettingPo.COLUMNS.GET_FTP_PATH.name(), cpgSettingPo.getGetFtpPath()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<CpgSettingPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(CpgSettingPo po) { 
		SqlWhere sqlWhere = new SqlWhere(); 
		sqlWhere.add(CpgSettingPo.COLUMNS.POSTSPECIALACCOUNT.name(), po.getPostspecialaccount()); 
		return sqlWhere; 
	} 
 
} 
