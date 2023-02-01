package com.doc.common.dao.impl; 
 
public class DailywhsumtempDAOImpl extends GeneralDAOImpl<DailywhsumtempPo> implements DailywhsumtempDAO { 
	public static final DailywhsumtempDAOImpl INSTANCE = new DailywhsumtempDAOImpl(); 
	public static final String TABLENAME = "DAILYWHSUMTEMP"; 

	public DailywhsumtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailywhsumtempPo> CONVERTER = new MapConverter<DailywhsumtempPo>() { 
 
		@Override 
		public DailywhsumtempPo convert(final DataObject dataObject) { 
			final DailywhsumtempPo dailywhsumtempPo = new DailywhsumtempPo(); 
			dailywhsumtempPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailywhsumtempPo.COLUMNS.CHARGEDATE.name()))); 
			dailywhsumtempPo.setChargebox(dataObject.getString(DailywhsumtempPo.COLUMNS.CHARGEBOX.name())); 
			dailywhsumtempPo.setAirlineid(dataObject.getString(DailywhsumtempPo.COLUMNS.AIRLINEID.name())); 
			dailywhsumtempPo.setExpressid(dataObject.getString(DailywhsumtempPo.COLUMNS.EXPRESSID.name())); 
			dailywhsumtempPo.setWarehouse(dataObject.getString(DailywhsumtempPo.COLUMNS.WAREHOUSE.name())); 
			dailywhsumtempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.EXPORTHWB.name()))); 
			dailywhsumtempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.EXPORTPIECE.name()))); 
			dailywhsumtempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailywhsumtempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.EXPORTFEE.name()))); 
			dailywhsumtempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.IMPORTHWB.name()))); 
			dailywhsumtempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.IMPORTPIECE.name()))); 
			dailywhsumtempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailywhsumtempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailywhsumtempPo.COLUMNS.IMPORTFEE.name()))); 
			dailywhsumtempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailywhsumtempPo.COLUMNS.LASTUPDATE.name()))); 
			dailywhsumtempPo.setFrozen(dataObject.getString(DailywhsumtempPo.COLUMNS.FROZEN.name())); 
			dailywhsumtempPo.setWorkarea(dataObject.getString(DailywhsumtempPo.COLUMNS.WORKAREA.name())); 
			return dailywhsumtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailywhsumtempPo dailywhsumtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.CHARGEDATE.name(), dailywhsumtempPo.getChargedate()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.CHARGEBOX.name(), dailywhsumtempPo.getChargebox()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.AIRLINEID.name(), dailywhsumtempPo.getAirlineid()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.EXPRESSID.name(), dailywhsumtempPo.getExpressid()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.WAREHOUSE.name(), dailywhsumtempPo.getWarehouse()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.EXPORTHWB.name(), dailywhsumtempPo.getExporthwb()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.EXPORTPIECE.name(), dailywhsumtempPo.getExportpiece()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.EXPORTWEIGHT.name(), dailywhsumtempPo.getExportweight()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.EXPORTFEE.name(), dailywhsumtempPo.getExportfee()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.IMPORTHWB.name(), dailywhsumtempPo.getImporthwb()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.IMPORTPIECE.name(), dailywhsumtempPo.getImportpiece()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.IMPORTWEIGHT.name(), dailywhsumtempPo.getImportweight()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.IMPORTFEE.name(), dailywhsumtempPo.getImportfee()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.LASTUPDATE.name(), dailywhsumtempPo.getLastupdate()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.FROZEN.name(), dailywhsumtempPo.getFrozen()); 
			dataObject.setValue(DailywhsumtempPo.COLUMNS.WORKAREA.name(), dailywhsumtempPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailywhsumtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailywhsumtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
