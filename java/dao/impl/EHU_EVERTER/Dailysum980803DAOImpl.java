package com.doc.common.dao.impl; 
 
public class Dailysum980803DAOImpl extends GeneralDAOImpl<Dailysum980803Po> implements Dailysum980803DAO { 
	public static final Dailysum980803DAOImpl INSTANCE = new Dailysum980803DAOImpl(); 
	public static final String TABLENAME = "DAILYSUM_980803"; 

	public Dailysum980803DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Dailysum980803Po> CONVERTER = new MapConverter<Dailysum980803Po>() { 
 
		@Override 
		public Dailysum980803Po convert(final DataObject dataObject) { 
			final Dailysum980803Po dailysum980803Po = new Dailysum980803Po(); 
			dailysum980803Po.setChargedate(TimestampUtils.of(dataObject.getValue(Dailysum980803Po.COLUMNS.CHARGEDATE.name()))); 
			dailysum980803Po.setChargebox(dataObject.getString(Dailysum980803Po.COLUMNS.CHARGEBOX.name())); 
			dailysum980803Po.setAirlineid(dataObject.getString(Dailysum980803Po.COLUMNS.AIRLINEID.name())); 
			dailysum980803Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.EXPORTHWB.name()))); 
			dailysum980803Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.EXPORTPIECE.name()))); 
			dailysum980803Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysum980803Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.EXPORTFEE.name()))); 
			dailysum980803Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.IMPORTHWB.name()))); 
			dailysum980803Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.IMPORTPIECE.name()))); 
			dailysum980803Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysum980803Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.IMPORTFEE.name()))); 
			dailysum980803Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Dailysum980803Po.COLUMNS.LASTUPDATE.name()))); 
			dailysum980803Po.setImportdiscount(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.IMPORTDISCOUNT.name()))); 
			dailysum980803Po.setExportdiscount(BigDecimalUtils.formObj(dataObject.getValue(Dailysum980803Po.COLUMNS.EXPORTDISCOUNT.name()))); 
			dailysum980803Po.setExpressid(dataObject.getString(Dailysum980803Po.COLUMNS.EXPRESSID.name())); 
			return dailysum980803Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Dailysum980803Po dailysum980803Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.CHARGEDATE.name(), dailysum980803Po.getChargedate()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.CHARGEBOX.name(), dailysum980803Po.getChargebox()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.AIRLINEID.name(), dailysum980803Po.getAirlineid()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPORTHWB.name(), dailysum980803Po.getExporthwb()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPORTPIECE.name(), dailysum980803Po.getExportpiece()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPORTWEIGHT.name(), dailysum980803Po.getExportweight()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPORTFEE.name(), dailysum980803Po.getExportfee()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.IMPORTHWB.name(), dailysum980803Po.getImporthwb()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.IMPORTPIECE.name(), dailysum980803Po.getImportpiece()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.IMPORTWEIGHT.name(), dailysum980803Po.getImportweight()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.IMPORTFEE.name(), dailysum980803Po.getImportfee()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.LASTUPDATE.name(), dailysum980803Po.getLastupdate()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.IMPORTDISCOUNT.name(), dailysum980803Po.getImportdiscount()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPORTDISCOUNT.name(), dailysum980803Po.getExportdiscount()); 
			dataObject.setValue(Dailysum980803Po.COLUMNS.EXPRESSID.name(), dailysum980803Po.getExpressid()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Dailysum980803Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Dailysum980803Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
