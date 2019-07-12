package com.doc.common.dao.impl; 
 
public class RlsqueDAOImpl extends GeneralDAOImpl<RlsqueDo> implements RlsqueDAOImpl { 
	public static final RlsqueDAOImpl INSTANCE = new RlsqueDAOImpl(); 
	public static final String TABLENAME = "RLSQUE"; 

	public RlsqueDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<RlsqueDo> CONVERTER = new MapConverter<RlsqueDo>() { 
 
		@Override 
		public RlsqueDo convert(final DataObject dataObject) { 
			final RlsqueDo rlsqueDo = new RlsqueDo(); 
			rlsqueDo.setDeclNo(dataObject.getString(RlsqueDo.COLUMNS.DECL_NO.name())); 
			rlsqueDo.setRlsDate(CommUtils.objConver2Time(dataObject.getString(RlsqueDo.COLUMNS.RLS_DATE.name()))); 
			rlsqueDo.setTransId(dataObject.getString(RlsqueDo.COLUMNS.TRANS_ID.name())); 
			rlsqueDo.setErrType(dataObject.getString(RlsqueDo.COLUMNS.ERR_TYPE.name())); 
			rlsqueDo.setRsn(dataObject.getString(RlsqueDo.COLUMNS.RSN.name())); 
			rlsqueDo.setLogDatm(dataObject.getString(RlsqueDo.COLUMNS.LOG_DATM.name())); 
			return rlsqueDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final RlsqueDo rlsqueDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(RlsqueDo.COLUMNS.DECL_NO.name(), rlsqueDo.getDeclNo()); 
			dataObject.setValue(RlsqueDo.COLUMNS.RLS_DATE.name(), rlsqueDo.getRlsDate()); 
			dataObject.setValue(RlsqueDo.COLUMNS.TRANS_ID.name(), rlsqueDo.getTransId()); 
			dataObject.setValue(RlsqueDo.COLUMNS.ERR_TYPE.name(), rlsqueDo.getErrType()); 
			dataObject.setValue(RlsqueDo.COLUMNS.RSN.name(), rlsqueDo.getRsn()); 
			dataObject.setValue(RlsqueDo.COLUMNS.LOG_DATM.name(), rlsqueDo.getLogDatm()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<RlsqueDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(RlsqueDo po) { 
	} 
 
} 
