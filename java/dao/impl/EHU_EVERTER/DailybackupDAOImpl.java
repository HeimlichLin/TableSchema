package com.doc.common.dao.impl; 
 
public class DailybackupDAOImpl extends GeneralDAOImpl<DailybackupPo> implements DailybackupDAO { 
	public static final DailybackupDAOImpl INSTANCE = new DailybackupDAOImpl(); 
	public static final String TABLENAME = "DAILYBACKUP"; 

	public DailybackupDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailybackupPo> CONVERTER = new MapConverter<DailybackupPo>() { 
 
		@Override 
		public DailybackupPo convert(final DataObject dataObject) { 
			final DailybackupPo dailybackupPo = new DailybackupPo(); 
			dailybackupPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailybackupPo.COLUMNS.CHARGEDATE.name()))); 
			dailybackupPo.setChargebox(dataObject.getString(DailybackupPo.COLUMNS.CHARGEBOX.name())); 
			dailybackupPo.setAirlineid(dataObject.getString(DailybackupPo.COLUMNS.AIRLINEID.name())); 
			dailybackupPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.EXPORTHWB.name()))); 
			dailybackupPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.EXPORTPIECE.name()))); 
			dailybackupPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailybackupPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.EXPORTFEE.name()))); 
			dailybackupPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.IMPORTHWB.name()))); 
			dailybackupPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.IMPORTPIECE.name()))); 
			dailybackupPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailybackupPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailybackupPo.COLUMNS.IMPORTFEE.name()))); 
			return dailybackupPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailybackupPo dailybackupPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailybackupPo.COLUMNS.CHARGEDATE.name(), dailybackupPo.getChargedate()); 
			dataObject.setValue(DailybackupPo.COLUMNS.CHARGEBOX.name(), dailybackupPo.getChargebox()); 
			dataObject.setValue(DailybackupPo.COLUMNS.AIRLINEID.name(), dailybackupPo.getAirlineid()); 
			dataObject.setValue(DailybackupPo.COLUMNS.EXPORTHWB.name(), dailybackupPo.getExporthwb()); 
			dataObject.setValue(DailybackupPo.COLUMNS.EXPORTPIECE.name(), dailybackupPo.getExportpiece()); 
			dataObject.setValue(DailybackupPo.COLUMNS.EXPORTWEIGHT.name(), dailybackupPo.getExportweight()); 
			dataObject.setValue(DailybackupPo.COLUMNS.EXPORTFEE.name(), dailybackupPo.getExportfee()); 
			dataObject.setValue(DailybackupPo.COLUMNS.IMPORTHWB.name(), dailybackupPo.getImporthwb()); 
			dataObject.setValue(DailybackupPo.COLUMNS.IMPORTPIECE.name(), dailybackupPo.getImportpiece()); 
			dataObject.setValue(DailybackupPo.COLUMNS.IMPORTWEIGHT.name(), dailybackupPo.getImportweight()); 
			dataObject.setValue(DailybackupPo.COLUMNS.IMPORTFEE.name(), dailybackupPo.getImportfee()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailybackupPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailybackupPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
