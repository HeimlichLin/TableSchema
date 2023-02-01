package com.doc.common.dao.impl; 
 
public class ErrorlogDAOImpl extends GeneralDAOImpl<ErrorlogPo> implements ErrorlogDAO { 
	public static final ErrorlogDAOImpl INSTANCE = new ErrorlogDAOImpl(); 
	public static final String TABLENAME = "ERRORLOG"; 

	public ErrorlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ErrorlogPo> CONVERTER = new MapConverter<ErrorlogPo>() { 
 
		@Override 
		public ErrorlogPo convert(final DataObject dataObject) { 
			final ErrorlogPo errorlogPo = new ErrorlogPo(); 
			errorlogPo.setBondno(dataObject.getString(ErrorlogPo.COLUMNS.BONDNO.name())); 
			errorlogPo.setRefbillno(dataObject.getString(ErrorlogPo.COLUMNS.REFBILLNO.name())); 
			errorlogPo.setStrtype(dataObject.getString(ErrorlogPo.COLUMNS.STRTYPE.name())); 
			errorlogPo.setSendflag(dataObject.getString(ErrorlogPo.COLUMNS.SENDFLAG.name())); 
			errorlogPo.setControlno(dataObject.getString(ErrorlogPo.COLUMNS.CONTROLNO.name())); 
			errorlogPo.setSendtime(TimestampUtils.of(dataObject.getValue(ErrorlogPo.COLUMNS.SENDTIME.name()))); 
			errorlogPo.setNote(dataObject.getString(ErrorlogPo.COLUMNS.NOTE.name())); 
			errorlogPo.setLogtime(TimestampUtils.of(dataObject.getValue(ErrorlogPo.COLUMNS.LOGTIME.name()))); 
			return errorlogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrorlogPo errorlogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrorlogPo.COLUMNS.BONDNO.name(), errorlogPo.getBondno()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.REFBILLNO.name(), errorlogPo.getRefbillno()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.STRTYPE.name(), errorlogPo.getStrtype()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.SENDFLAG.name(), errorlogPo.getSendflag()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.CONTROLNO.name(), errorlogPo.getControlno()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.SENDTIME.name(), errorlogPo.getSendtime()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.NOTE.name(), errorlogPo.getNote()); 
			dataObject.setValue(ErrorlogPo.COLUMNS.LOGTIME.name(), errorlogPo.getLogtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrorlogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrorlogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
