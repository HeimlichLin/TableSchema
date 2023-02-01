package com.doc.common.dao.impl; 
 
public class GcocnclrelDAOImpl extends GeneralDAOImpl<GcocnclrelPo> implements GcocnclrelDAO { 
	public static final GcocnclrelDAOImpl INSTANCE = new GcocnclrelDAOImpl(); 
	public static final String TABLENAME = "GCOCNCLREL"; 

	public GcocnclrelDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcocnclrelPo> CONVERTER = new MapConverter<GcocnclrelPo>() { 
 
		@Override 
		public GcocnclrelPo convert(final DataObject dataObject) { 
			final GcocnclrelPo gcocnclrelPo = new GcocnclrelPo(); 
			gcocnclrelPo.setHwb(dataObject.getString(GcocnclrelPo.COLUMNS.HWB.name())); 
			gcocnclrelPo.setMwb(dataObject.getString(GcocnclrelPo.COLUMNS.MWB.name())); 
			gcocnclrelPo.setSerialno(BigDecimalUtils.formObj(dataObject.getValue(GcocnclrelPo.COLUMNS.SERIALNO.name()))); 
			gcocnclrelPo.setLogdate(TimestampUtils.of(dataObject.getValue(GcocnclrelPo.COLUMNS.LOGDATE.name()))); 
			gcocnclrelPo.setMark(dataObject.getString(GcocnclrelPo.COLUMNS.MARK.name())); 
			return gcocnclrelPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcocnclrelPo gcocnclrelPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcocnclrelPo.COLUMNS.HWB.name(), gcocnclrelPo.getHwb()); 
			dataObject.setValue(GcocnclrelPo.COLUMNS.MWB.name(), gcocnclrelPo.getMwb()); 
			dataObject.setValue(GcocnclrelPo.COLUMNS.SERIALNO.name(), gcocnclrelPo.getSerialno()); 
			dataObject.setValue(GcocnclrelPo.COLUMNS.LOGDATE.name(), gcocnclrelPo.getLogdate()); 
			dataObject.setValue(GcocnclrelPo.COLUMNS.MARK.name(), gcocnclrelPo.getMark()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcocnclrelPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcocnclrelPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
