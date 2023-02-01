package com.doc.common.dao.impl; 
 
public class DailydiscountBackup080916DAOImpl extends GeneralDAOImpl<DailydiscountBackup080916Po> implements DailydiscountBackup080916DAO { 
	public static final DailydiscountBackup080916DAOImpl INSTANCE = new DailydiscountBackup080916DAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNT_BACKUP080916"; 

	public DailydiscountBackup080916DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailydiscountBackup080916Po> CONVERTER = new MapConverter<DailydiscountBackup080916Po>() { 
 
		@Override 
		public DailydiscountBackup080916Po convert(final DataObject dataObject) { 
			final DailydiscountBackup080916Po dailydiscountBackup080916Po = new DailydiscountBackup080916Po(); 
			dailydiscountBackup080916Po.setChargedate(TimestampUtils.of(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.CHARGEDATE.name()))); 
			dailydiscountBackup080916Po.setExpressid(dataObject.getString(DailydiscountBackup080916Po.COLUMNS.EXPRESSID.name())); 
			dailydiscountBackup080916Po.setChargebox(dataObject.getString(DailydiscountBackup080916Po.COLUMNS.CHARGEBOX.name())); 
			dailydiscountBackup080916Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.EXPORTHWB.name()))); 
			dailydiscountBackup080916Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscountBackup080916Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscountBackup080916Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.EXPORTFEE.name()))); 
			dailydiscountBackup080916Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.IMPORTHWB.name()))); 
			dailydiscountBackup080916Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscountBackup080916Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscountBackup080916Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.IMPORTFEE.name()))); 
			dailydiscountBackup080916Po.setLastupdate(TimestampUtils.of(dataObject.getValue(DailydiscountBackup080916Po.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscountBackup080916Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailydiscountBackup080916Po dailydiscountBackup080916Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.CHARGEDATE.name(), dailydiscountBackup080916Po.getChargedate()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.EXPRESSID.name(), dailydiscountBackup080916Po.getExpressid()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.CHARGEBOX.name(), dailydiscountBackup080916Po.getChargebox()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.EXPORTHWB.name(), dailydiscountBackup080916Po.getExporthwb()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.EXPORTPIECE.name(), dailydiscountBackup080916Po.getExportpiece()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.EXPORTWEIGHT.name(), dailydiscountBackup080916Po.getExportweight()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.EXPORTFEE.name(), dailydiscountBackup080916Po.getExportfee()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.IMPORTHWB.name(), dailydiscountBackup080916Po.getImporthwb()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.IMPORTPIECE.name(), dailydiscountBackup080916Po.getImportpiece()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.IMPORTWEIGHT.name(), dailydiscountBackup080916Po.getImportweight()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.IMPORTFEE.name(), dailydiscountBackup080916Po.getImportfee()); 
			dataObject.setValue(DailydiscountBackup080916Po.COLUMNS.LASTUPDATE.name(), dailydiscountBackup080916Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailydiscountBackup080916Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailydiscountBackup080916Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
