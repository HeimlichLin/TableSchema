package com.doc.common.dao.impl; 
 
public class ErrorlogDAOImpl extends GeneralDAOImpl<ErrorlogDo> implements ErrorlogDAOImpl { 
	public static final ErrorlogDAOImpl INSTANCE = new ErrorlogDAOImpl(); 
	public static final String TABLENAME = "ERRORLOG"; 

	public ErrorlogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<ErrorlogDo> CONVERTER = new MapConverter<ErrorlogDo>() { 
 
		@Override 
		public ErrorlogDo convert(final DataObject dataObject) { 
			final ErrorlogDo errorlogDo = new ErrorlogDo(); 
			errorlogDo.setBondno(dataObject.getString(ErrorlogDo.COLUMNS.BONDNO.name())); 
			errorlogDo.setRefbillno(dataObject.getString(ErrorlogDo.COLUMNS.REFBILLNO.name())); 
			errorlogDo.setStrtype(dataObject.getString(ErrorlogDo.COLUMNS.STRTYPE.name())); 
			errorlogDo.setSendflag(dataObject.getString(ErrorlogDo.COLUMNS.SENDFLAG.name())); 
			errorlogDo.setControlno(dataObject.getString(ErrorlogDo.COLUMNS.CONTROLNO.name())); 
			errorlogDo.setSendtime(CommUtils.objConver2Time(dataObject.getString(ErrorlogDo.COLUMNS.SENDTIME.name()))); 
			errorlogDo.setNote(dataObject.getString(ErrorlogDo.COLUMNS.NOTE.name())); 
			errorlogDo.setLogtime(CommUtils.objConver2Time(dataObject.getString(ErrorlogDo.COLUMNS.LOGTIME.name()))); 
			return errorlogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ErrorlogDo errorlogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ErrorlogDo.COLUMNS.BONDNO.name(), errorlogDo.getBondno()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.REFBILLNO.name(), errorlogDo.getRefbillno()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.STRTYPE.name(), errorlogDo.getStrtype()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.SENDFLAG.name(), errorlogDo.getSendflag()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.CONTROLNO.name(), errorlogDo.getControlno()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.SENDTIME.name(), errorlogDo.getSendtime()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.NOTE.name(), errorlogDo.getNote()); 
			dataObject.setValue(ErrorlogDo.COLUMNS.LOGTIME.name(), errorlogDo.getLogtime()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ErrorlogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ErrorlogDo po) { 
	} 
 
} 
