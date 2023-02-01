package com.doc.common.dao.impl; 
 
public class ProcLogDAOImpl extends GeneralDAOImpl<ProcLogPo> implements ProcLogDAO { 
	public static final ProcLogDAOImpl INSTANCE = new ProcLogDAOImpl(); 
	public static final String TABLENAME = "PROC_LOG"; 

	public ProcLogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ProcLogPo> CONVERTER = new MapConverter<ProcLogPo>() { 
 
		@Override 
		public ProcLogPo convert(final DataObject dataObject) { 
			final ProcLogPo procLogPo = new ProcLogPo(); 
			procLogPo.setProgrameId(dataObject.getString(ProcLogPo.COLUMNS.PROGRAME_ID.name())); 
			procLogPo.setStatus(dataObject.getString(ProcLogPo.COLUMNS.STATUS.name())); 
			procLogPo.setMesssage(dataObject.getString(ProcLogPo.COLUMNS.MESSSAGE.name())); 
			procLogPo.setYyyymmdd(dataObject.getString(ProcLogPo.COLUMNS.YYYYMMDD.name())); 
			procLogPo.setHhmmss(dataObject.getString(ProcLogPo.COLUMNS.HHMMSS.name())); 
			procLogPo.setMethod(dataObject.getString(ProcLogPo.COLUMNS.METHOD.name())); 
			procLogPo.setLine(dataObject.getString(ProcLogPo.COLUMNS.LINE.name())); 
			procLogPo.setIp(dataObject.getString(ProcLogPo.COLUMNS.IP.name())); 
			procLogPo.setStacktrace(dataObject.getString(ProcLogPo.COLUMNS.STACKTRACE.name())); 
			return procLogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ProcLogPo procLogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ProcLogPo.COLUMNS.PROGRAME_ID.name(), procLogPo.getProgrameId()); 
			dataObject.setValue(ProcLogPo.COLUMNS.STATUS.name(), procLogPo.getStatus()); 
			dataObject.setValue(ProcLogPo.COLUMNS.MESSSAGE.name(), procLogPo.getMesssage()); 
			dataObject.setValue(ProcLogPo.COLUMNS.YYYYMMDD.name(), procLogPo.getYyyymmdd()); 
			dataObject.setValue(ProcLogPo.COLUMNS.HHMMSS.name(), procLogPo.getHhmmss()); 
			dataObject.setValue(ProcLogPo.COLUMNS.METHOD.name(), procLogPo.getMethod()); 
			dataObject.setValue(ProcLogPo.COLUMNS.LINE.name(), procLogPo.getLine()); 
			dataObject.setValue(ProcLogPo.COLUMNS.IP.name(), procLogPo.getIp()); 
			dataObject.setValue(ProcLogPo.COLUMNS.STACKTRACE.name(), procLogPo.getStacktrace()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ProcLogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ProcLogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
