package com.doc.common.dao.impl; 
 
public class DailywhsumDAOImpl extends GeneralDAOImpl<DailywhsumPo> implements DailywhsumDAO { 
	public static final DailywhsumDAOImpl INSTANCE = new DailywhsumDAOImpl(); 
	public static final String TABLENAME = "DAILYWHSUM"; 

	public DailywhsumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailywhsumPo> CONVERTER = new MapConverter<DailywhsumPo>() { 
 
		@Override 
		public DailywhsumPo convert(final DataObject dataObject) { 
			final DailywhsumPo dailywhsumPo = new DailywhsumPo(); 
			dailywhsumPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailywhsumPo.COLUMNS.CHARGEDATE.name()))); 
			dailywhsumPo.setChargebox(dataObject.getString(DailywhsumPo.COLUMNS.CHARGEBOX.name())); 
			dailywhsumPo.setAirlineid(dataObject.getString(DailywhsumPo.COLUMNS.AIRLINEID.name())); 
			dailywhsumPo.setExpressid(dataObject.getString(DailywhsumPo.COLUMNS.EXPRESSID.name())); 
			dailywhsumPo.setWarehouse(dataObject.getString(DailywhsumPo.COLUMNS.WAREHOUSE.name())); 
			dailywhsumPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.EXPORTHWB.name()))); 
			dailywhsumPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.EXPORTPIECE.name()))); 
			dailywhsumPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailywhsumPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.EXPORTFEE.name()))); 
			dailywhsumPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.IMPORTHWB.name()))); 
			dailywhsumPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.IMPORTPIECE.name()))); 
			dailywhsumPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailywhsumPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumPo.COLUMNS.IMPORTFEE.name()))); 
			dailywhsumPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailywhsumPo.COLUMNS.LASTUPDATE.name()))); 
			dailywhsumPo.setFrozen(dataObject.getString(DailywhsumPo.COLUMNS.FROZEN.name())); 
			dailywhsumPo.setWorkarea(dataObject.getString(DailywhsumPo.COLUMNS.WORKAREA.name())); 
			return dailywhsumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailywhsumPo dailywhsumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailywhsumPo.COLUMNS.CHARGEDATE.name(), dailywhsumPo.getChargedate()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.CHARGEBOX.name(), dailywhsumPo.getChargebox()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.AIRLINEID.name(), dailywhsumPo.getAirlineid()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.EXPRESSID.name(), dailywhsumPo.getExpressid()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.WAREHOUSE.name(), dailywhsumPo.getWarehouse()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.EXPORTHWB.name(), dailywhsumPo.getExporthwb()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.EXPORTPIECE.name(), dailywhsumPo.getExportpiece()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.EXPORTWEIGHT.name(), dailywhsumPo.getExportweight()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.EXPORTFEE.name(), dailywhsumPo.getExportfee()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.IMPORTHWB.name(), dailywhsumPo.getImporthwb()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.IMPORTPIECE.name(), dailywhsumPo.getImportpiece()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.IMPORTWEIGHT.name(), dailywhsumPo.getImportweight()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.IMPORTFEE.name(), dailywhsumPo.getImportfee()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.LASTUPDATE.name(), dailywhsumPo.getLastupdate()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.FROZEN.name(), dailywhsumPo.getFrozen()); 
			dataObject.setValue(DailywhsumPo.COLUMNS.WORKAREA.name(), dailywhsumPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailywhsumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailywhsumPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
