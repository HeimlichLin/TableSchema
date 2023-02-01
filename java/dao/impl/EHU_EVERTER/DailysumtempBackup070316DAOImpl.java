package com.doc.common.dao.impl; 
 
public class DailysumtempBackup070316DAOImpl extends GeneralDAOImpl<DailysumtempBackup070316Po> implements DailysumtempBackup070316DAO { 
	public static final DailysumtempBackup070316DAOImpl INSTANCE = new DailysumtempBackup070316DAOImpl(); 
	public static final String TABLENAME = "DAILYSUMTEMP_BACKUP070316"; 

	public DailysumtempBackup070316DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailysumtempBackup070316Po> CONVERTER = new MapConverter<DailysumtempBackup070316Po>() { 
 
		@Override 
		public DailysumtempBackup070316Po convert(final DataObject dataObject) { 
			final DailysumtempBackup070316Po dailysumtempBackup070316Po = new DailysumtempBackup070316Po(); 
			dailysumtempBackup070316Po.setChargedate(TimestampUtils.of(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.CHARGEDATE.name()))); 
			dailysumtempBackup070316Po.setChargebox(dataObject.getString(DailysumtempBackup070316Po.COLUMNS.CHARGEBOX.name())); 
			dailysumtempBackup070316Po.setAirlineid(dataObject.getString(DailysumtempBackup070316Po.COLUMNS.AIRLINEID.name())); 
			dailysumtempBackup070316Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.EXPORTHWB.name()))); 
			dailysumtempBackup070316Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.EXPORTPIECE.name()))); 
			dailysumtempBackup070316Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysumtempBackup070316Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.EXPORTFEE.name()))); 
			dailysumtempBackup070316Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.IMPORTHWB.name()))); 
			dailysumtempBackup070316Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.IMPORTPIECE.name()))); 
			dailysumtempBackup070316Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysumtempBackup070316Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.IMPORTFEE.name()))); 
			dailysumtempBackup070316Po.setLastupdate(TimestampUtils.of(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.LASTUPDATE.name()))); 
			dailysumtempBackup070316Po.setImportdiscount(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.IMPORTDISCOUNT.name()))); 
			dailysumtempBackup070316Po.setExportdiscount(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempBackup070316Po.COLUMNS.EXPORTDISCOUNT.name()))); 
			dailysumtempBackup070316Po.setExpressid(dataObject.getString(DailysumtempBackup070316Po.COLUMNS.EXPRESSID.name())); 
			return dailysumtempBackup070316Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailysumtempBackup070316Po dailysumtempBackup070316Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.CHARGEDATE.name(), dailysumtempBackup070316Po.getChargedate()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.CHARGEBOX.name(), dailysumtempBackup070316Po.getChargebox()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.AIRLINEID.name(), dailysumtempBackup070316Po.getAirlineid()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPORTHWB.name(), dailysumtempBackup070316Po.getExporthwb()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPORTPIECE.name(), dailysumtempBackup070316Po.getExportpiece()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPORTWEIGHT.name(), dailysumtempBackup070316Po.getExportweight()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPORTFEE.name(), dailysumtempBackup070316Po.getExportfee()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.IMPORTHWB.name(), dailysumtempBackup070316Po.getImporthwb()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.IMPORTPIECE.name(), dailysumtempBackup070316Po.getImportpiece()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.IMPORTWEIGHT.name(), dailysumtempBackup070316Po.getImportweight()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.IMPORTFEE.name(), dailysumtempBackup070316Po.getImportfee()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.LASTUPDATE.name(), dailysumtempBackup070316Po.getLastupdate()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.IMPORTDISCOUNT.name(), dailysumtempBackup070316Po.getImportdiscount()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPORTDISCOUNT.name(), dailysumtempBackup070316Po.getExportdiscount()); 
			dataObject.setValue(DailysumtempBackup070316Po.COLUMNS.EXPRESSID.name(), dailysumtempBackup070316Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailysumtempBackup070316Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailysumtempBackup070316Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
