package com.doc.common.dao.impl; 
 
public class Dailymissumtemp2DAOImpl extends GeneralDAOImpl<Dailymissumtemp2Po> implements Dailymissumtemp2DAO { 
	public static final Dailymissumtemp2DAOImpl INSTANCE = new Dailymissumtemp2DAOImpl(); 
	public static final String TABLENAME = "DAILYMISSUMTEMP2"; 

	public Dailymissumtemp2DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<Dailymissumtemp2Po> CONVERTER = new MapConverter<Dailymissumtemp2Po>() { 
 
		@Override 
		public Dailymissumtemp2Po convert(final DataObject dataObject) { 
			final Dailymissumtemp2Po dailymissumtemp2Po = new Dailymissumtemp2Po(); 
			dailymissumtemp2Po.setChargedate(TimestampUtils.of(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.CHARGEDATE.name()))); 
			dailymissumtemp2Po.setEid(dataObject.getString(Dailymissumtemp2Po.COLUMNS.EID.name())); 
			dailymissumtemp2Po.setChargebox(dataObject.getString(Dailymissumtemp2Po.COLUMNS.CHARGEBOX.name())); 
			dailymissumtemp2Po.setAirlineid(dataObject.getString(Dailymissumtemp2Po.COLUMNS.AIRLINEID.name())); 
			dailymissumtemp2Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.EXPORTHWB.name()))); 
			dailymissumtemp2Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.EXPORTPIECE.name()))); 
			dailymissumtemp2Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailymissumtemp2Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.EXPORTFEE.name()))); 
			dailymissumtemp2Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.IMPORTHWB.name()))); 
			dailymissumtemp2Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.IMPORTPIECE.name()))); 
			dailymissumtemp2Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailymissumtemp2Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.IMPORTFEE.name()))); 
			dailymissumtemp2Po.setLastupdate(TimestampUtils.of(dataObject.getValue(Dailymissumtemp2Po.COLUMNS.LASTUPDATE.name()))); 
			return dailymissumtemp2Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final Dailymissumtemp2Po dailymissumtemp2Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.CHARGEDATE.name(), dailymissumtemp2Po.getChargedate()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.EID.name(), dailymissumtemp2Po.getEid()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.CHARGEBOX.name(), dailymissumtemp2Po.getChargebox()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.AIRLINEID.name(), dailymissumtemp2Po.getAirlineid()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.EXPORTHWB.name(), dailymissumtemp2Po.getExporthwb()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.EXPORTPIECE.name(), dailymissumtemp2Po.getExportpiece()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.EXPORTWEIGHT.name(), dailymissumtemp2Po.getExportweight()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.EXPORTFEE.name(), dailymissumtemp2Po.getExportfee()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.IMPORTHWB.name(), dailymissumtemp2Po.getImporthwb()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.IMPORTPIECE.name(), dailymissumtemp2Po.getImportpiece()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.IMPORTWEIGHT.name(), dailymissumtemp2Po.getImportweight()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.IMPORTFEE.name(), dailymissumtemp2Po.getImportfee()); 
			dataObject.setValue(Dailymissumtemp2Po.COLUMNS.LASTUPDATE.name(), dailymissumtemp2Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<Dailymissumtemp2Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(Dailymissumtemp2Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
