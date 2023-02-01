package com.doc.common.dao.impl; 
 
public class ExpbagnologDAOImpl extends GeneralDAOImpl<ExpbagnologPo> implements ExpbagnologDAO { 
	public static final ExpbagnologDAOImpl INSTANCE = new ExpbagnologDAOImpl(); 
	public static final String TABLENAME = "EXPBAGNOLOG"; 

	public ExpbagnologDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<ExpbagnologPo> CONVERTER = new MapConverter<ExpbagnologPo>() { 
 
		@Override 
		public ExpbagnologPo convert(final DataObject dataObject) { 
			final ExpbagnologPo expbagnologPo = new ExpbagnologPo(); 
			expbagnologPo.setMwb(dataObject.getString(ExpbagnologPo.COLUMNS.MWB.name())); 
			expbagnologPo.setHwb(dataObject.getString(ExpbagnologPo.COLUMNS.HWB.name())); 
			expbagnologPo.setMsg(dataObject.getString(ExpbagnologPo.COLUMNS.MSG.name())); 
			expbagnologPo.setLogdate(TimestampUtils.of(dataObject.getValue(ExpbagnologPo.COLUMNS.LOGDATE.name()))); 
			return expbagnologPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final ExpbagnologPo expbagnologPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(ExpbagnologPo.COLUMNS.MWB.name(), expbagnologPo.getMwb()); 
			dataObject.setValue(ExpbagnologPo.COLUMNS.HWB.name(), expbagnologPo.getHwb()); 
			dataObject.setValue(ExpbagnologPo.COLUMNS.MSG.name(), expbagnologPo.getMsg()); 
			dataObject.setValue(ExpbagnologPo.COLUMNS.LOGDATE.name(), expbagnologPo.getLogdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<ExpbagnologPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(ExpbagnologPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
