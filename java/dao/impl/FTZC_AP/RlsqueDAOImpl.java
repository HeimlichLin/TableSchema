package com.doc.common.dao.impl; 
 
public class RlsqueDAOImpl extends GeneralDAOImpl<RlsquePo> implements RlsqueDAO { 
	public static final RlsqueDAOImpl INSTANCE = new RlsqueDAOImpl(); 
	public static final String TABLENAME = "RLSQUE"; 

	public RlsqueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<RlsquePo> CONVERTER = new MapConverter<RlsquePo>() { 
 
		@Override 
		public RlsquePo convert(final DataObject dataObject) { 
			final RlsquePo rlsquePo = new RlsquePo(); 
			rlsquePo.setDeclNo(dataObject.getString(RlsquePo.COLUMNS.DECL_NO.name())); 
			rlsquePo.setRlsDate(TimestampUtils.of(dataObject.getValue(RlsquePo.COLUMNS.RLS_DATE.name()))); 
			rlsquePo.setTransId(dataObject.getString(RlsquePo.COLUMNS.TRANS_ID.name())); 
			rlsquePo.setErrType(dataObject.getString(RlsquePo.COLUMNS.ERR_TYPE.name())); 
			rlsquePo.setRsn(dataObject.getString(RlsquePo.COLUMNS.RSN.name())); 
			rlsquePo.setLogDatm(dataObject.getString(RlsquePo.COLUMNS.LOG_DATM.name())); 
			rlsquePo.setMsgType(dataObject.getString(RlsquePo.COLUMNS.MSG_TYPE.name())); 
			rlsquePo.setAsType(dataObject.getString(RlsquePo.COLUMNS.AS_TYPE.name())); 
			rlsquePo.setIoType(dataObject.getString(RlsquePo.COLUMNS.IO_TYPE.name())); 
			rlsquePo.setMawbNo(dataObject.getString(RlsquePo.COLUMNS.MAWB_NO.name())); 
			rlsquePo.setHawbNo(dataObject.getString(RlsquePo.COLUMNS.HAWB_NO.name())); 
			rlsquePo.setDeclType(dataObject.getString(RlsquePo.COLUMNS.DECL_TYPE.name())); 
			return rlsquePo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RlsquePo rlsquePo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RlsquePo.COLUMNS.DECL_NO.name(), rlsquePo.getDeclNo()); 
			dataObject.setValue(RlsquePo.COLUMNS.RLS_DATE.name(), rlsquePo.getRlsDate()); 
			dataObject.setValue(RlsquePo.COLUMNS.TRANS_ID.name(), rlsquePo.getTransId()); 
			dataObject.setValue(RlsquePo.COLUMNS.ERR_TYPE.name(), rlsquePo.getErrType()); 
			dataObject.setValue(RlsquePo.COLUMNS.RSN.name(), rlsquePo.getRsn()); 
			dataObject.setValue(RlsquePo.COLUMNS.LOG_DATM.name(), rlsquePo.getLogDatm()); 
			dataObject.setValue(RlsquePo.COLUMNS.MSG_TYPE.name(), rlsquePo.getMsgType()); 
			dataObject.setValue(RlsquePo.COLUMNS.AS_TYPE.name(), rlsquePo.getAsType()); 
			dataObject.setValue(RlsquePo.COLUMNS.IO_TYPE.name(), rlsquePo.getIoType()); 
			dataObject.setValue(RlsquePo.COLUMNS.MAWB_NO.name(), rlsquePo.getMawbNo()); 
			dataObject.setValue(RlsquePo.COLUMNS.HAWB_NO.name(), rlsquePo.getHawbNo()); 
			dataObject.setValue(RlsquePo.COLUMNS.DECL_TYPE.name(), rlsquePo.getDeclType()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RlsquePo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RlsquePo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
