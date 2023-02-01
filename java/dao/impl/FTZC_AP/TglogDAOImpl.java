package com.doc.common.dao.impl; 
 
public class TglogDAOImpl extends GeneralDAOImpl<TglogPo> implements TglogDAO { 
	public static final TglogDAOImpl INSTANCE = new TglogDAOImpl(); 
	public static final String TABLENAME = "TGLOG"; 

	public TglogDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TglogPo> CONVERTER = new MapConverter<TglogPo>() { 
 
		@Override 
		public TglogPo convert(final DataObject dataObject) { 
			final TglogPo tglogPo = new TglogPo(); 
			tglogPo.setLogPgm(dataObject.getString(TglogPo.COLUMNS.LOG_PGM.name())); 
			tglogPo.setLogAction(dataObject.getString(TglogPo.COLUMNS.LOG_ACTION.name())); 
			tglogPo.setLogError(dataObject.getString(TglogPo.COLUMNS.LOG_ERROR.name())); 
			tglogPo.setLogDatm(dataObject.getString(TglogPo.COLUMNS.LOG_DATM.name())); 
			tglogPo.setLog1(dataObject.getString(TglogPo.COLUMNS.LOG1.name())); 
			tglogPo.setLog2(dataObject.getString(TglogPo.COLUMNS.LOG2.name())); 
			tglogPo.setLog3(dataObject.getString(TglogPo.COLUMNS.LOG3.name())); 
			return tglogPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TglogPo tglogPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TglogPo.COLUMNS.LOG_PGM.name(), tglogPo.getLogPgm()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG_ACTION.name(), tglogPo.getLogAction()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG_ERROR.name(), tglogPo.getLogError()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG_DATM.name(), tglogPo.getLogDatm()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG1.name(), tglogPo.getLog1()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG2.name(), tglogPo.getLog2()); 
			dataObject.setValue(TglogPo.COLUMNS.LOG3.name(), tglogPo.getLog3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TglogPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TglogPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
