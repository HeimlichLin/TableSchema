package com.doc.common.dao.impl; 
 
public class MisDailysumDAOImpl extends GeneralDAOImpl<MisDailysumPo> implements MisDailysumDAO { 
	public static final MisDailysumDAOImpl INSTANCE = new MisDailysumDAOImpl(); 
	public static final String TABLENAME = "MIS_DAILYSUM"; 

	public MisDailysumDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<MisDailysumPo> CONVERTER = new MapConverter<MisDailysumPo>() { 
 
		@Override 
		public MisDailysumPo convert(final DataObject dataObject) { 
			final MisDailysumPo misDailysumPo = new MisDailysumPo(); 
			misDailysumPo.setChargedate(TimestampUtils.of(dataObject.getValue(MisDailysumPo.COLUMNS.CHARGEDATE.name()))); 
			misDailysumPo.setChargebox(dataObject.getString(MisDailysumPo.COLUMNS.CHARGEBOX.name())); 
			misDailysumPo.setAirlineid(dataObject.getString(MisDailysumPo.COLUMNS.AIRLINEID.name())); 
			misDailysumPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.EXPORTHWB.name()))); 
			misDailysumPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.EXPORTPIECE.name()))); 
			misDailysumPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.EXPORTWEIGHT.name()))); 
			misDailysumPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.EXPORTFEE.name()))); 
			misDailysumPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.IMPORTHWB.name()))); 
			misDailysumPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.IMPORTPIECE.name()))); 
			misDailysumPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.IMPORTWEIGHT.name()))); 
			misDailysumPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(MisDailysumPo.COLUMNS.IMPORTFEE.name()))); 
			misDailysumPo.setLastupdate(TimestampUtils.of(dataObject.getValue(MisDailysumPo.COLUMNS.LASTUPDATE.name()))); 
			return misDailysumPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final MisDailysumPo misDailysumPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(MisDailysumPo.COLUMNS.CHARGEDATE.name(), misDailysumPo.getChargedate()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.CHARGEBOX.name(), misDailysumPo.getChargebox()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.AIRLINEID.name(), misDailysumPo.getAirlineid()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.EXPORTHWB.name(), misDailysumPo.getExporthwb()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.EXPORTPIECE.name(), misDailysumPo.getExportpiece()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.EXPORTWEIGHT.name(), misDailysumPo.getExportweight()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.EXPORTFEE.name(), misDailysumPo.getExportfee()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.IMPORTHWB.name(), misDailysumPo.getImporthwb()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.IMPORTPIECE.name(), misDailysumPo.getImportpiece()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.IMPORTWEIGHT.name(), misDailysumPo.getImportweight()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.IMPORTFEE.name(), misDailysumPo.getImportfee()); 
			dataObject.setValue(MisDailysumPo.COLUMNS.LASTUPDATE.name(), misDailysumPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<MisDailysumPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(MisDailysumPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
