package com.doc.common.dao.impl; 
 
public class DailydiscounttempDAOImpl extends GeneralDAOImpl<DailydiscounttempPo> implements DailydiscounttempDAO { 
	public static final DailydiscounttempDAOImpl INSTANCE = new DailydiscounttempDAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNTTEMP"; 

	public DailydiscounttempDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailydiscounttempPo> CONVERTER = new MapConverter<DailydiscounttempPo>() { 
 
		@Override 
		public DailydiscounttempPo convert(final DataObject dataObject) { 
			final DailydiscounttempPo dailydiscounttempPo = new DailydiscounttempPo(); 
			dailydiscounttempPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailydiscounttempPo.COLUMNS.CHARGEDATE.name()))); 
			dailydiscounttempPo.setExpressid(dataObject.getString(DailydiscounttempPo.COLUMNS.EXPRESSID.name())); 
			dailydiscounttempPo.setChargebox(dataObject.getString(DailydiscounttempPo.COLUMNS.CHARGEBOX.name())); 
			dailydiscounttempPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.EXPORTHWB.name()))); 
			dailydiscounttempPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscounttempPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscounttempPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.EXPORTFEE.name()))); 
			dailydiscounttempPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.IMPORTHWB.name()))); 
			dailydiscounttempPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscounttempPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscounttempPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscounttempPo.COLUMNS.IMPORTFEE.name()))); 
			dailydiscounttempPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailydiscounttempPo.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscounttempPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailydiscounttempPo dailydiscounttempPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.CHARGEDATE.name(), dailydiscounttempPo.getChargedate()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.EXPRESSID.name(), dailydiscounttempPo.getExpressid()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.CHARGEBOX.name(), dailydiscounttempPo.getChargebox()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.EXPORTHWB.name(), dailydiscounttempPo.getExporthwb()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.EXPORTPIECE.name(), dailydiscounttempPo.getExportpiece()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.EXPORTWEIGHT.name(), dailydiscounttempPo.getExportweight()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.EXPORTFEE.name(), dailydiscounttempPo.getExportfee()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.IMPORTHWB.name(), dailydiscounttempPo.getImporthwb()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.IMPORTPIECE.name(), dailydiscounttempPo.getImportpiece()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.IMPORTWEIGHT.name(), dailydiscounttempPo.getImportweight()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.IMPORTFEE.name(), dailydiscounttempPo.getImportfee()); 
			dataObject.setValue(DailydiscounttempPo.COLUMNS.LASTUPDATE.name(), dailydiscounttempPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailydiscounttempPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailydiscounttempPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
