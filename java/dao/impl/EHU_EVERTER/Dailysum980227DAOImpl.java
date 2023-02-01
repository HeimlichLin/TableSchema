package com.doc.common.dao.impl; 
 
public class Dailysum980227DAOImpl extends GeneralDAOImpl<Dailysum980227Po> implements Dailysum980227DAO { 
	public static final Dailysum980227DAOImpl INSTANCE = new Dailysum980227DAOImpl(); 
	public static final String TABLENAME = "DAILYSUM_980227"; 

	public Dailysum980227DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Dailysum980227Po> CONVERTER = new MapConverter<Dailysum980227Po>() { 
 
		@Override 
		public Dailysum980227Po convert(final DataObject dataObject) { 
			final Dailysum980227Po dailysum980227Po = new Dailysum980227Po(); 
			dailysum980227Po.setChargedate(TimestampUtils.of(dataObject.getValue(Dailysum980227Po.COLUMNS.CHARGEDATE.name()))); 
			dailysum980227Po.setChargebox(dataObject.getString(Dailysum980227Po.COLUMNS.CHARGEBOX.name())); 
			dailysum980227Po.setAirlineid(dataObject.getString(Dailysum980227Po.COLUMNS.AIRLINEID.name())); 
			dailysum980227Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.EXPORTHWB.name()))); 
			dailysum980227Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.EXPORTPIECE.name()))); 
			dailysum980227Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysum980227Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.EXPORTFEE.name()))); 
			dailysum980227Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.IMPORTHWB.name()))); 
			dailysum980227Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.IMPORTPIECE.name()))); 
			dailysum980227Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysum980227Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.IMPORTFEE.name()))); 
			dailysum980227Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Dailysum980227Po.COLUMNS.LASTUPDATE.name()))); 
			dailysum980227Po.setImportdiscount(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.IMPORTDISCOUNT.name()))); 
			dailysum980227Po.setExportdiscount(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980227Po.COLUMNS.EXPORTDISCOUNT.name()))); 
			dailysum980227Po.setExpressid(dataObject.getString(Dailysum980227Po.COLUMNS.EXPRESSID.name())); 
			return dailysum980227Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Dailysum980227Po dailysum980227Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.CHARGEDATE.name(), dailysum980227Po.getChargedate()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.CHARGEBOX.name(), dailysum980227Po.getChargebox()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.AIRLINEID.name(), dailysum980227Po.getAirlineid()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPORTHWB.name(), dailysum980227Po.getExporthwb()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPORTPIECE.name(), dailysum980227Po.getExportpiece()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPORTWEIGHT.name(), dailysum980227Po.getExportweight()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPORTFEE.name(), dailysum980227Po.getExportfee()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.IMPORTHWB.name(), dailysum980227Po.getImporthwb()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.IMPORTPIECE.name(), dailysum980227Po.getImportpiece()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.IMPORTWEIGHT.name(), dailysum980227Po.getImportweight()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.IMPORTFEE.name(), dailysum980227Po.getImportfee()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.LASTUPDATE.name(), dailysum980227Po.getLastupdate()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.IMPORTDISCOUNT.name(), dailysum980227Po.getImportdiscount()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPORTDISCOUNT.name(), dailysum980227Po.getExportdiscount()); 
			dataObject.setValue(Dailysum980227Po.COLUMNS.EXPRESSID.name(), dailysum980227Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Dailysum980227Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Dailysum980227Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
