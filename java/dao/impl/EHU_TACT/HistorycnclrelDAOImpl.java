package com.doc.common.dao.impl; 
 
public class HistorycnclrelDAOImpl extends GeneralDAOImpl<HistorycnclrelPo> implements HistorycnclrelDAO { 
	public static final HistorycnclrelDAOImpl INSTANCE = new HistorycnclrelDAOImpl(); 
	public static final String TABLENAME = "HISTORYCNCLREL"; 

	public HistorycnclrelDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<HistorycnclrelPo> CONVERTER = new MapConverter<HistorycnclrelPo>() { 
 
		@Override 
		public HistorycnclrelPo convert(final DataObject dataObject) { 
			final HistorycnclrelPo historycnclrelPo = new HistorycnclrelPo(); 
			historycnclrelPo.setHwb(dataObject.getString(HistorycnclrelPo.COLUMNS.HWB.name())); 
			historycnclrelPo.setMwb(dataObject.getString(HistorycnclrelPo.COLUMNS.MWB.name())); 
			historycnclrelPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(HistorycnclrelPo.COLUMNS.SERIALNO.name()))); 
			historycnclrelPo.setLogdate(TimestampUtils.of(dataObject.getValue(HistorycnclrelPo.COLUMNS.LOGDATE.name()))); 
			historycnclrelPo.setMark(dataObject.getString(HistorycnclrelPo.COLUMNS.MARK.name())); 
			return historycnclrelPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final HistorycnclrelPo historycnclrelPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(HistorycnclrelPo.COLUMNS.HWB.name(), historycnclrelPo.getHwb()); 
			dataObject.setValue(HistorycnclrelPo.COLUMNS.MWB.name(), historycnclrelPo.getMwb()); 
			dataObject.setValue(HistorycnclrelPo.COLUMNS.SERIALNO.name(), historycnclrelPo.getSerialno()); 
			dataObject.setValue(HistorycnclrelPo.COLUMNS.LOGDATE.name(), historycnclrelPo.getLogdate()); 
			dataObject.setValue(HistorycnclrelPo.COLUMNS.MARK.name(), historycnclrelPo.getMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<HistorycnclrelPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(HistorycnclrelPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
