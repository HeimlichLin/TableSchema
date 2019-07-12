package com.doc.common.dao.impl; 
 
public class TglogDAOImpl extends GeneralDAOImpl<TglogDo> implements TglogDAOImpl { 
	public static final TglogDAOImpl INSTANCE = new TglogDAOImpl(); 
	public static final String TABLENAME = "TGLOG"; 

	public TglogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static MapConverter<TglogDo> CONVERTER = new MapConverter<TglogDo>() { 
 
		@Override 
		public TglogDo convert(final DataObject dataObject) { 
			final TglogDo tglogDo = new TglogDo(); 
			tglogDo.setLogPgm(dataObject.getString(TglogDo.COLUMNS.LOG_PGM.name())); 
			tglogDo.setLogAction(dataObject.getString(TglogDo.COLUMNS.LOG_ACTION.name())); 
			tglogDo.setLogError(dataObject.getString(TglogDo.COLUMNS.LOG_ERROR.name())); 
			tglogDo.setLogDatm(dataObject.getString(TglogDo.COLUMNS.LOG_DATM.name())); 
			tglogDo.setLog1(dataObject.getString(TglogDo.COLUMNS.LOG1.name())); 
			tglogDo.setLog2(dataObject.getString(TglogDo.COLUMNS.LOG2.name())); 
			tglogDo.setLog3(dataObject.getString(TglogDo.COLUMNS.LOG3.name())); 
			return tglogDo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TglogDo tglogDo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TglogDo.COLUMNS.LOG_PGM.name(), tglogDo.getLogPgm()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG_ACTION.name(), tglogDo.getLogAction()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG_ERROR.name(), tglogDo.getLogError()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG_DATM.name(), tglogDo.getLogDatm()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG1.name(), tglogDo.getLog1()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG2.name(), tglogDo.getLog2()); 
			dataObject.setValue(TglogDo.COLUMNS.LOG3.name(), tglogDo.getLog3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TglogDo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TglogDo po) { 
	} 
 
} 
