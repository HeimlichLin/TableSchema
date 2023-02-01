package com.doc.common.dao.impl; 
 
public class Logstdby$skipTransactionDAOImpl extends GeneralDAOImpl<Logstdby$skipTransactionPo> implements ILogstdby$skipTransactionDAO { 
	public static final Logstdby$skipTransactionDAOImpl INSTANCE = new Logstdby$skipTransactionDAOImpl(); 
	public static final String TABLENAME = "LOGSTDBY$SKIP_TRANSACTION"; 

	public Logstdby$skipTransactionDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Logstdby$skipTransactionPo> CONVERTER = new MapConverter<Logstdby$skipTransactionPo>() { 
 
		@Override 
		public Logstdby$skipTransactionPo convert(final DataObject dataObject) { 
			final Logstdby$skipTransactionPo logstdby$skipTransactionPo = new Logstdby$skipTransactionPo(); 
			logstdby$skipTransactionPo.setXidusn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.XIDUSN.name()))); 
			logstdby$skipTransactionPo.setXidslt(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.XIDSLT.name()))); 
			logstdby$skipTransactionPo.setXidsqn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.XIDSQN.name()))); 
			logstdby$skipTransactionPo.setActive(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.ACTIVE.name()))); 
			logstdby$skipTransactionPo.setCommitScn(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.COMMIT_SCN.name()))); 
			logstdby$skipTransactionPo.setSpare2(BigDecimalUtils.formObj(dataObject.getValue(Logstdby$skipTransactionPo.COLUMNS.SPARE2.name()))); 
			logstdby$skipTransactionPo.setSpare3(dataObject.getString(Logstdby$skipTransactionPo.COLUMNS.SPARE3.name())); 
			return logstdby$skipTransactionPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final Logstdby$skipTransactionPo logstdby$skipTransactionPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.XIDUSN.name(), logstdby$skipTransactionPo.getXidusn()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.XIDSLT.name(), logstdby$skipTransactionPo.getXidslt()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.XIDSQN.name(), logstdby$skipTransactionPo.getXidsqn()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.ACTIVE.name(), logstdby$skipTransactionPo.getActive()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.COMMIT_SCN.name(), logstdby$skipTransactionPo.getCommitScn()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.SPARE2.name(), logstdby$skipTransactionPo.getSpare2()); 
			dataObject.setValue(Logstdby$skipTransactionPo.COLUMNS.SPARE3.name(), logstdby$skipTransactionPo.getSpare3()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Logstdby$skipTransactionPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Logstdby$skipTransactionPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
