package com.doc.common.dao.impl; 
 
public class DailysumB494DAOImpl extends GeneralDAOImpl<DailysumB494Po> implements DailysumB494DAO { 
	public static final DailysumB494DAOImpl INSTANCE = new DailysumB494DAOImpl(); 
	public static final String TABLENAME = "DAILYSUM_B4_94"; 

	public DailysumB494DAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailysumB494Po> CONVERTER = new MapConverter<DailysumB494Po>() { 
 
		@Override 
		public DailysumB494Po convert(final DataObject dataObject) { 
			final DailysumB494Po dailysumB494Po = new DailysumB494Po(); 
			dailysumB494Po.setChargedate(TimestampUtils.of(dataObject.getValue(DailysumB494Po.COLUMNS.CHARGEDATE.name()))); 
			dailysumB494Po.setChargebox(dataObject.getString(DailysumB494Po.COLUMNS.CHARGEBOX.name())); 
			dailysumB494Po.setAirlineid(dataObject.getString(DailysumB494Po.COLUMNS.AIRLINEID.name())); 
			dailysumB494Po.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.EXPORTHWB.name()))); 
			dailysumB494Po.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.EXPORTPIECE.name()))); 
			dailysumB494Po.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysumB494Po.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.EXPORTFEE.name()))); 
			dailysumB494Po.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.IMPORTHWB.name()))); 
			dailysumB494Po.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.IMPORTPIECE.name()))); 
			dailysumB494Po.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysumB494Po.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumB494Po.COLUMNS.IMPORTFEE.name()))); 
			dailysumB494Po.setLastupdate(TimestampUtils.of(dataObject.getValue(DailysumB494Po.COLUMNS.LASTUPDATE.name()))); 
			return dailysumB494Po; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailysumB494Po dailysumB494Po) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailysumB494Po.COLUMNS.CHARGEDATE.name(), dailysumB494Po.getChargedate()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.CHARGEBOX.name(), dailysumB494Po.getChargebox()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.AIRLINEID.name(), dailysumB494Po.getAirlineid()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.EXPORTHWB.name(), dailysumB494Po.getExporthwb()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.EXPORTPIECE.name(), dailysumB494Po.getExportpiece()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.EXPORTWEIGHT.name(), dailysumB494Po.getExportweight()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.EXPORTFEE.name(), dailysumB494Po.getExportfee()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.IMPORTHWB.name(), dailysumB494Po.getImporthwb()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.IMPORTPIECE.name(), dailysumB494Po.getImportpiece()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.IMPORTWEIGHT.name(), dailysumB494Po.getImportweight()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.IMPORTFEE.name(), dailysumB494Po.getImportfee()); 
			dataObject.setValue(DailysumB494Po.COLUMNS.LASTUPDATE.name(), dailysumB494Po.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailysumB494Po> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailysumB494Po po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
