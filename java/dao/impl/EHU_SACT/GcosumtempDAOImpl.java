package com.doc.common.dao.impl; 
 
public class GcosumtempDAOImpl extends GeneralDAOImpl<GcosumtempPo> implements GcosumtempDAO { 
	public static final GcosumtempDAOImpl INSTANCE = new GcosumtempDAOImpl(); 
	public static final String TABLENAME = "GCOSUMTEMP"; 

	public GcosumtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcosumtempPo> CONVERTER = new MapConverter<GcosumtempPo>() { 
 
		@Override 
		public GcosumtempPo convert(final DataObject dataObject) { 
			final GcosumtempPo gcosumtempPo = new GcosumtempPo(); 
			gcosumtempPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcosumtempPo.COLUMNS.CHARGEDATE.name()))); 
			gcosumtempPo.setChargebox(dataObject.getString(GcosumtempPo.COLUMNS.CHARGEBOX.name())); 
			gcosumtempPo.setAirlineid(dataObject.getString(GcosumtempPo.COLUMNS.AIRLINEID.name())); 
			gcosumtempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.EXPORTHWB.name()))); 
			gcosumtempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.EXPORTPIECE.name()))); 
			gcosumtempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			gcosumtempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.EXPORTFEE.name()))); 
			gcosumtempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.IMPORTHWB.name()))); 
			gcosumtempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.IMPORTPIECE.name()))); 
			gcosumtempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			gcosumtempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(GcosumtempPo.COLUMNS.IMPORTFEE.name()))); 
			gcosumtempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcosumtempPo.COLUMNS.LASTUPDATE.name()))); 
			return gcosumtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcosumtempPo gcosumtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcosumtempPo.COLUMNS.CHARGEDATE.name(), gcosumtempPo.getChargedate()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.CHARGEBOX.name(), gcosumtempPo.getChargebox()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.AIRLINEID.name(), gcosumtempPo.getAirlineid()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.EXPORTHWB.name(), gcosumtempPo.getExporthwb()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.EXPORTPIECE.name(), gcosumtempPo.getExportpiece()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.EXPORTWEIGHT.name(), gcosumtempPo.getExportweight()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.EXPORTFEE.name(), gcosumtempPo.getExportfee()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.IMPORTHWB.name(), gcosumtempPo.getImporthwb()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.IMPORTPIECE.name(), gcosumtempPo.getImportpiece()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.IMPORTWEIGHT.name(), gcosumtempPo.getImportweight()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.IMPORTFEE.name(), gcosumtempPo.getImportfee()); 
			dataObject.setValue(GcosumtempPo.COLUMNS.LASTUPDATE.name(), gcosumtempPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcosumtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcosumtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
