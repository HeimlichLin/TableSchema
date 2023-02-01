package com.doc.common.dao.impl; 
 
public class DailydiscountDAOImpl extends GeneralDAOImpl<DailydiscountPo> implements DailydiscountDAO { 
	public static final DailydiscountDAOImpl INSTANCE = new DailydiscountDAOImpl(); 
	public static final String TABLENAME = "DAILYDISCOUNT"; 

	public DailydiscountDAOImpl() { 
		super(TABLENAME); 
	} 
 
	protected static final MapConverter<DailydiscountPo> CONVERTER = new MapConverter<DailydiscountPo>() { 
 
		@Override 
		public DailydiscountPo convert(final DataObject dataObject) { 
			final DailydiscountPo dailydiscountPo = new DailydiscountPo(); 
			dailydiscountPo.setChargedate(TimestampUtils.of(dataObject.getValue(DailydiscountPo.COLUMNS.CHARGEDATE.name()))); 
			dailydiscountPo.setExpressid(dataObject.getString(DailydiscountPo.COLUMNS.EXPRESSID.name())); 
			dailydiscountPo.setChargebox(dataObject.getString(DailydiscountPo.COLUMNS.CHARGEBOX.name())); 
			dailydiscountPo.setExporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.EXPORTHWB.name()))); 
			dailydiscountPo.setExportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.EXPORTPIECE.name()))); 
			dailydiscountPo.setExportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.EXPORTWEIGHT.name()))); 
			dailydiscountPo.setExportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.EXPORTFEE.name()))); 
			dailydiscountPo.setImporthwb(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.IMPORTHWB.name()))); 
			dailydiscountPo.setImportpiece(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.IMPORTPIECE.name()))); 
			dailydiscountPo.setImportweight(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.IMPORTWEIGHT.name()))); 
			dailydiscountPo.setImportfee(BigDecimalUtils.formObj(dataObject.getValue(DailydiscountPo.COLUMNS.IMPORTFEE.name()))); 
			dailydiscountPo.setLastupdate(TimestampUtils.of(dataObject.getValue(DailydiscountPo.COLUMNS.LASTUPDATE.name()))); 
			return dailydiscountPo; 
		} 
 
		@Override 
		public DataObject toDataObject(final DailydiscountPo dailydiscountPo) { 
			final DataObject dataObject = new DataObject(); 
			dataObject.setValue(DailydiscountPo.COLUMNS.CHARGEDATE.name(), dailydiscountPo.getChargedate()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.EXPRESSID.name(), dailydiscountPo.getExpressid()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.CHARGEBOX.name(), dailydiscountPo.getChargebox()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.EXPORTHWB.name(), dailydiscountPo.getExporthwb()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.EXPORTPIECE.name(), dailydiscountPo.getExportpiece()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.EXPORTWEIGHT.name(), dailydiscountPo.getExportweight()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.EXPORTFEE.name(), dailydiscountPo.getExportfee()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.IMPORTHWB.name(), dailydiscountPo.getImporthwb()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.IMPORTPIECE.name(), dailydiscountPo.getImportpiece()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.IMPORTWEIGHT.name(), dailydiscountPo.getImportweight()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.IMPORTFEE.name(), dailydiscountPo.getImportfee()); 
			dataObject.setValue(DailydiscountPo.COLUMNS.LASTUPDATE.name(), dailydiscountPo.getLastupdate()); 
			return dataObject; 
		} 
 
	}; 
 
	public MapConverter<DailydiscountPo> getConverter() { 
		return CONVERTER; 
	} 
 
	@Override 
	public SqlWhere getPkSqlWhere(DailydiscountPo po) { 
		throw new ApBusinessException("無pk不支援"); 
	} 
 
} 
