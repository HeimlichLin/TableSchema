package com.doc.common.dao.impl; 
 
public class DailysumDAOImpl extends GeneralDAOImpl<DailysumPo> implements DailysumDAO { 
	public static final DailysumDAOImpl INSTANCE = new DailysumDAOImpl(); 
	public static final String TABLENAME = "DAILYSUM"; 

	public DailysumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailysumPo> CONVERTER = new MapConverter<DailysumPo>() { 
 
		@Override 
		public DailysumPo convert(final DataObject dataObject) { 
			final DailysumPo dailysumPo = new DailysumPo(); 
			dailysumPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailysumPo.COLUMNS.CHARGEDATE.name()))); 
			dailysumPo.setChargebox(dataObject.getString(DailysumPo.COLUMNS.CHARGEBOX.name())); 
			dailysumPo.setAirlineid(dataObject.getString(DailysumPo.COLUMNS.AIRLINEID.name())); 
			dailysumPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.EXPORTHWB.name()))); 
			dailysumPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.EXPORTPIECE.name()))); 
			dailysumPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysumPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.EXPORTFEE.name()))); 
			dailysumPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.IMPORTHWB.name()))); 
			dailysumPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.IMPORTPIECE.name()))); 
			dailysumPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysumPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumPo.COLUMNS.IMPORTFEE.name()))); 
			dailysumPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailysumPo.COLUMNS.LASTUPDATE.name()))); 
			return dailysumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailysumPo dailysumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailysumPo.COLUMNS.CHARGEDATE.name(), dailysumPo.getChargedate()); 
			dataObject.setValue(DailysumPo.COLUMNS.CHARGEBOX.name(), dailysumPo.getChargebox()); 
			dataObject.setValue(DailysumPo.COLUMNS.AIRLINEID.name(), dailysumPo.getAirlineid()); 
			dataObject.setValue(DailysumPo.COLUMNS.EXPORTHWB.name(), dailysumPo.getExporthwb()); 
			dataObject.setValue(DailysumPo.COLUMNS.EXPORTPIECE.name(), dailysumPo.getExportpiece()); 
			dataObject.setValue(DailysumPo.COLUMNS.EXPORTWEIGHT.name(), dailysumPo.getExportweight()); 
			dataObject.setValue(DailysumPo.COLUMNS.EXPORTFEE.name(), dailysumPo.getExportfee()); 
			dataObject.setValue(DailysumPo.COLUMNS.IMPORTHWB.name(), dailysumPo.getImporthwb()); 
			dataObject.setValue(DailysumPo.COLUMNS.IMPORTPIECE.name(), dailysumPo.getImportpiece()); 
			dataObject.setValue(DailysumPo.COLUMNS.IMPORTWEIGHT.name(), dailysumPo.getImportweight()); 
			dataObject.setValue(DailysumPo.COLUMNS.IMPORTFEE.name(), dailysumPo.getImportfee()); 
			dataObject.setValue(DailysumPo.COLUMNS.LASTUPDATE.name(), dailysumPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailysumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailysumPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
