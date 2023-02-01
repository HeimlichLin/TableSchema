package com.doc.common.dao.impl; 
 
public class MisDailysumtempDAOImpl extends GeneralDAOImpl<MisDailysumtempPo> implements MisDailysumtempDAO { 
	public static final MisDailysumtempDAOImpl INSTANCE = new MisDailysumtempDAOImpl(); 
	public static final String TABLENAME = "MIS_DAILYSUMTEMP"; 

	public MisDailysumtempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisDailysumtempPo> CONVERTER = new MapConverter<MisDailysumtempPo>() { 
 
		@Override 
		public MisDailysumtempPo convert(final DataObject dataObject) { 
			final MisDailysumtempPo misDailysumtempPo = new MisDailysumtempPo(); 
			misDailysumtempPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisDailysumtempPo.COLUMNS.CHARGEDATE.name()))); 
			misDailysumtempPo.setChargebox(dataObject.getString(MisDailysumtempPo.COLUMNS.CHARGEBOX.name())); 
			misDailysumtempPo.setAirlineid(dataObject.getString(MisDailysumtempPo.COLUMNS.AIRLINEID.name())); 
			misDailysumtempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.EXPORTHWB.name()))); 
			misDailysumtempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.EXPORTPIECE.name()))); 
			misDailysumtempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			misDailysumtempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.EXPORTFEE.name()))); 
			misDailysumtempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.IMPORTHWB.name()))); 
			misDailysumtempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.IMPORTPIECE.name()))); 
			misDailysumtempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			misDailysumtempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumtempPo.COLUMNS.IMPORTFEE.name()))); 
			misDailysumtempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisDailysumtempPo.COLUMNS.LASTUPDATE.name()))); 
			return misDailysumtempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisDailysumtempPo misDailysumtempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.CHARGEDATE.name(), misDailysumtempPo.getChargedate()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.CHARGEBOX.name(), misDailysumtempPo.getChargebox()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.AIRLINEID.name(), misDailysumtempPo.getAirlineid()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.EXPORTHWB.name(), misDailysumtempPo.getExporthwb()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.EXPORTPIECE.name(), misDailysumtempPo.getExportpiece()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.EXPORTWEIGHT.name(), misDailysumtempPo.getExportweight()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.EXPORTFEE.name(), misDailysumtempPo.getExportfee()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.IMPORTHWB.name(), misDailysumtempPo.getImporthwb()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.IMPORTPIECE.name(), misDailysumtempPo.getImportpiece()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.IMPORTWEIGHT.name(), misDailysumtempPo.getImportweight()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.IMPORTFEE.name(), misDailysumtempPo.getImportfee()); 
			dataObject.setValue(MisDailysumtempPo.COLUMNS.LASTUPDATE.name(), misDailysumtempPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisDailysumtempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisDailysumtempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
