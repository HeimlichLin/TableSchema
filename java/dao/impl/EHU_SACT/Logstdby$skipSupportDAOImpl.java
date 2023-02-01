package com.doc.common.dao.impl; 
 
public class Logstdby$skipSupportDAOImpl extends GeneralDAOImpl<Logstdby$skipSupportPo> implements ILogstdby$skipSupportDAO { 
	public static final Logstdby$skipSupportDAOImpl INSTANCE = new Logstdby$skipSupportDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$SKIP_SUPPORT"; 

	public Logstdby$skipSupportDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$skipSupportPo> CONVERTER = new MapConverter<Logstdby$skipSupportPo>() { 
 
		@Override 
		public Logstdby$skipSupportPo convert(final DataObject dataObject) { 
			final Logstdby$skipSupportPo logstdby$skipSupportPo = new Logstdby$skipSupportPo(); 
			logstdby$skipSupportPo.setAction(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipSupportPo.COLUMNS.ACTION.name()))); 
			logstdby$skipSupportPo.setName(dataObject.getString(Logstdby$skipSupportPo.COLUMNS.NAME.name())); 
			logstdby$skipSupportPo.setReg(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipSupportPo.COLUMNS.REG.name()))); 
			logstdby$skipSupportPo.setSpare1(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipSupportPo.COLUMNS.SPARE1.name()))); 
			logstdby$skipSupportPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipSupportPo.COLUMNS.SPARE2.name()))); 
			logstdby$skipSupportPo.setSpare3(dataObject.getString(Logstdby$skipSupportPo.COLUMNS.SPARE3.name())); 
			return logstdby$skipSupportPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$skipSupportPo logstdby$skipSupportPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.ACTION.name(), logstdby$skipSupportPo.getAction()); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.NAME.name(), logstdby$skipSupportPo.getName()); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.REG.name(), logstdby$skipSupportPo.getReg()); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.SPARE1.name(), logstdby$skipSupportPo.getSpare1()); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.SPARE2.name(), logstdby$skipSupportPo.getSpare2()); 
			dataObject.setValue(Logstdby$skipSupportPo.COLUMNS.SPARE3.name(), logstdby$skipSupportPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$skipSupportPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$skipSupportPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
