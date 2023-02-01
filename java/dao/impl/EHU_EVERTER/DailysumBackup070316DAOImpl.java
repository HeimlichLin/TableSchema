package com.doc.common.dao.impl; 
 
public class DailysumBackup070316DAOImpl extends GeneralDAOImpl<DailysumBackup070316Po> implements DailysumBackup070316DAO { 
	public static final DailysumBackup070316DAOImpl INSTANCE = new DailysumBackup070316DAOImpl(); 
	public static final String TABLENAME = "DAILYSUM_BACKUP070316"; 

	public DailysumBackup070316DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailysumBackup070316Po> CONVERTER = new MapConverter<DailysumBackup070316Po>() { 
 
		@Override 
		public DailysumBackup070316Po convert(final DataObject dataObject) { 
			final DailysumBackup070316Po dailysumBackup070316Po = new DailysumBackup070316Po(); 
			dailysumBackup070316Po.setChargedate(TimestampUtils.of(dataObject.getValue(DailysumBackup070316Po.COLUMNS.CHARGEDATE.name()))); 
			dailysumBackup070316Po.setChargebox(dataObject.getString(DailysumBackup070316Po.COLUMNS.CHARGEBOX.name())); 
			dailysumBackup070316Po.setAirlineid(dataObject.getString(DailysumBackup070316Po.COLUMNS.AIRLINEID.name())); 
			dailysumBackup070316Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.EXPORTHWB.name()))); 
			dailysumBackup070316Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.EXPORTPIECE.name()))); 
			dailysumBackup070316Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysumBackup070316Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.EXPORTFEE.name()))); 
			dailysumBackup070316Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.IMPORTHWB.name()))); 
			dailysumBackup070316Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.IMPORTPIECE.name()))); 
			dailysumBackup070316Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysumBackup070316Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.IMPORTFEE.name()))); 
			dailysumBackup070316Po.setLastupdate(TimestampUtils.of(dataObject.getValue(DailysumBackup070316Po.COLUMNS.LASTUPDATE.name()))); 
			dailysumBackup070316Po.setImportdiscount(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.IMPORTDISCOUNT.name()))); 
			dailysumBackup070316Po.setExportdiscount(BigDecimalUtils.formObj(dataObject.getValue(DailysumBackup070316Po.COLUMNS.EXPORTDISCOUNT.name()))); 
			dailysumBackup070316Po.setExpressid(dataObject.getString(DailysumBackup070316Po.COLUMNS.EXPRESSID.name())); 
			return dailysumBackup070316Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailysumBackup070316Po dailysumBackup070316Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.CHARGEDATE.name(), dailysumBackup070316Po.getChargedate()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.CHARGEBOX.name(), dailysumBackup070316Po.getChargebox()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.AIRLINEID.name(), dailysumBackup070316Po.getAirlineid()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPORTHWB.name(), dailysumBackup070316Po.getExporthwb()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPORTPIECE.name(), dailysumBackup070316Po.getExportpiece()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPORTWEIGHT.name(), dailysumBackup070316Po.getExportweight()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPORTFEE.name(), dailysumBackup070316Po.getExportfee()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.IMPORTHWB.name(), dailysumBackup070316Po.getImporthwb()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.IMPORTPIECE.name(), dailysumBackup070316Po.getImportpiece()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.IMPORTWEIGHT.name(), dailysumBackup070316Po.getImportweight()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.IMPORTFEE.name(), dailysumBackup070316Po.getImportfee()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.LASTUPDATE.name(), dailysumBackup070316Po.getLastupdate()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.IMPORTDISCOUNT.name(), dailysumBackup070316Po.getImportdiscount()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPORTDISCOUNT.name(), dailysumBackup070316Po.getExportdiscount()); 
			dataObject.setValue(DailysumBackup070316Po.COLUMNS.EXPRESSID.name(), dailysumBackup070316Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailysumBackup070316Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailysumBackup070316Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
