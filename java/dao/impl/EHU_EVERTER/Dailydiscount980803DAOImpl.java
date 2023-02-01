package com.doc.common.dao.impl; 
 
public class Dailydiscount980803DAOImpl extends GeneralDAOImpl<Dailydiscount980803Po> implements Dailydiscount980803DAO { 
	public static final Dailydiscount980803DAOImpl INSTANCE = new Dailydiscount980803DAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNT_980803"; 

	public Dailydiscount980803DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Dailydiscount980803Po> CONVERTER = new MapConverter<Dailydiscount980803Po>() { 
 
		@Override 
		public Dailydiscount980803Po convert(final DataObject dataObject) { 
			final Dailydiscount980803Po dailydiscount980803Po = new Dailydiscount980803Po(); 
			dailydiscount980803Po.setChargedate(TimestampUtils.of(dataObject.getValue(Dailydiscount980803Po.COLUMNS.CHARGEDATE.name()))); 
			dailydiscount980803Po.setExpressid(dataObject.getString(Dailydiscount980803Po.COLUMNS.EXPRESSID.name())); 
			dailydiscount980803Po.setChargebox(dataObject.getString(Dailydiscount980803Po.COLUMNS.CHARGEBOX.name())); 
			dailydiscount980803Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.EXPORTHWB.name()))); 
			dailydiscount980803Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscount980803Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscount980803Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.EXPORTFEE.name()))); 
			dailydiscount980803Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.IMPORTHWB.name()))); 
			dailydiscount980803Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscount980803Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscount980803Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailydiscount980803Po.COLUMNS.IMPORTFEE.name()))); 
			dailydiscount980803Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Dailydiscount980803Po.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscount980803Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Dailydiscount980803Po dailydiscount980803Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.CHARGEDATE.name(), dailydiscount980803Po.getChargedate()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.EXPRESSID.name(), dailydiscount980803Po.getExpressid()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.CHARGEBOX.name(), dailydiscount980803Po.getChargebox()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.EXPORTHWB.name(), dailydiscount980803Po.getExporthwb()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.EXPORTPIECE.name(), dailydiscount980803Po.getExportpiece()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.EXPORTWEIGHT.name(), dailydiscount980803Po.getExportweight()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.EXPORTFEE.name(), dailydiscount980803Po.getExportfee()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.IMPORTHWB.name(), dailydiscount980803Po.getImporthwb()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.IMPORTPIECE.name(), dailydiscount980803Po.getImportpiece()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.IMPORTWEIGHT.name(), dailydiscount980803Po.getImportweight()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.IMPORTFEE.name(), dailydiscount980803Po.getImportfee()); 
			dataObject.setValue(Dailydiscount980803Po.COLUMNS.LASTUPDATE.name(), dailydiscount980803Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Dailydiscount980803Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Dailydiscount980803Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
