package com.doc.common.dao.impl; 
 
public class DailymissumDAOImpl extends GeneralDAOImpl<DailymissumPo> implements DailymissumDAO { 
	public static final DailymissumDAOImpl INSTANCE = new DailymissumDAOImpl(); 
	public static final String TABLENAME = "DAILYMISSUM"; 

	public DailymissumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailymissumPo> CONVERTER = new MapConverter<DailymissumPo>() { 
 
		@Override 
		public DailymissumPo convert(final DataObject dataObject) { 
			final DailymissumPo dailymissumPo = new DailymissumPo(); 
			dailymissumPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailymissumPo.COLUMNS.CHARGEDATE.name()))); 
			dailymissumPo.setChargebox(dataObject.getString(DailymissumPo.COLUMNS.CHARGEBOX.name())); 
			dailymissumPo.setAirlineid(dataObject.getString(DailymissumPo.COLUMNS.AIRLINEID.name())); 
			dailymissumPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.EXPORTHWB.name()))); 
			dailymissumPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.EXPORTPIECE.name()))); 
			dailymissumPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailymissumPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.EXPORTFEE.name()))); 
			dailymissumPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.IMPORTHWB.name()))); 
			dailymissumPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.IMPORTPIECE.name()))); 
			dailymissumPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailymissumPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailymissumPo.COLUMNS.IMPORTFEE.name()))); 
			dailymissumPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailymissumPo.COLUMNS.LASTUPDATE.name()))); 
			return dailymissumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailymissumPo dailymissumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailymissumPo.COLUMNS.CHARGEDATE.name(), dailymissumPo.getChargedate()); 
			dataObject.setValue(DailymissumPo.COLUMNS.CHARGEBOX.name(), dailymissumPo.getChargebox()); 
			dataObject.setValue(DailymissumPo.COLUMNS.AIRLINEID.name(), dailymissumPo.getAirlineid()); 
			dataObject.setValue(DailymissumPo.COLUMNS.EXPORTHWB.name(), dailymissumPo.getExporthwb()); 
			dataObject.setValue(DailymissumPo.COLUMNS.EXPORTPIECE.name(), dailymissumPo.getExportpiece()); 
			dataObject.setValue(DailymissumPo.COLUMNS.EXPORTWEIGHT.name(), dailymissumPo.getExportweight()); 
			dataObject.setValue(DailymissumPo.COLUMNS.EXPORTFEE.name(), dailymissumPo.getExportfee()); 
			dataObject.setValue(DailymissumPo.COLUMNS.IMPORTHWB.name(), dailymissumPo.getImporthwb()); 
			dataObject.setValue(DailymissumPo.COLUMNS.IMPORTPIECE.name(), dailymissumPo.getImportpiece()); 
			dataObject.setValue(DailymissumPo.COLUMNS.IMPORTWEIGHT.name(), dailymissumPo.getImportweight()); 
			dataObject.setValue(DailymissumPo.COLUMNS.IMPORTFEE.name(), dailymissumPo.getImportfee()); 
			dataObject.setValue(DailymissumPo.COLUMNS.LASTUPDATE.name(), dailymissumPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailymissumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailymissumPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
