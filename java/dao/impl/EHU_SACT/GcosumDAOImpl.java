package com.doc.common.dao.impl; 
 
public class GcosumDAOImpl extends GeneralDAOImpl<GcosumPo> implements GcosumDAO { 
	public static final GcosumDAOImpl INSTANCE = new GcosumDAOImpl(); 
	public static final String TABLENAME = "GCOSUM"; 

	public GcosumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<GcosumPo> CONVERTER = new MapConverter<GcosumPo>() { 
 
		@Override 
		public GcosumPo convert(final DataObject dataObject) { 
			final GcosumPo gcosumPo = new GcosumPo(); 
			gcosumPo.setChargedate(TimestampUtils.of(dataObject.getValue(GcosumPo.COLUMNS.CHARGEDATE.name()))); 
			gcosumPo.setChargebox(dataObject.getString(GcosumPo.COLUMNS.CHARGEBOX.name())); 
			gcosumPo.setAirlineid(dataObject.getString(GcosumPo.COLUMNS.AIRLINEID.name())); 
			gcosumPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.EXPORTHWB.name()))); 
			gcosumPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.EXPORTPIECE.name()))); 
			gcosumPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.EXPORTWEIGHT.name()))); 
			gcosumPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.EXPORTFEE.name()))); 
			gcosumPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.IMPORTHWB.name()))); 
			gcosumPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.IMPORTPIECE.name()))); 
			gcosumPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.IMPORTWEIGHT.name()))); 
			gcosumPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(GcosumPo.COLUMNS.IMPORTFEE.name()))); 
			gcosumPo.setLastupdate(TimestampUtils.of(dataObject.getValue(GcosumPo.COLUMNS.LASTUPDATE.name()))); 
			return gcosumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final GcosumPo gcosumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(GcosumPo.COLUMNS.CHARGEDATE.name(), gcosumPo.getChargedate()); 
			dataObject.setValue(GcosumPo.COLUMNS.CHARGEBOX.name(), gcosumPo.getChargebox()); 
			dataObject.setValue(GcosumPo.COLUMNS.AIRLINEID.name(), gcosumPo.getAirlineid()); 
			dataObject.setValue(GcosumPo.COLUMNS.EXPORTHWB.name(), gcosumPo.getExporthwb()); 
			dataObject.setValue(GcosumPo.COLUMNS.EXPORTPIECE.name(), gcosumPo.getExportpiece()); 
			dataObject.setValue(GcosumPo.COLUMNS.EXPORTWEIGHT.name(), gcosumPo.getExportweight()); 
			dataObject.setValue(GcosumPo.COLUMNS.EXPORTFEE.name(), gcosumPo.getExportfee()); 
			dataObject.setValue(GcosumPo.COLUMNS.IMPORTHWB.name(), gcosumPo.getImporthwb()); 
			dataObject.setValue(GcosumPo.COLUMNS.IMPORTPIECE.name(), gcosumPo.getImportpiece()); 
			dataObject.setValue(GcosumPo.COLUMNS.IMPORTWEIGHT.name(), gcosumPo.getImportweight()); 
			dataObject.setValue(GcosumPo.COLUMNS.IMPORTFEE.name(), gcosumPo.getImportfee()); 
			dataObject.setValue(GcosumPo.COLUMNS.LASTUPDATE.name(), gcosumPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<GcosumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(GcosumPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
