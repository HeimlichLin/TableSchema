package com.doc.common.dao.impl; 
 
public class TempdailysumBackupDAOImpl extends GeneralDAOImpl<TempdailysumBackupPo> implements TempdailysumBackupDAO { 
	public static final TempdailysumBackupDAOImpl INSTANCE = new TempdailysumBackupDAOImpl(); 
	public static final String TABLENAME = "TEMPDAILYSUM_BACKUP"; 

	public TempdailysumBackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<TempdailysumBackupPo> CONVERTER = new MapConverter<TempdailysumBackupPo>() { 
 
		@Override 
		public TempdailysumBackupPo convert(final DataObject dataObject) { 
			final TempdailysumBackupPo tempdailysumBackupPo = new TempdailysumBackupPo(); 
			tempdailysumBackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(TempdailysumBackupPo.COLUMNS.CHARGEDATE.name()))); 
			tempdailysumBackupPo.setChargebox(dataObject.getString(TempdailysumBackupPo.COLUMNS.CHARGEBOX.name())); 
			tempdailysumBackupPo.setAirlineid(dataObject.getString(TempdailysumBackupPo.COLUMNS.AIRLINEID.name())); 
			tempdailysumBackupPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.EXPORTHWB.name()))); 
			tempdailysumBackupPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.EXPORTPIECE.name()))); 
			tempdailysumBackupPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.EXPORTWEIGHT.name()))); 
			tempdailysumBackupPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.EXPORTFEE.name()))); 
			tempdailysumBackupPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.IMPORTHWB.name()))); 
			tempdailysumBackupPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.IMPORTPIECE.name()))); 
			tempdailysumBackupPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.IMPORTWEIGHT.name()))); 
			tempdailysumBackupPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(TempdailysumBackupPo.COLUMNS.IMPORTFEE.name()))); 
			tempdailysumBackupPo.setLastupdate(TimestampUtils.of(dataObject.getValue(TempdailysumBackupPo.COLUMNS.LASTUPDATE.name()))); 
			tempdailysumBackupPo.setFrozen(dataObject.getString(TempdailysumBackupPo.COLUMNS.FROZEN.name())); 
			tempdailysumBackupPo.setExpressid(dataObject.getString(TempdailysumBackupPo.COLUMNS.EXPRESSID.name())); 
			tempdailysumBackupPo.setWorkarea(dataObject.getString(TempdailysumBackupPo.COLUMNS.WORKAREA.name())); 
			return tempdailysumBackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final TempdailysumBackupPo tempdailysumBackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.CHARGEDATE.name(), tempdailysumBackupPo.getChargedate()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.CHARGEBOX.name(), tempdailysumBackupPo.getChargebox()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.AIRLINEID.name(), tempdailysumBackupPo.getAirlineid()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.EXPORTHWB.name(), tempdailysumBackupPo.getExporthwb()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.EXPORTPIECE.name(), tempdailysumBackupPo.getExportpiece()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.EXPORTWEIGHT.name(), tempdailysumBackupPo.getExportweight()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.EXPORTFEE.name(), tempdailysumBackupPo.getExportfee()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.IMPORTHWB.name(), tempdailysumBackupPo.getImporthwb()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.IMPORTPIECE.name(), tempdailysumBackupPo.getImportpiece()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.IMPORTWEIGHT.name(), tempdailysumBackupPo.getImportweight()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.IMPORTFEE.name(), tempdailysumBackupPo.getImportfee()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.LASTUPDATE.name(), tempdailysumBackupPo.getLastupdate()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.FROZEN.name(), tempdailysumBackupPo.getFrozen()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.EXPRESSID.name(), tempdailysumBackupPo.getExpressid()); 
			dataObject.setValue(TempdailysumBackupPo.COLUMNS.WORKAREA.name(), tempdailysumBackupPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<TempdailysumBackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(TempdailysumBackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
