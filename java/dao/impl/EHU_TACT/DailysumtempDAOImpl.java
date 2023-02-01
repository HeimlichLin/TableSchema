package com.doc.common.dao.impl; 
 
public class DailysumtempDAOImpl extends GeneralDAOImpl<DailysumtempPo> implements DailysumtempDAO { 
	public static final DailysumtempDAOImpl INSTANCE = new DailysumtempDAOImpl(); 
	public static final String TABLENAME = "DAILYSUMTEMP"; 

	public DailysumtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailysumtempPo> CONVERTER = new MapConverter<DailysumtempPo>() { 
 
		@Override 
		public DailysumtempPo convert(final DataObject dataObject) { 
			final DailysumtempPo dailysumtempPo = new DailysumtempPo(); 
			dailysumtempPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailysumtempPo.COLUMNS.CHARGEDATE.name()))); 
			dailysumtempPo.setChargebox(dataObject.getString(DailysumtempPo.COLUMNS.CHARGEBOX.name())); 
			dailysumtempPo.setAirlineid(dataObject.getString(DailysumtempPo.COLUMNS.AIRLINEID.name())); 
			dailysumtempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.EXPORTHWB.name()))); 
			dailysumtempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.EXPORTPIECE.name()))); 
			dailysumtempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailysumtempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.EXPORTFEE.name()))); 
			dailysumtempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.IMPORTHWB.name()))); 
			dailysumtempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.IMPORTPIECE.name()))); 
			dailysumtempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailysumtempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailysumtempPo.COLUMNS.IMPORTFEE.name()))); 
			dailysumtempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailysumtempPo.COLUMNS.LASTUPDATE.name()))); 
			dailysumtempPo.setFrozen(dataObject.getString(DailysumtempPo.COLUMNS.FROZEN.name())); 
			dailysumtempPo.setExpressid(dataObject.getString(DailysumtempPo.COLUMNS.EXPRESSID.name())); 
			dailysumtempPo.setWorkarea(dataObject.getString(DailysumtempPo.COLUMNS.WORKAREA.name())); 
			return dailysumtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailysumtempPo dailysumtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailysumtempPo.COLUMNS.CHARGEDATE.name(), dailysumtempPo.getChargedate()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.CHARGEBOX.name(), dailysumtempPo.getChargebox()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.AIRLINEID.name(), dailysumtempPo.getAirlineid()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.EXPORTHWB.name(), dailysumtempPo.getExporthwb()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.EXPORTPIECE.name(), dailysumtempPo.getExportpiece()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.EXPORTWEIGHT.name(), dailysumtempPo.getExportweight()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.EXPORTFEE.name(), dailysumtempPo.getExportfee()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.IMPORTHWB.name(), dailysumtempPo.getImporthwb()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.IMPORTPIECE.name(), dailysumtempPo.getImportpiece()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.IMPORTWEIGHT.name(), dailysumtempPo.getImportweight()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.IMPORTFEE.name(), dailysumtempPo.getImportfee()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.LASTUPDATE.name(), dailysumtempPo.getLastupdate()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.FROZEN.name(), dailysumtempPo.getFrozen()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.EXPRESSID.name(), dailysumtempPo.getExpressid()); 
			dataObject.setValue(DailysumtempPo.COLUMNS.WORKAREA.name(), dailysumtempPo.getWorkarea()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailysumtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailysumtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
