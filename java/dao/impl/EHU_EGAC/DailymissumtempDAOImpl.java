package com.doc.common.dao.impl; 
 
public class DailymissumtempDAOImpl extends GeneralDAOImpl<DailymissumtempPo> implements DailymissumtempDAO { 
	public static final DailymissumtempDAOImpl INSTANCE = new DailymissumtempDAOImpl(); 
	public static final String TABLENAME = "DAILYMISSUMTEMP"; 

	public DailymissumtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailymissumtempPo> CONVERTER = new MapConverter<DailymissumtempPo>() { 
 
		@Override 
		public DailymissumtempPo convert(final DataObject dataObject) { 
			final DailymissumtempPo dailymissumtempPo = new DailymissumtempPo(); 
			dailymissumtempPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailymissumtempPo.COLUMNS.CHARGEDATE.name()))); 
			dailymissumtempPo.setChargebox(dataObject.getString(DailymissumtempPo.COLUMNS.CHARGEBOX.name())); 
			dailymissumtempPo.setAirlineid(dataObject.getString(DailymissumtempPo.COLUMNS.AIRLINEID.name())); 
			dailymissumtempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.EXPORTHWB.name()))); 
			dailymissumtempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.EXPORTPIECE.name()))); 
			dailymissumtempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailymissumtempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.EXPORTFEE.name()))); 
			dailymissumtempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.IMPORTHWB.name()))); 
			dailymissumtempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.IMPORTPIECE.name()))); 
			dailymissumtempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailymissumtempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailymissumtempPo.COLUMNS.IMPORTFEE.name()))); 
			dailymissumtempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailymissumtempPo.COLUMNS.LASTUPDATE.name()))); 
			return dailymissumtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailymissumtempPo dailymissumtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.CHARGEDATE.name(), dailymissumtempPo.getChargedate()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.CHARGEBOX.name(), dailymissumtempPo.getChargebox()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.AIRLINEID.name(), dailymissumtempPo.getAirlineid()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.EXPORTHWB.name(), dailymissumtempPo.getExporthwb()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.EXPORTPIECE.name(), dailymissumtempPo.getExportpiece()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.EXPORTWEIGHT.name(), dailymissumtempPo.getExportweight()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.EXPORTFEE.name(), dailymissumtempPo.getExportfee()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.IMPORTHWB.name(), dailymissumtempPo.getImporthwb()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.IMPORTPIECE.name(), dailymissumtempPo.getImportpiece()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.IMPORTWEIGHT.name(), dailymissumtempPo.getImportweight()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.IMPORTFEE.name(), dailymissumtempPo.getImportfee()); 
			dataObject.setValue(DailymissumtempPo.COLUMNS.LASTUPDATE.name(), dailymissumtempPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailymissumtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailymissumtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
