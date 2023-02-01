package com.doc.common.dao.impl; 
 
public class DailydiscountBackup070316DAOImpl extends GeneralDAOImpl<DailydiscountBackup070316Po> implements DailydiscountBackup070316DAO { 
	public static final DailydiscountBackup070316DAOImpl INSTANCE = new DailydiscountBackup070316DAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNT_BACKUP070316"; 

	public DailydiscountBackup070316DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailydiscountBackup070316Po> CONVERTER = new MapConverter<DailydiscountBackup070316Po>() { 
 
		@Override 
		public DailydiscountBackup070316Po convert(final DataObject dataObject) { 
			final DailydiscountBackup070316Po dailydiscountBackup070316Po = new DailydiscountBackup070316Po(); 
			dailydiscountBackup070316Po.setChargedate(TimestampUtils.of(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.CHARGEDATE.name()))); 
			dailydiscountBackup070316Po.setExpressid(dataObject.getString(DailydiscountBackup070316Po.COLUMNS.EXPRESSID.name())); 
			dailydiscountBackup070316Po.setChargebox(dataObject.getString(DailydiscountBackup070316Po.COLUMNS.CHARGEBOX.name())); 
			dailydiscountBackup070316Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.EXPORTHWB.name()))); 
			dailydiscountBackup070316Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscountBackup070316Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscountBackup070316Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.EXPORTFEE.name()))); 
			dailydiscountBackup070316Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.IMPORTHWB.name()))); 
			dailydiscountBackup070316Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscountBackup070316Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscountBackup070316Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.IMPORTFEE.name()))); 
			dailydiscountBackup070316Po.setLastupdate(TimestampUtils.of(dataObject.getValue(DailydiscountBackup070316Po.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscountBackup070316Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailydiscountBackup070316Po dailydiscountBackup070316Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.CHARGEDATE.name(), dailydiscountBackup070316Po.getChargedate()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.EXPRESSID.name(), dailydiscountBackup070316Po.getExpressid()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.CHARGEBOX.name(), dailydiscountBackup070316Po.getChargebox()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.EXPORTHWB.name(), dailydiscountBackup070316Po.getExporthwb()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.EXPORTPIECE.name(), dailydiscountBackup070316Po.getExportpiece()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.EXPORTWEIGHT.name(), dailydiscountBackup070316Po.getExportweight()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.EXPORTFEE.name(), dailydiscountBackup070316Po.getExportfee()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.IMPORTHWB.name(), dailydiscountBackup070316Po.getImporthwb()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.IMPORTPIECE.name(), dailydiscountBackup070316Po.getImportpiece()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.IMPORTWEIGHT.name(), dailydiscountBackup070316Po.getImportweight()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.IMPORTFEE.name(), dailydiscountBackup070316Po.getImportfee()); 
			dataObject.setValue(DailydiscountBackup070316Po.COLUMNS.LASTUPDATE.name(), dailydiscountBackup070316Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailydiscountBackup070316Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailydiscountBackup070316Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
