package com.doc.common.dao.impl; 
 
public class TimestampDAOImpl extends GeneralDAOImpl<TimestampPo> implements TimestampDAO { 
	public static final TimestampDAOImpl INSTANCE = new TimestampDAOImpl(); 
	public static final String TABLENAME = "TIMESTAMP"; 

	public TimestampDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TimestampPo> CONVERTER = new MapConverter<TimestampPo>() { 
 
		@Override 
		public TimestampPo convert(final DataObject dataObject) { 
			final TimestampPo timestampPo = new TimestampPo(); 
			timestampPo.setBagnodate(TimestampUtils.of(dataObject.getValue(TimestampPo.COLUMNS.BAGNODATE.name()))); 
			timestampPo.setBagno(BigDecimalUtils.formObj(dataObject.getValue(TimestampPo.COLUMNS.BAGNO.name()))); 
			timestampPo.setControlnodate(TimestampUtils.of(dataObject.getValue(TimestampPo.COLUMNS.CONTROLNODATE.name()))); 
			timestampPo.setControlno(BigDecimalUtils.formObj(dataObject.getValue(TimestampPo.COLUMNS.CONTROLNO.name()))); 
			timestampPo.setT5102date(TimestampUtils.of(dataObject.getValue(TimestampPo.COLUMNS.T5102DATE.name()))); 
			timestampPo.setT5102no(BigDecimalUtils.formObj(dataObject.getValue(TimestampPo.COLUMNS.T5102NO.name()))); 
			timestampPo.setT5117date(TimestampUtils.of(dataObject.getValue(TimestampPo.COLUMNS.T5117DATE.name()))); 
			timestampPo.setT5117no(BigDecimalUtils.formObj(dataObject.getValue(TimestampPo.COLUMNS.T5117NO.name()))); 
			timestampPo.setT5201date(TimestampUtils.of(dataObject.getValue(TimestampPo.COLUMNS.T5201DATE.name()))); 
			timestampPo.setT5201no(BigDecimalUtils.formObj(dataObject.getValue(TimestampPo.COLUMNS.T5201NO.name()))); 
			return timestampPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TimestampPo timestampPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TimestampPo.COLUMNS.BAGNODATE.name(), timestampPo.getBagnodate()); 
			dataObject.setValue(TimestampPo.COLUMNS.BAGNO.name(), timestampPo.getBagno()); 
			dataObject.setValue(TimestampPo.COLUMNS.CONTROLNODATE.name(), timestampPo.getControlnodate()); 
			dataObject.setValue(TimestampPo.COLUMNS.CONTROLNO.name(), timestampPo.getControlno()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5102DATE.name(), timestampPo.getT5102date()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5102NO.name(), timestampPo.getT5102no()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5117DATE.name(), timestampPo.getT5117date()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5117NO.name(), timestampPo.getT5117no()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5201DATE.name(), timestampPo.getT5201date()); 
			dataObject.setValue(TimestampPo.COLUMNS.T5201NO.name(), timestampPo.getT5201no()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TimestampPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TimestampPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
